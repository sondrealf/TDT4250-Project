/**
 */
package assignment2.impl;

import assignment2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Assignment2FactoryImpl extends EFactoryImpl implements Assignment2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Assignment2Factory init() {
		try {
			Assignment2Factory theAssignment2Factory = (Assignment2Factory) EPackage.Registry.INSTANCE
					.getEFactory(Assignment2Package.eNS_URI);
			if (theAssignment2Factory != null) {
				return theAssignment2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Assignment2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Assignment2Package.GAME:
			return createGame();
		case Assignment2Package.PLAYER:
			return createPlayer();
		case Assignment2Package.BOARD:
			return createBoard();
		case Assignment2Package.PIECE:
			return createPiece();
		case Assignment2Package.LOADOUT:
			return createLoadout();
		case Assignment2Package.LEADERBOARD:
			return createLeaderboard();
		case Assignment2Package.SQUARE:
			return createSquare();
		case Assignment2Package.GAME_PIECE:
			return createGamePiece();
		case Assignment2Package.POSITION:
			return createPosition();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Game createGame() {
		GameImpl game = new GameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Board createBoard() {
		BoardImpl board = new BoardImpl();
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Piece createPiece() {
		PieceImpl piece = new PieceImpl();
		return piece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Loadout createLoadout() {
		LoadoutImpl loadout = new LoadoutImpl();
		return loadout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Leaderboard createLeaderboard() {
		LeaderboardImpl leaderboard = new LeaderboardImpl();
		return leaderboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Square createSquare() {
		SquareImpl square = new SquareImpl();
		return square;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GamePiece createGamePiece() {
		GamePieceImpl gamePiece = new GamePieceImpl();
		return gamePiece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assignment2Package getAssignment2Package() {
		return (Assignment2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Assignment2Package getPackage() {
		return Assignment2Package.eINSTANCE;
	}

} //Assignment2FactoryImpl
