/**
 */
package assignment2.util;

import assignment2.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see assignment2.Assignment2Package
 * @generated
 */
public class Assignment2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Assignment2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Assignment2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Assignment2Switch<Adapter> modelSwitch = new Assignment2Switch<Adapter>() {
		@Override
		public Adapter caseGame(Game object) {
			return createGameAdapter();
		}

		@Override
		public Adapter casePlayer(Player object) {
			return createPlayerAdapter();
		}

		@Override
		public Adapter caseBoard(Board object) {
			return createBoardAdapter();
		}

		@Override
		public Adapter caseLoadout(Loadout object) {
			return createLoadoutAdapter();
		}

		@Override
		public Adapter caseLeaderboard(Leaderboard object) {
			return createLeaderboardAdapter();
		}

		@Override
		public Adapter caseSquare(Square object) {
			return createSquareAdapter();
		}

		@Override
		public Adapter casePosition(Position object) {
			return createPositionAdapter();
		}

		@Override
		public Adapter caseRook(Rook object) {
			return createRookAdapter();
		}

		@Override
		public Adapter casePawn(Pawn object) {
			return createPawnAdapter();
		}

		@Override
		public Adapter casePiece(Piece object) {
			return createPieceAdapter();
		}

		@Override
		public Adapter caseMedic(Medic object) {
			return createMedicAdapter();
		}

		@Override
		public Adapter caseGamePiece(GamePiece object) {
			return createGamePieceAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignment2.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment2.Game
	 * @generated
	 */
	public Adapter createGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignment2.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment2.Player
	 * @generated
	 */
	public Adapter createPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignment2.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment2.Board
	 * @generated
	 */
	public Adapter createBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignment2.Loadout <em>Loadout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment2.Loadout
	 * @generated
	 */
	public Adapter createLoadoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignment2.Leaderboard <em>Leaderboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment2.Leaderboard
	 * @generated
	 */
	public Adapter createLeaderboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignment2.Square <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment2.Square
	 * @generated
	 */
	public Adapter createSquareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignment2.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment2.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignment2.Rook <em>Rook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment2.Rook
	 * @generated
	 */
	public Adapter createRookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignment2.Pawn <em>Pawn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment2.Pawn
	 * @generated
	 */
	public Adapter createPawnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignment2.Piece <em>Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment2.Piece
	 * @generated
	 */
	public Adapter createPieceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignment2.Medic <em>Medic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment2.Medic
	 * @generated
	 */
	public Adapter createMedicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignment2.GamePiece <em>Game Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment2.GamePiece
	 * @generated
	 */
	public Adapter createGamePieceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Assignment2AdapterFactory
