/**
 */
package assignment2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.Board#getSquare <em>Square</em>}</li>
 *   <li>{@link assignment2.Board#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getBoard()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL minSize='self.size &gt; 7'"
 * @generated
 */
public interface Board extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see assignment2.Assignment2Package#getBoard_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link assignment2.Board#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Square</b></em>' reference list.
	 * The list contents are of type {@link assignment2.Square}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Square</em>' reference list.
	 * @see assignment2.Assignment2Package#getBoard_Square()
	 * @model lower="16"
	 * @generated
	 */
	EList<Square> getSquare();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void populateBoard();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void movepiece();

} // Board
