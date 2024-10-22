/**
 */
package assignment2.impl;

import assignment2.Assignment2Package;
import assignment2.Loadout;
import assignment2.Player;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment2.impl.PlayerImpl#getLoadout <em>Loadout</em>}</li>
 *   <li>{@link assignment2.impl.PlayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link assignment2.impl.PlayerImpl#getEloRating <em>Elo Rating</em>}</li>
 *   <li>{@link assignment2.impl.PlayerImpl#getSettings <em>Settings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerImpl extends MinimalEObjectImpl.Container implements Player {
	/**
	 * The cached value of the '{@link #getLoadout() <em>Loadout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadout()
	 * @generated
	 * @ordered
	 */
	protected Loadout loadout;

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
	 * The default value of the '{@link #getEloRating() <em>Elo Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEloRating()
	 * @generated
	 * @ordered
	 */
	protected static final int ELO_RATING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEloRating() <em>Elo Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEloRating()
	 * @generated
	 * @ordered
	 */
	protected int eloRating = ELO_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSettings() <em>Settings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings()
	 * @generated
	 * @ordered
	 */
	protected static final String SETTINGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSettings() <em>Settings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings()
	 * @generated
	 * @ordered
	 */
	protected String settings = SETTINGS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment2Package.Literals.PLAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Loadout getLoadout() {
		if (loadout != null && loadout.eIsProxy()) {
			InternalEObject oldLoadout = (InternalEObject) loadout;
			loadout = (Loadout) eResolveProxy(oldLoadout);
			if (loadout != oldLoadout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Assignment2Package.PLAYER__LOADOUT,
							oldLoadout, loadout));
			}
		}
		return loadout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loadout basicGetLoadout() {
		return loadout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadout(Loadout newLoadout) {
		Loadout oldLoadout = loadout;
		loadout = newLoadout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.PLAYER__LOADOUT, oldLoadout,
					loadout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.PLAYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEloRating() {
		return eloRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEloRating(int newEloRating) {
		int oldEloRating = eloRating;
		eloRating = newEloRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.PLAYER__ELO_RATING, oldEloRating,
					eloRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSettings() {
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSettings(String newSettings) {
		String oldSettings = settings;
		settings = newSettings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.PLAYER__SETTINGS, oldSettings,
					settings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Assignment2Package.PLAYER__LOADOUT:
			if (resolve)
				return getLoadout();
			return basicGetLoadout();
		case Assignment2Package.PLAYER__NAME:
			return getName();
		case Assignment2Package.PLAYER__ELO_RATING:
			return getEloRating();
		case Assignment2Package.PLAYER__SETTINGS:
			return getSettings();
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
		case Assignment2Package.PLAYER__LOADOUT:
			setLoadout((Loadout) newValue);
			return;
		case Assignment2Package.PLAYER__NAME:
			setName((String) newValue);
			return;
		case Assignment2Package.PLAYER__ELO_RATING:
			setEloRating((Integer) newValue);
			return;
		case Assignment2Package.PLAYER__SETTINGS:
			setSettings((String) newValue);
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
		case Assignment2Package.PLAYER__LOADOUT:
			setLoadout((Loadout) null);
			return;
		case Assignment2Package.PLAYER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Assignment2Package.PLAYER__ELO_RATING:
			setEloRating(ELO_RATING_EDEFAULT);
			return;
		case Assignment2Package.PLAYER__SETTINGS:
			setSettings(SETTINGS_EDEFAULT);
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
		case Assignment2Package.PLAYER__LOADOUT:
			return loadout != null;
		case Assignment2Package.PLAYER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Assignment2Package.PLAYER__ELO_RATING:
			return eloRating != ELO_RATING_EDEFAULT;
		case Assignment2Package.PLAYER__SETTINGS:
			return SETTINGS_EDEFAULT == null ? settings != null : !SETTINGS_EDEFAULT.equals(settings);
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
		result.append(", eloRating: ");
		result.append(eloRating);
		result.append(", settings: ");
		result.append(settings);
		result.append(')');
		return result.toString();
	}

} //PlayerImpl
