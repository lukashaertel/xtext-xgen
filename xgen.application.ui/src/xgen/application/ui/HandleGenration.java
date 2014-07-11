package xgen.application.ui;

import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

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
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
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
import xgen.postprocess.PostProcessors;
import xgen.ui.internal.ApplicationActivator;

import com.google.inject.Injector;

public class HandleGenration extends AbstractHandler {

	public static Resource getXTextResource(IResource file) {
		Injector i = ApplicationActivator.getInstance().getInjector(
				ApplicationActivator.XGEN_APPLICATION);
		IResourceSetProvider resourceSetProvider = i
				.getInstance(IResourceSetProvider.class);

		URI uri = URI.createURI("platform:/resource/"
				+ file.getProject().getName() + "/"
				+ file.getProjectRelativePath());
		ResourceSet set = resourceSetProvider.get(file.getProject());

		return set.getResource(uri, true);
	}

	public static void job(String jobName,
			Function<IProgressMonitor, IStatus> def) {
		Job j = new Job(jobName) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				return def.apply(monitor);
			}
		};
		j.setPriority(Job.INTERACTIVE);
		j.schedule();
	}

	public static long MAX_ITERATIONS = 10000;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Get editor
		IEditorPart e = HandlerUtil.getActiveEditor(event);

		// If editor is an XText editor, procede with it
		if (e instanceof XtextEditor) {
			XtextEditor xe = (XtextEditor) e;

			// If editor is not for xgen application specifications, cancel
			if (!ApplicationActivator.XGEN_APPLICATION.equals(xe
					.getLanguageName()))
				return false;

			job("Generating tests", p -> generate(p, xe));
		}
		return true;
	}

	private IStatus generate(IProgressMonitor progressMonitor,
			XtextEditor editor) {
		progressMonitor.beginTask("Loading and resolving models", 2);
		// Get resource
		Resource r = getXTextResource(editor.getResource());
		progressMonitor.worked(1);

		// Resolve resource
		EcoreUtil.resolveAll(r);
		progressMonitor.worked(1);

		try {
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
						String ext = apply.getExt() != null ? apply.getExt()
								: "txt";

						// Get grammar
						Grammar grammar = Rewriting.getEffectiveGrammar(apply);

						// Get first non-lexical definition
						Definition start = null;
						for (Definition def : grammar.getDefinitions())
							if (start == null && !def.isLexical())
								start = def;

						// If no non-lexical go to next application
						if (start == null)
							continue;

						// Iterate the grammar
						Iteration iteration = new Iteration(grammar);
						Index<Node> function = FSMLPP.fsmlPP.postProcess(null,
								iteration.iterate(start));

						// Build maximum for indexing
						long d = Math.min(MAX_ITERATIONS, function.getBound()
								.orElse(MAX_ITERATIONS));

						progressMonitor.beginTask("Generating the data",
								(int) d * 2);
						// Iterate
						for (long x = 0; x < d; x++) {
							if (progressMonitor.isCanceled())
								return Status.CANCEL_STATUS;

							// Get node
							Optional<Node> optNode = function.get(x);

							// If it exists
							if (optNode.isPresent()) {
								Node node = optNode.get();

								// Make file for it and fill its contents
								IFile itemFile = dataFolder.getFile(x + "."
										+ ext);
								if (itemFile.exists())
									itemFile.delete(IResource.NONE, null);
								itemFile.create(
										new StringInputStream(node.flatten(
												Setting.DEFAULT_SETTING, false)),
										true, null);
							}

							progressMonitor.worked(1);
						}

					}
				}

		} catch (CoreException e) {
			return Status.CANCEL_STATUS;
		}
		return Status.OK_STATUS;

	}
}
