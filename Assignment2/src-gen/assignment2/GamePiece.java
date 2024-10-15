/**
 */
package assignment2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Piece</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.GamePiece#getColor <em>Color</em>}</li>
 *   <li>{@link assignment2.GamePiece#getPiece <em>Piece</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getGamePiece()
 * @model
 * @generated
 */
public interface GamePiece extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see assignment2.Assignment2Package#getGamePiece_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link assignment2.GamePiece#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Piece</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piece</em>' reference.
	 * @see #setPiece(Piece)
	 * @see assignment2.Assignment2Package#getGamePiece_Piece()
	 * @model required="true"
	 * @generated
	 */
	Piece getPiece();

	/**
	 * Sets the value of the '{@link assignment2.GamePiece#getPiece <em>Piece</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Piece</em>' reference.
	 * @see #getPiece()
	 * @generated
	 */
	void setPiece(Piece value);

} // GamePiece
