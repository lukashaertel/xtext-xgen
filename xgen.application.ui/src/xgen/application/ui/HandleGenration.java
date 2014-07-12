package xgen.application.ui;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.stream.Stream;

import org.apache.log4j.NDC;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.util.StringInputStream;

import xgen.Rewriting;
import xgen.application.Apply;
import xgen.application.Model;
import xgen.generate.Iteration;
import xgen.generator.pp.FSMLPP;
import xgen.grammar.Definition;
import xgen.grammar.Grammar;
import xgen.index.Index;
import xgen.parsetree.Node;
import xgen.parsetree.Pair;
import xgen.parsetree.Setting;
import xgen.ui.internal.ApplicationActivator;

import com.google.inject.Injector;

public class HandleGenration extends AbstractHandler {

	protected static final String USED_CHARSET = "UTF-8";
	protected static final long MAX_ITERATIONS = 1000;

	public static Resource getXTextResource(IResource file) {
		Injector i = ApplicationActivator.getInstance().getInjector(ApplicationActivator.XGEN_APPLICATION);
		IResourceSetProvider resourceSetProvider = i.getInstance(IResourceSetProvider.class);

		URI uri = URI.createURI("platform:/resource/" + file.getProject().getName() + "/"
				+ file.getProjectRelativePath());
		ResourceSet set = resourceSetProvider.get(file.getProject());

		return set.getResource(uri, true);
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
		// Get editor
		IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);

