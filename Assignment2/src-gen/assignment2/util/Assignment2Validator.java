/**
 */
package assignment2.util;

import assignment2.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see assignment2.Assignment2Package
 * @generated
 */
public class Assignment2Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Assignment2Validator INSTANCE = new Assignment2Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "assignment2";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Two Players' of 'Game'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GAME__TWO_PLAYERS = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Min Size' of 'Board'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BOARD__MIN_SIZE = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment2Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Assignment2Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Assignment2Package.GAME:
			return validateGame((Game) value, diagnostics, context);
		case Assignment2Package.PLAYER:
			return validatePlayer((Player) value, diagnostics, context);
		case Assignment2Package.BOARD:
			return validateBoard((Board) value, diagnostics, context);
		case Assignment2Package.LOADOUT:
			return validateLoadout((Loadout) value, diagnostics, context);
		case Assignment2Package.LEADERBOARD:
			return validateLeaderboard((Leaderboard) value, diagnostics, context);
		case Assignment2Package.SQUARE:
			return validateSquare((Square) value, diagnostics, context);
		case Assignment2Package.POSITION:
			return validatePosition((Position) value, diagnostics, context);
		case Assignment2Package.ROOK:
			return validateRook((Rook) value, diagnostics, context);
		case Assignment2Package.PAWN:
			return validatePawn((Pawn) value, diagnostics, context);
		case Assignment2Package.PIECE:
			return validatePiece((Piece) value, diagnostics, context);
		case Assignment2Package.MEDIC:
			return validateMedic((Medic) value, diagnostics, context);
		case Assignment2Package.GAME_PIECE:
			return validateGamePiece((GamePiece) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(game, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGame_twoPlayers(game, diagnostics, context);
		return result;
	}

	/**
	 * Validates the twoPlayers constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame_twoPlayers(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return game.twoPlayers(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayer(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(player, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoard(Board board, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(board, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBoard_minSize(board, diagnostics, context);
		return result;
	}

	/**
	 * Validates the minSize constraint of '<em>Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoard_minSize(Board board, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return board.minSize(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadout(Loadout loadout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loadout, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeaderboard(Leaderboard leaderboard, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leaderboard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSquare(Square square, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(square, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition(Position position, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(position, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRook(Rook rook, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rook, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePawn(Pawn pawn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pawn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePiece(Piece piece, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(piece, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedic(Medic medic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(medic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGamePiece(GamePiece gamePiece, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gamePiece, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Assignment2Validator
