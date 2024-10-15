/**
 */
package assignment2.impl;

import assignment2.Assignment2Package;
import assignment2.Board;
import assignment2.Game;
import assignment2.Player;
import assignment2.Square;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment2.impl.GameImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link assignment2.impl.GameImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link assignment2.impl.GameImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> player;

	/**
	 * The cached value of the '{@link #getBoard() <em>Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoard()
	 * @generated
	 * @ordered
	 */
	protected Board board;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected int time = TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment2Package.Literals.GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Player> getPlayer() {
		if (player == null) {
			player = new EObjectResolvingEList<Player>(Player.class, this, Assignment2Package.GAME__PLAYER);
		}
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Board getBoard() {
		if (board != null && board.eIsProxy()) {
			InternalEObject oldBoard = (InternalEObject) board;
			board = (Board) eResolveProxy(oldBoard);
			if (board != oldBoard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Assignment2Package.GAME__BOARD, oldBoard,
							board));
			}
		}
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board basicGetBoard() {
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoard(Board newBoard) {
		Board oldBoard = board;
		board = newBoard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.GAME__BOARD, oldBoard, board));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(int newTime) {
		int oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.GAME__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public int getWhitePoints() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		int whitePoints = 0;
		for (Square square : this.getBoard().getSquare()) {
			if (square.isOcupied()) {
				if (square.getGamepiece().getColor().equals("white")) {
					whitePoints += square.getGamepiece().getPiece().getValue();
				}
			}
		}
		return whitePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public int getBlackPoints() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		int blackPoints = 0;
		for (Square square : this.getBoard().getSquare()) {
			if (square.isOcupied()) {
				if (square.getGamepiece().getColor().equals("white")) {
					blackPoints += square.getGamepiece().getPiece().getValue();
				}
			}
		}
		return blackPoints;
	}

	public boolean validateTwoPlayers() {
		return this.getPlayer() != null && this.getPlayer().size() == 2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void updateElo() {
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
		case Assignment2Package.GAME__PLAYER:
			return getPlayer();
		case Assignment2Package.GAME__BOARD:
			if (resolve)
				return getBoard();
			return basicGetBoard();
		case Assignment2Package.GAME__TIME:
			return getTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Assignment2Package.GAME__PLAYER:
			getPlayer().clear();
			getPlayer().addAll((Collection<? extends Player>) newValue);
			return;
		case Assignment2Package.GAME__BOARD:
			setBoard((Board) newValue);
			return;
		case Assignment2Package.GAME__TIME:
			setTime((Integer) newValue);
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
		case Assignment2Package.GAME__PLAYER:
			getPlayer().clear();
			return;
		case Assignment2Package.GAME__BOARD:
			setBoard((Board) null);
			return;
		case Assignment2Package.GAME__TIME:
			setTime(TIME_EDEFAULT);
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
		case Assignment2Package.GAME__PLAYER:
			return player != null && !player.isEmpty();
		case Assignment2Package.GAME__BOARD:
			return board != null;
		case Assignment2Package.GAME__TIME:
			return time != TIME_EDEFAULT;
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
		case Assignment2Package.GAME___GET_WHITE_POINTS:
			return getWhitePoints();
		case Assignment2Package.GAME___GET_BLACK_POINTS:
			return getBlackPoints();
		case Assignment2Package.GAME___UPDATE_ELO:
			updateElo();
			return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //GameImpl
