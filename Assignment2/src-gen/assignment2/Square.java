/**
 */
package assignment2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.Square#getGamepiece <em>Gamepiece</em>}</li>
 *   <li>{@link assignment2.Square#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getSquare()
 * @model
 * @generated
 */
public interface Square extends EObject {
	/**
	 * Returns the value of the '<em><b>Gamepiece</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gamepiece</em>' reference.
	 * @see #setGamepiece(GamePiece)
	 * @see assignment2.Assignment2Package#getSquare_Gamepiece()
	 * @model
	 * @generated
	 */
	GamePiece getGamepiece();

	/**
	 * Sets the value of the '{@link assignment2.Square#getGamepiece <em>Gamepiece</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gamepiece</em>' reference.
	 * @see #getGamepiece()
	 * @generated
	 */
	void setGamepiece(GamePiece value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(Position)
	 * @see assignment2.Assignment2Package#getSquare_Position()
	 * @model required="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link assignment2.Square#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isOcupied();

} // Square
