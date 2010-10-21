/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package name.njbartlett.osgi.emf.samples.tests;

import java.io.File;
import java.io.IOException;

import name.njbartlett.osgi.emf.samples.Author;
import name.njbartlett.osgi.emf.samples.SamplesFactory;
import name.njbartlett.osgi.emf.samples.SamplesPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class SamplesExampleActivator implements BundleActivator {
	public void start(BundleContext context) {
		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file
		// extensions.
		//
		resourceSet
				.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put(SamplesPackage.eNS_URI,
				SamplesPackage.eINSTANCE);

		File file = new File("samples.xmi");
		URI uri = URI.createFileURI(file.getAbsolutePath());

		if (file.exists()) {
			try {
				// Demand load resource for this file.
				//
				Resource resource = resourceSet.getResource(uri, true);
				System.out.println("Loaded " + uri);

				// Validate the contents of the loaded resource.
				//
				for (EObject eObject : resource.getContents()) {
					System.out.println("--> " + eObject.toString());
				}
			} catch (RuntimeException exception) {
				System.out.println("Problem loading " + uri);
				exception.printStackTrace();
			}
		} else {
			try {
				Resource resource = resourceSet.createResource(uri);
				Author root = SamplesFactory.eINSTANCE.createAuthor();
				root.setName("J.D. Salinger");
				resource.getContents().add(root);
				resource.save(null);
				System.out.println("Saved " + uri);
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}

} // SamplesExample
