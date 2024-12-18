/**
 */
package assignment2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment2.Game#getPlayers <em>Players</em>}</li>
 *   <li>{@link assignment2.Game#getBoard <em>Board</em>}</li>
 *   <li>{@link assignment2.Game#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see assignment2.Assignment2Package#getGame()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='twoPlayers'"
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Players</b></em>' reference list.
	 * The list contents are of type {@link assignment2.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' reference list.
	 * @see assignment2.Assignment2Package#getGame_Players()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Player> getPlayers();

	/**
	 * Returns the value of the '<em><b>Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' reference.
	 * @see #setBoard(Board)
	 * @see assignment2.Assignment2Package#getGame_Board()
	 * @model required="true"
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link assignment2.Game#getBoard <em>Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see assignment2.Assignment2Package#getGame_Time()
	 * @model required="true"
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link assignment2.Game#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	int getWhitePoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	int getBlackPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateElo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.players-&gt;size() = 2'"
	 * @generated
	 */
	boolean twoPlayers(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Game
