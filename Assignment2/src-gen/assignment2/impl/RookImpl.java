/**
 */
package assignment2.impl;

import assignment2.Assignment2Package;
import assignment2.Rook;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rook</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment2.impl.RookImpl#getName <em>Name</em>}</li>
 *   <li>{@link assignment2.impl.RookImpl#getMoveStrategy <em>Move Strategy</em>}</li>
 *   <li>{@link assignment2.impl.RookImpl#getBlackImgUrl <em>Black Img Url</em>}</li>
 *   <li>{@link assignment2.impl.RookImpl#getWhitekImgUrl <em>Whitek Img Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RookImpl extends MinimalEObjectImpl.Container implements Rook {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMoveStrategy() <em>Move Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final Object MOVE_STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoveStrategy() <em>Move Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveStrategy()
	 * @generated
	 * @ordered
	 */
	protected Object moveStrategy = MOVE_STRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlackImgUrl() <em>Black Img Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlackImgUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String BLACK_IMG_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlackImgUrl() <em>Black Img Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlackImgUrl()
	 * @generated
	 * @ordered
	 */
	protected String blackImgUrl = BLACK_IMG_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhitekImgUrl() <em>Whitek Img Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhitekImgUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String WHITEK_IMG_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhitekImgUrl() <em>Whitek Img Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhitekImgUrl()
	 * @generated
	 * @ordered
	 */
	protected String whitekImgUrl = WHITEK_IMG_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment2Package.Literals.ROOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.ROOK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getMoveStrategy() {
		return moveStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoveStrategy(Object newMoveStrategy) {
		Object oldMoveStrategy = moveStrategy;
		moveStrategy = newMoveStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.ROOK__MOVE_STRATEGY,
					oldMoveStrategy, moveStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBlackImgUrl() {
		return blackImgUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlackImgUrl(String newBlackImgUrl) {
		String oldBlackImgUrl = blackImgUrl;
		blackImgUrl = newBlackImgUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.ROOK__BLACK_IMG_URL,
					oldBlackImgUrl, blackImgUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWhitekImgUrl() {
		return whitekImgUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhitekImgUrl(String newWhitekImgUrl) {
		String oldWhitekImgUrl = whitekImgUrl;
		whitekImgUrl = newWhitekImgUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.ROOK__WHITEK_IMG_URL,
					oldWhitekImgUrl, whitekImgUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Assignment2Package.ROOK__NAME:
			return getName();
		case Assignment2Package.ROOK__MOVE_STRATEGY:
			return getMoveStrategy();
		case Assignment2Package.ROOK__BLACK_IMG_URL:
			return getBlackImgUrl();
		case Assignment2Package.ROOK__WHITEK_IMG_URL:
			return getWhitekImgUrl();
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
		case Assignment2Package.ROOK__NAME:
			setName((String) newValue);
			return;
		case Assignment2Package.ROOK__MOVE_STRATEGY:
			setMoveStrategy(newValue);
			return;
		case Assignment2Package.ROOK__BLACK_IMG_URL:
			setBlackImgUrl((String) newValue);
			return;
		case Assignment2Package.ROOK__WHITEK_IMG_URL:
			setWhitekImgUrl((String) newValue);
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
		case Assignment2Package.ROOK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Assignment2Package.ROOK__MOVE_STRATEGY:
			setMoveStrategy(MOVE_STRATEGY_EDEFAULT);
			return;
		case Assignment2Package.ROOK__BLACK_IMG_URL:
			setBlackImgUrl(BLACK_IMG_URL_EDEFAULT);
			return;
		case Assignment2Package.ROOK__WHITEK_IMG_URL:
			setWhitekImgUrl(WHITEK_IMG_URL_EDEFAULT);
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
		case Assignment2Package.ROOK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Assignment2Package.ROOK__MOVE_STRATEGY:
			return MOVE_STRATEGY_EDEFAULT == null ? moveStrategy != null : !MOVE_STRATEGY_EDEFAULT.equals(moveStrategy);
		case Assignment2Package.ROOK__BLACK_IMG_URL:
			return BLACK_IMG_URL_EDEFAULT == null ? blackImgUrl != null : !BLACK_IMG_URL_EDEFAULT.equals(blackImgUrl);
		case Assignment2Package.ROOK__WHITEK_IMG_URL:
			return WHITEK_IMG_URL_EDEFAULT == null ? whitekImgUrl != null
					: !WHITEK_IMG_URL_EDEFAULT.equals(whitekImgUrl);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", moveStrategy: ");
		result.append(moveStrategy);
		result.append(", blackImgUrl: ");
		result.append(blackImgUrl);
		result.append(", whitekImgUrl: ");
		result.append(whitekImgUrl);
		result.append(')');
		return result.toString();
	}

} //RookImpl
