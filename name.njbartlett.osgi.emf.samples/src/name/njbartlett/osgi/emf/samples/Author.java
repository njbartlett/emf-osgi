package name.njbartlett.osgi.emf.samples;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface Author extends EObject {
	/**
	 * @model
	 */
	String getName();

	/**
	 * Sets the value of the '{@link name.njbartlett.osgi.emf.samples.Author#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * @model
	 */
	EList<Book> getBooks();
}
