/**
 */
package assignment2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see assignment2.Assignment2Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Assignment2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "assignment2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/assignment2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "assignment2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Assignment2Package eINSTANCE = assignment2.impl.Assignment2PackageImpl.init();

	/**
	 * The meta object id for the '{@link assignment2.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.GameImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getGame()
	 * @generated
	 */
	int GAME = 0;

	/**
	 * The feature id for the '<em><b>Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__PLAYERS = 0;

	/**
	 * The feature id for the '<em><b>Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__BOARD = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__TIME = 2;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get White Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___GET_WHITE_POINTS = 0;

	/**
	 * The operation id for the '<em>Get Black Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___GET_BLACK_POINTS = 1;

	/**
	 * The operation id for the '<em>Update Elo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___UPDATE_ELO = 2;

	/**
	 * The operation id for the '<em>Two Players</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___TWO_PLAYERS__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link assignment2.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.PlayerImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 1;

	/**
	 * The feature id for the '<em><b>Loadout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__LOADOUT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Elo Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__ELO_RATING = 2;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__SETTINGS = 3;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.BoardImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 2;

	/**
	 * The feature id for the '<em><b>Square</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__SQUARE = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__SIZE = 1;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Populate Board</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD___POPULATE_BOARD = 0;

	/**
	 * The operation id for the '<em>Movepiece</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD___MOVEPIECE = 1;

	/**
	 * The operation id for the '<em>Min Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD___MIN_SIZE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link assignment2.impl.PieceImpl <em>Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.PieceImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getPiece()
	 * @generated
	 */
	int PIECE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.LoadoutImpl <em>Loadout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.LoadoutImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getLoadout()
	 * @generated
	 */
	int LOADOUT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADOUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Piece</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADOUT__PIECE = 1;

	/**
	 * The number of structural features of the '<em>Loadout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADOUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Loadout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.LeaderboardImpl <em>Leaderboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.LeaderboardImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getLeaderboard()
	 * @generated
	 */
	int LEADERBOARD = 5;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD__PLAYER = 0;

	/**
	 * The number of structural features of the '<em>Leaderboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>List Profiles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD___LIST_PROFILES = 0;

	/**
	 * The number of operations of the '<em>Leaderboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEADERBOARD_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link assignment2.impl.SquareImpl <em>Square</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.SquareImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getSquare()
	 * @generated
	 */
	int SQUARE = 6;

	/**
	 * The feature id for the '<em><b>Gamepiece</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__GAMEPIECE = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__POSITION = 1;

	/**
	 * The number of structural features of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Is Ocupied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE___IS_OCUPIED = 0;

	/**
	 * The number of operations of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link assignment2.impl.GamePieceImpl <em>Game Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.GamePieceImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getGamePiece()
	 * @generated
	 */
	int GAME_PIECE = 7;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PIECE__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Piece</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PIECE__PIECE = 1;

	/**
	 * The number of structural features of the '<em>Game Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PIECE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Game Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PIECE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.PositionImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 8;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Y = 1;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link assignment2.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see assignment2.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the reference list '{@link assignment2.Game#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Players</em>'.
	 * @see assignment2.Game#getPlayers()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Players();

	/**
	 * Returns the meta object for the reference '{@link assignment2.Game#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Board</em>'.
	 * @see assignment2.Game#getBoard()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Board();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Game#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see assignment2.Game#getTime()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Time();

	/**
	 * Returns the meta object for the '{@link assignment2.Game#getWhitePoints() <em>Get White Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get White Points</em>' operation.
	 * @see assignment2.Game#getWhitePoints()
	 * @generated
	 */
	EOperation getGame__GetWhitePoints();

	/**
	 * Returns the meta object for the '{@link assignment2.Game#getBlackPoints() <em>Get Black Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Black Points</em>' operation.
	 * @see assignment2.Game#getBlackPoints()
	 * @generated
	 */
	EOperation getGame__GetBlackPoints();

	/**
	 * Returns the meta object for the '{@link assignment2.Game#updateElo() <em>Update Elo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Elo</em>' operation.
	 * @see assignment2.Game#updateElo()
	 * @generated
	 */
	EOperation getGame__UpdateElo();

	/**
	 * Returns the meta object for the '{@link assignment2.Game#twoPlayers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Two Players</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Two Players</em>' operation.
	 * @see assignment2.Game#twoPlayers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getGame__TwoPlayers__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link assignment2.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see assignment2.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the reference '{@link assignment2.Player#getLoadout <em>Loadout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loadout</em>'.
	 * @see assignment2.Player#getLoadout()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Loadout();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assignment2.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Player#getEloRating <em>Elo Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elo Rating</em>'.
	 * @see assignment2.Player#getEloRating()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_EloRating();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Player#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Settings</em>'.
	 * @see assignment2.Player#getSettings()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Settings();

	/**
	 * Returns the meta object for class '{@link assignment2.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see assignment2.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the reference list '{@link assignment2.Board#getSquare <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Square</em>'.
	 * @see assignment2.Board#getSquare()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Square();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Board#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see assignment2.Board#getSize()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Size();

	/**
	 * Returns the meta object for the '{@link assignment2.Board#populateBoard() <em>Populate Board</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Populate Board</em>' operation.
	 * @see assignment2.Board#populateBoard()
	 * @generated
	 */
	EOperation getBoard__PopulateBoard();

	/**
	 * Returns the meta object for the '{@link assignment2.Board#movepiece() <em>Movepiece</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Movepiece</em>' operation.
	 * @see assignment2.Board#movepiece()
	 * @generated
	 */
	EOperation getBoard__Movepiece();

	/**
	 * Returns the meta object for the '{@link assignment2.Board#minSize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Min Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Min Size</em>' operation.
	 * @see assignment2.Board#minSize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBoard__MinSize__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link assignment2.Piece <em>Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Piece</em>'.
	 * @see assignment2.Piece
	 * @generated
	 */
	EClass getPiece();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Piece#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see assignment2.Piece#getType()
	 * @see #getPiece()
	 * @generated
	 */
	EAttribute getPiece_Type();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Piece#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see assignment2.Piece#getValue()
	 * @see #getPiece()
	 * @generated
	 */
	EAttribute getPiece_Value();

	/**
	 * Returns the meta object for class '{@link assignment2.Loadout <em>Loadout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loadout</em>'.
	 * @see assignment2.Loadout
	 * @generated
	 */
	EClass getLoadout();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Loadout#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assignment2.Loadout#getName()
	 * @see #getLoadout()
	 * @generated
	 */
	EAttribute getLoadout_Name();

	/**
	 * Returns the meta object for the reference list '{@link assignment2.Loadout#getPiece <em>Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Piece</em>'.
	 * @see assignment2.Loadout#getPiece()
	 * @see #getLoadout()
	 * @generated
	 */
	EReference getLoadout_Piece();

	/**
	 * Returns the meta object for class '{@link assignment2.Leaderboard <em>Leaderboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaderboard</em>'.
	 * @see assignment2.Leaderboard
	 * @generated
	 */
	EClass getLeaderboard();

	/**
	 * Returns the meta object for the reference list '{@link assignment2.Leaderboard#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Player</em>'.
	 * @see assignment2.Leaderboard#getPlayer()
	 * @see #getLeaderboard()
	 * @generated
	 */
	EReference getLeaderboard_Player();

	/**
	 * Returns the meta object for the '{@link assignment2.Leaderboard#listProfiles() <em>List Profiles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Profiles</em>' operation.
	 * @see assignment2.Leaderboard#listProfiles()
	 * @generated
	 */
	EOperation getLeaderboard__ListProfiles();

	/**
	 * Returns the meta object for class '{@link assignment2.Square <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Square</em>'.
	 * @see assignment2.Square
	 * @generated
	 */
	EClass getSquare();

	/**
	 * Returns the meta object for the reference '{@link assignment2.Square#getGamepiece <em>Gamepiece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gamepiece</em>'.
	 * @see assignment2.Square#getGamepiece()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_Gamepiece();

	/**
	 * Returns the meta object for the reference '{@link assignment2.Square#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see assignment2.Square#getPosition()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_Position();

	/**
	 * Returns the meta object for the '{@link assignment2.Square#isOcupied() <em>Is Ocupied</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Ocupied</em>' operation.
	 * @see assignment2.Square#isOcupied()
	 * @generated
	 */
	EOperation getSquare__IsOcupied();

	/**
	 * Returns the meta object for class '{@link assignment2.GamePiece <em>Game Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Piece</em>'.
	 * @see assignment2.GamePiece
	 * @generated
	 */
	EClass getGamePiece();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.GamePiece#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see assignment2.GamePiece#getColor()
	 * @see #getGamePiece()
	 * @generated
	 */
	EAttribute getGamePiece_Color();

	/**
	 * Returns the meta object for the reference '{@link assignment2.GamePiece#getPiece <em>Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Piece</em>'.
	 * @see assignment2.GamePiece#getPiece()
	 * @see #getGamePiece()
	 * @generated
	 */
	EReference getGamePiece_Piece();

	/**
	 * Returns the meta object for class '{@link assignment2.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see assignment2.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see assignment2.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_X();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see assignment2.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Y();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Assignment2Factory getAssignment2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link assignment2.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.GameImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__PLAYERS = eINSTANCE.getGame_Players();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__BOARD = eINSTANCE.getGame_Board();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__TIME = eINSTANCE.getGame_Time();

		/**
		 * The meta object literal for the '<em><b>Get White Points</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___GET_WHITE_POINTS = eINSTANCE.getGame__GetWhitePoints();

		/**
		 * The meta object literal for the '<em><b>Get Black Points</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___GET_BLACK_POINTS = eINSTANCE.getGame__GetBlackPoints();

		/**
		 * The meta object literal for the '<em><b>Update Elo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___UPDATE_ELO = eINSTANCE.getGame__UpdateElo();

		/**
		 * The meta object literal for the '<em><b>Two Players</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME___TWO_PLAYERS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getGame__TwoPlayers__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link assignment2.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.PlayerImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Loadout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__LOADOUT = eINSTANCE.getPlayer_Loadout();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

		/**
		 * The meta object literal for the '<em><b>Elo Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__ELO_RATING = eINSTANCE.getPlayer_EloRating();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__SETTINGS = eINSTANCE.getPlayer_Settings();

		/**
		 * The meta object literal for the '{@link assignment2.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.BoardImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Square</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__SQUARE = eINSTANCE.getBoard_Square();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__SIZE = eINSTANCE.getBoard_Size();

		/**
		 * The meta object literal for the '<em><b>Populate Board</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOARD___POPULATE_BOARD = eINSTANCE.getBoard__PopulateBoard();

		/**
		 * The meta object literal for the '<em><b>Movepiece</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOARD___MOVEPIECE = eINSTANCE.getBoard__Movepiece();

		/**
		 * The meta object literal for the '<em><b>Min Size</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOARD___MIN_SIZE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getBoard__MinSize__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link assignment2.impl.PieceImpl <em>Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.PieceImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getPiece()
		 * @generated
		 */
		EClass PIECE = eINSTANCE.getPiece();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE__TYPE = eINSTANCE.getPiece_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE__VALUE = eINSTANCE.getPiece_Value();

		/**
		 * The meta object literal for the '{@link assignment2.impl.LoadoutImpl <em>Loadout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.LoadoutImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getLoadout()
		 * @generated
		 */
		EClass LOADOUT = eINSTANCE.getLoadout();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOADOUT__NAME = eINSTANCE.getLoadout_Name();

		/**
		 * The meta object literal for the '<em><b>Piece</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOADOUT__PIECE = eINSTANCE.getLoadout_Piece();

		/**
		 * The meta object literal for the '{@link assignment2.impl.LeaderboardImpl <em>Leaderboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.LeaderboardImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getLeaderboard()
		 * @generated
		 */
		EClass LEADERBOARD = eINSTANCE.getLeaderboard();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEADERBOARD__PLAYER = eINSTANCE.getLeaderboard_Player();

		/**
		 * The meta object literal for the '<em><b>List Profiles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEADERBOARD___LIST_PROFILES = eINSTANCE.getLeaderboard__ListProfiles();

		/**
		 * The meta object literal for the '{@link assignment2.impl.SquareImpl <em>Square</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.SquareImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getSquare()
		 * @generated
		 */
		EClass SQUARE = eINSTANCE.getSquare();

		/**
		 * The meta object literal for the '<em><b>Gamepiece</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__GAMEPIECE = eINSTANCE.getSquare_Gamepiece();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__POSITION = eINSTANCE.getSquare_Position();

		/**
		 * The meta object literal for the '<em><b>Is Ocupied</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SQUARE___IS_OCUPIED = eINSTANCE.getSquare__IsOcupied();

		/**
		 * The meta object literal for the '{@link assignment2.impl.GamePieceImpl <em>Game Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.GamePieceImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getGamePiece()
		 * @generated
		 */
		EClass GAME_PIECE = eINSTANCE.getGamePiece();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_PIECE__COLOR = eINSTANCE.getGamePiece_Color();

		/**
		 * The meta object literal for the '<em><b>Piece</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_PIECE__PIECE = eINSTANCE.getGamePiece_Piece();

		/**
		 * The meta object literal for the '{@link assignment2.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.PositionImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__X = eINSTANCE.getPosition_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__Y = eINSTANCE.getPosition_Y();

	}

} //Assignment2Package
