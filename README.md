Rebundled EMF for Pure OSGi Environments
========================================

The Eclipse Modelling Framework delivers a number of bundles that run under Eclipse. However, the OSGi metadata in these bundle is of poor quality and they result in a hard dependency on large part of the Eclipse runtime. In addition can *only* be run under Equinox. See the discussion on [this bug](http://bugs.eclipse.org/bugs/show_bug.cgi?id=328227) for additional background information

In order to run EMF on other OSGi frameworks, it is necessary to rebundle EMF to clean up the dependencies.

This project contains a set of bundles for EMF that can be used in non-Equinox OSGi frameworks. These bundles are currently HIGHLY EXPERIMENTAL because I am learning EMF as I go along.

Bundle List
-----------

* `name.njbartlett.osgi.emf.minimal` contains what appears to be the minimal set of packages for any EMF-based model. This corresponds to the original `org.eclipse.emf.ecore` and `org.eclipse.emf.common` bundles.

* `name.njbartlett.osgi.emf.xmi` contains classes for XMI marshalling/unmarshalling. It has the same content as the original `org.eclipse.emf.ecore.xmi` bundle.