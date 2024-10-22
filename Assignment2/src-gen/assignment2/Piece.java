/**
 */
package assignment2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Piece</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.Piece#getName <em>Name</em>}</li>
 *   <li>{@link assignment2.Piece#getMoveStrategy <em>Move Strategy</em>}</li>
 *   <li>{@link assignment2.Piece#getBlackImgUrl <em>Black Img Url</em>}</li>
 *   <li>{@link assignment2.Piece#getWhitekImgUrl <em>Whitek Img Url</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getPiece()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Piece extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assignment2.Assignment2Package#getPiece_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assignment2.Piece#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Move Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move Strategy</em>' attribute.
	 * @see #setMoveStrategy(Object)
	 * @see assignment2.Assignment2Package#getPiece_MoveStrategy()
	 * @model
	 * @generated
	 */
	Object getMoveStrategy();

	/**
	 * Sets the value of the '{@link assignment2.Piece#getMoveStrategy <em>Move Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move Strategy</em>' attribute.
	 * @see #getMoveStrategy()
	 * @generated
	 */
	void setMoveStrategy(Object value);

	/**
	 * Returns the value of the '<em><b>Black Img Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Black Img Url</em>' attribute.
	 * @see #setBlackImgUrl(String)
	 * @see assignment2.Assignment2Package#getPiece_BlackImgUrl()
	 * @model
	 * @generated
	 */
	String getBlackImgUrl();

	/**
	 * Sets the value of the '{@link assignment2.Piece#getBlackImgUrl <em>Black Img Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Black Img Url</em>' attribute.
	 * @see #getBlackImgUrl()
	 * @generated
	 */
	void setBlackImgUrl(String value);

	/**
	 * Returns the value of the '<em><b>Whitek Img Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whitek Img Url</em>' attribute.
	 * @see #setWhitekImgUrl(String)
	 * @see assignment2.Assignment2Package#getPiece_WhitekImgUrl()
	 * @model
	 * @generated
	 */
	String getWhitekImgUrl();

	/**
	 * Sets the value of the '{@link assignment2.Piece#getWhitekImgUrl <em>Whitek Img Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whitek Img Url</em>' attribute.
	 * @see #getWhitekImgUrl()
	 * @generated
	 */
	void setWhitekImgUrl(String value);

} // Piece