		// If editor is an XText editor, procede with it
		if (activeEditor instanceof XtextEditor) {
			XtextEditor editor = (XtextEditor) activeEditor;

			// If editor is not for xgen application specifications, cancel
			if (!ApplicationActivator.XGEN_APPLICATION.equals(editor.getLanguageName()))
				return false;

			boolean dry = "xgen.application.ui.generateTestsDry".equals(event.getCommand().getId());

			Job job = new Job("Generating tests") {

				@Override
				protected IStatus run(IProgressMonitor monitor) {
					monitor.beginTask("Loading and resolving models", 2);
					// Get resource
					Resource r = getXTextResource(editor.getResource());
					monitor.worked(1);

					// Resolve resource
					EcoreUtil.resolveAll(r);
					monitor.worked(1);

					AtomicLong rewriteTime = new AtomicLong(0);
					AtomicLong iterateTime = new AtomicLong(0);
					AtomicLong postprocessTime = new AtomicLong(0);
					AtomicLong flatteningTime = new AtomicLong(0);
					AtomicLong serializationTime = new AtomicLong(0);

					AtomicLong generatedItems = new AtomicLong(0);
					AtomicLong generatedBytes = new AtomicLong(0);

					try {
						AtomicLong totalTime = new AtomicLong(0);
						totalTime.getAndAdd(-System.nanoTime());

						// Generate folder for tests
						IFolder parentFolder = (IFolder) editor.getResource().getParent();
						IFolder dataFolder = parentFolder.getFolder("data");
						if (dataFolder.exists())
							dataFolder.delete(IResource.NONE, null);
						dataFolder.create(IResource.NONE, true, null);

						// Iterate all models
						for (EObject content : r.getContents())
							if (content instanceof Model) {
								Model model = (Model) content;
								// Iterate all applications
								for (Apply apply : model.getApplications()) {
									// Find an extension for the data
									String ext = apply.getExt() != null ? apply.getExt() : "txt";

									// Get grammar
									rewriteTime.getAndAdd(-System.nanoTime());
									Grammar grammar = Rewriting.getEffectiveGrammar(apply);
									rewriteTime.getAndAdd(System.nanoTime());

									// Get first non-lexical definition
									Definition start = null;
									for (Definition def : grammar.getDefinitions())
										if (start == null && !def.isLexical())
											start = def;

									// If no non-lexical go to next application
									if (start == null)
										continue;

									// Iterate the grammar
									iterateTime.getAndAdd(-System.nanoTime());
									Iteration iteration = new Iteration(grammar);
									Index<Node> iterated = iteration.iterate(start);
									iterateTime.getAndAdd(System.nanoTime());

									// Postprocess
									postprocessTime.getAndAdd(-System.nanoTime());
									Index<Node> function = iterated;//FSMLPP.fsmlPP.postProcess(null, iteration.iterate(start));
									postprocessTime.getAndAdd(System.nanoTime());

									// Build maximum for indexing
									long d = function.getBound().orElse(MAX_ITERATIONS);
									long a = 1;
									monitor.beginTask("Generating the data", (int) (d / a));

									// Iterate
									for (long x = 0; x < d; x++) {
										if (monitor.isCanceled())
											break;

										// Get node
										Optional<Node> optNode = function.get(x);

										// If it exists
										if (optNode.isPresent()) {
											generatedItems.incrementAndGet();

											Node node = optNode.get();

											flatteningTime.getAndAdd(-System.nanoTime());
											byte[] nodeText = node.flatten(Setting.DEFAULT_SETTING, false).getBytes();
											flatteningTime.getAndAdd(System.nanoTime());

											generatedBytes.getAndAdd(nodeText.length);

											if (!dry) {
												// Make file for it and fill its
												// contents
												IFile itemFile = dataFolder.getFile(x + "." + ext);
												if (itemFile.exists())
													itemFile.delete(IResource.NONE, null);

												serializationTime.getAndAdd(-System.nanoTime());
												itemFile.create(new ByteArrayInputStream(nodeText), IResource.FORCE
														| IResource.DERIVED, null);
												itemFile.setCharset(USED_CHARSET, null);
												serializationTime.getAndAdd(System.nanoTime());
											}
										}

										if (x % a == 0)
											monitor.worked(1);
									}
								}
							}

						totalTime.getAndAdd(System.nanoTime());

						// Build metrics
						StringBuilder metrics = new StringBuilder();

						metrics.append("Total time: ");
						appendTime(metrics, totalTime.get());
						metrics.append("\r\n");

						metrics.append("Generated items: ");
						metrics.append(generatedItems.get());
						metrics.append("\r\n");

						metrics.append("Generated bytes: ");
						appendBytes(metrics, generatedBytes.get());
						if (dry)
							metrics.append(" (dry run)");
						metrics.append("\r\n");

						metrics.append("Rewrite time: ");
						appendTime(metrics, rewriteTime.get());
						metrics.append("\r\n");

						metrics.append("Iterate time: ");
						appendTime(metrics, iterateTime.get());
						metrics.append("\r\n");

						metrics.append("Postprocess time: ");
						appendTime(metrics, postprocessTime.get());
						metrics.append("\r\n");

						metrics.append("Flattening time: ");
						appendTime(metrics, flatteningTime.get());
						metrics.append("\r\n");

						metrics.append("Serialization time: ");
						appendTime(metrics, serializationTime.get());
						metrics.append("\r\n");

						// Append the configuration if possible
						if (editor.getResource() instanceof IFile) {
							metrics.append("Configuration: ");
							metrics.append("\r\n");
							IFile confFile = ((IFile) editor.getResource());

							BufferedReader confStream = new BufferedReader(new InputStreamReader(
									confFile.getContents(), confFile.getCharset()));

							String line;
							while ((line = confStream.readLine()) != null) {
								metrics.append(line);
								metrics.append("\r\n");
							}
						}

						// Save the metrics
						IFile metricFile = dataFolder.getFile("Metrics.txt");
						if (metricFile.exists())
							metricFile.delete(IResource.NONE, null);

						metricFile.create(new ByteArrayInputStream(metrics.toString().getBytes(USED_CHARSET)),
								IResource.FORCE | IResource.DERIVED, null);
						metricFile.setCharset(USED_CHARSET, null);

						// Try to open it
						PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
							@Override
							public void run() {
								try {
									IDE.openEditor(workbenchWindow.getActivePage(), metricFile);
								} catch (PartInitException ignored) {
								}
							};

						});
					} catch (IOException | CoreException e) {
						return Status.CANCEL_STATUS;
					}

					return Status.OK_STATUS;

				}
			};
			job.setUser(true);
			job.setPriority(Job.LONG);
			job.schedule();
			// job("Generating tests", p -> generate(p, w, xe, dry));
		}
		return true;
	}

	private static double round(double d, double decs) {
		return Math.round(d * decs) / decs;
	}

	private static void appendTime(StringBuilder b, long l) {
		double decs = 10;
		double val;
		String suffix;

		if (l < 1e3) {
			val = round(l / 1e0, decs);
			suffix = "ns";
		} else if (l < 1e6) {
			val = round(l / 1e3, decs);
			suffix = "µs";
		} else if (l < 1e9) {
			val = round(l / 1e6, decs);
			suffix = "ms";
		} else {
			val = round(l / 1e9, decs);
			suffix = "s";
		}

		b.append(val);
		b.append(suffix);
	}

	private static void appendBytes(StringBuilder b, long l) {
		double decs = 1000;
		double val;
		String suffix;

		if (l < 1024.0) {
			val = round(l / 1, decs);
			suffix = "b";
		} else if (l < 1024.0) {
			val = round(l / 1024.0, decs);
			suffix = "kb";
		} else if (l < 1024.0 * 1024.0) {
			val = round(l / 1024.0 / 1024.0, decs);
			suffix = "mb";
		} else {
			val = round(l / 1024.0 / 1024.0 / 1024.0, decs);
			suffix = "gb";
		}

		b.append(val);
		b.append(suffix);
	}
}
