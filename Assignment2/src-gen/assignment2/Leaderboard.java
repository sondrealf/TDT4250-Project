/**
 */
package assignment2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaderboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.Leaderboard#getPlayer <em>Player</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getLeaderboard()
 * @model
 * @generated
 */
public interface Leaderboard extends EObject {
	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference list.
	 * The list contents are of type {@link assignment2.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference list.
	 * @see assignment2.Assignment2Package#getLeaderboard_Player()
	 * @model
	 * @generated
	 */
	EList<Player> getPlayer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String listProfiles();

} // Leaderboard
