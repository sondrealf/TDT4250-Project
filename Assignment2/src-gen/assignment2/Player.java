/**
 */
package assignment2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.Player#getLoadout <em>Loadout</em>}</li>
 *   <li>{@link assignment2.Player#getName <em>Name</em>}</li>
 *   <li>{@link assignment2.Player#getEloRating <em>Elo Rating</em>}</li>
 *   <li>{@link assignment2.Player#getSettings <em>Settings</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getPlayer()
 * @model
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Loadout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loadout</em>' reference.
	 * @see #setLoadout(Loadout)
	 * @see assignment2.Assignment2Package#getPlayer_Loadout()
	 * @model required="true"
	 * @generated
	 */
	Loadout getLoadout();

	/**
	 * Sets the value of the '{@link assignment2.Player#getLoadout <em>Loadout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loadout</em>' reference.
	 * @see #getLoadout()
	 * @generated
	 */
	void setLoadout(Loadout value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assignment2.Assignment2Package#getPlayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assignment2.Player#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Elo Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elo Rating</em>' attribute.
	 * @see #setEloRating(int)
	 * @see assignment2.Assignment2Package#getPlayer_EloRating()
	 * @model required="true"
	 * @generated
	 */
	int getEloRating();

	/**
	 * Sets the value of the '{@link assignment2.Player#getEloRating <em>Elo Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elo Rating</em>' attribute.
	 * @see #getEloRating()
	 * @generated
	 */
	void setEloRating(int value);

	/**
	 * Returns the value of the '<em><b>Settings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' attribute.
	 * @see #setSettings(String)
	 * @see assignment2.Assignment2Package#getPlayer_Settings()
	 * @model
	 * @generated
	 */
	String getSettings();

	/**
	 * Sets the value of the '{@link assignment2.Player#getSettings <em>Settings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settings</em>' attribute.
	 * @see #getSettings()
	 * @generated
	 */
	void setSettings(String value);

} // Player
