package name.njbartlett.osgi.emf.samples;

import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface Book extends EObject {
	/**
	 * @model
	 */
	String getTitle();
	
	/**
	 * Sets the value of the '{@link name.njbartlett.osgi.emf.samples.Book#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * @model
	 */
	Author getAuthor();

	/**
	 * Sets the value of the '{@link name.njbartlett.osgi.emf.samples.Book#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Author value);
}
