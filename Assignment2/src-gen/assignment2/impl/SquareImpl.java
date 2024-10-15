/**
 */
package assignment2.impl;

import assignment2.Assignment2Package;
import assignment2.GamePiece;
import assignment2.Position;
import assignment2.Square;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment2.impl.SquareImpl#getGamepiece <em>Gamepiece</em>}</li>
 *   <li>{@link assignment2.impl.SquareImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SquareImpl extends MinimalEObjectImpl.Container implements Square {
	/**
	 * The cached value of the '{@link #getGamepiece() <em>Gamepiece</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamepiece()
	 * @generated
	 * @ordered
	 */
	protected GamePiece gamepiece;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SquareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment2Package.Literals.SQUARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position getPosition() {
		if (position != null && position.eIsProxy()) {
			InternalEObject oldPosition = (InternalEObject) position;
			position = (Position) eResolveProxy(oldPosition);
			if (position != oldPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Assignment2Package.SQUARE__POSITION,
							oldPosition, position));
			}
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position basicGetPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(Position newPosition) {
		Position oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.SQUARE__POSITION, oldPosition,
					position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GamePiece getGamepiece() {
		if (gamepiece != null && gamepiece.eIsProxy()) {
			InternalEObject oldGamepiece = (InternalEObject) gamepiece;
			gamepiece = (GamePiece) eResolveProxy(oldGamepiece);
			if (gamepiece != oldGamepiece) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Assignment2Package.SQUARE__GAMEPIECE,
							oldGamepiece, gamepiece));
			}
		}
		return gamepiece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamePiece basicGetGamepiece() {
		return gamepiece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGamepiece(GamePiece newGamepiece) {
		GamePiece oldGamepiece = gamepiece;
		gamepiece = newGamepiece;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.SQUARE__GAMEPIECE, oldGamepiece,
					gamepiece));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOcupied() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Assignment2Package.SQUARE__GAMEPIECE:
			if (resolve)
				return getGamepiece();
			return basicGetGamepiece();
		case Assignment2Package.SQUARE__POSITION:
			if (resolve)
				return getPosition();
			return basicGetPosition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Assignment2Package.SQUARE__GAMEPIECE:
			setGamepiece((GamePiece) newValue);
			return;
		case Assignment2Package.SQUARE__POSITION:
			setPosition((Position) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Assignment2Package.SQUARE__GAMEPIECE:
			setGamepiece((GamePiece) null);
			return;
		case Assignment2Package.SQUARE__POSITION:
			setPosition((Position) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Assignment2Package.SQUARE__GAMEPIECE:
			return gamepiece != null;
		case Assignment2Package.SQUARE__POSITION:
			return position != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Assignment2Package.SQUARE___IS_OCUPIED:
			return isOcupied();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SquareImpl
