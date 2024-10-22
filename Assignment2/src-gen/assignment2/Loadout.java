/**
 */
package assignment2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loadout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.Loadout#getName <em>Name</em>}</li>
 *   <li>{@link assignment2.Loadout#getPiece <em>Piece</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getLoadout()
 * @model
 * @generated
 */
public interface Loadout extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assignment2.Assignment2Package#getLoadout_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assignment2.Loadout#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Piece</b></em>' reference list.
	 * The list contents are of type {@link assignment2.Piece}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piece</em>' reference list.
	 * @see assignment2.Assignment2Package#getLoadout_Piece()
	 * @model required="true"
	 * @generated
	 */
	EList<Piece> getPiece();

} // Loadout
