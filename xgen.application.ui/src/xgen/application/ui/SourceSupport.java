package xgen.application.ui;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.*;
import org.eclipse.jdt.core.*;
import org.eclipse.jdt.launching.*;

import com.google.common.collect.Lists;

public class SourceSupport {

	public static Class<?> getClass(ClassLoader current, String name)
			throws ClassNotFoundException, CoreException {
		return getClass(current, name, null);
	}

	public static Class<?> getClass(ClassLoader current, String name,
			List<ClassLoader> wasNotIn) throws CoreException,
			ClassNotFoundException {
		List<ClassLoader> classLoaders = null;

		// Reset class loaders
		classLoaders = Lists.newArrayList();

		// Iterate all projects
		for (IProject project : ResourcesPlugin.getWorkspace().getRoot()
				.getProjects()) {
			// Skip closed projects
			if (!project.isOpen())
				continue;

			// Convert to a Java project
			IJavaProject javaProject = JavaCore.create(project);

			// Store a set of URLs
			List<URL> urls = Lists.newArrayList();
			for (String entry : JavaRuntime
					.computeDefaultRuntimeClassPath(javaProject)) {

				// Add the class path entry as an URL
				try {
					urls.add(new Path(entry).toFile().toURI().toURL());
				} catch (MalformedURLException u) {
					// This should not happen as we use an API
					throw new RuntimeException(
							"API error, URL returned was malformed", u);
				}
			}
			// Add an URL class loader for the URLs found
			classLoaders.add(new URLClassLoader(urls.toArray(new URL[urls
					.size()]), current));
		}

		// Iterate all initialized class loaders
		for (ClassLoader c : classLoaders) {
			try {
				// Try to return a class in this loader
				return c.loadClass(name);
			} catch (ClassNotFoundException e) {
				// If not found an user wants to know where it was not found,
				// put it in the list
				if (wasNotIn != null)
					wasNotIn.add(c);
			}
		}

		throw new ClassNotFoundException();
	}
}
