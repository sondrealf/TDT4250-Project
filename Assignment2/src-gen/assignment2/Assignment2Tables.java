/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /Assignment2/model/assignment2.ecore
 * using:
 *   /Assignment2/model/assignment2.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package assignment2;

// import assignment2.Assignment2Package;
// import assignment2.Assignment2Tables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * Assignment2Tables provides the dispatch tables for the assignment2 for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Assignment2Tables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Assignment2Package.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_assignment2 = IdManager.getNsURIPackageId("http://www.example.org/assignment2", null, Assignment2Package.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Board = Assignment2Tables.PACKid_http_c_s_s_www_example_org_s_assignment2.getClassId("Board", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Game = Assignment2Tables.PACKid_http_c_s_s_www_example_org_s_assignment2.getClassId("Game", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_GamePiece = Assignment2Tables.PACKid_http_c_s_s_www_example_org_s_assignment2.getClassId("GamePiece", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Leaderboard = Assignment2Tables.PACKid_http_c_s_s_www_example_org_s_assignment2.getClassId("Leaderboard", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Loadout = Assignment2Tables.PACKid_http_c_s_s_www_example_org_s_assignment2.getClassId("Loadout", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Piece = Assignment2Tables.PACKid_http_c_s_s_www_example_org_s_assignment2.getClassId("Piece", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Player = Assignment2Tables.PACKid_http_c_s_s_www_example_org_s_assignment2.getClassId("Player", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Position = Assignment2Tables.PACKid_http_c_s_s_www_example_org_s_assignment2.getClassId("Position", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Square = Assignment2Tables.PACKid_http_c_s_s_www_example_org_s_assignment2.getClassId("Square", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = Assignment2Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EJavaObject = Assignment2Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EJavaObject", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_2 = ValueUtil.integerValueOf("2");
	public static final /*@NonInvalid*/ IntegerValue INT_7 = ValueUtil.integerValueOf("7");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Board = TypeId.BAG.getSpecializedId(Assignment2Tables.CLSSid_Board, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Game = TypeId.BAG.getSpecializedId(Assignment2Tables.CLSSid_Game, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_GamePiece = TypeId.BAG.getSpecializedId(Assignment2Tables.CLSSid_GamePiece, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Leaderboard = TypeId.BAG.getSpecializedId(Assignment2Tables.CLSSid_Leaderboard, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Loadout = TypeId.BAG.getSpecializedId(Assignment2Tables.CLSSid_Loadout, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Player = TypeId.BAG.getSpecializedId(Assignment2Tables.CLSSid_Player, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Square = TypeId.BAG.getSpecializedId(Assignment2Tables.CLSSid_Square, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Piece = TypeId.ORDERED_SET.getSpecializedId(Assignment2Tables.CLSSid_Piece, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Player = TypeId.ORDERED_SET.getSpecializedId(Assignment2Tables.CLSSid_Player, true, ValueUtil.integerValueOf(2), ValueUtil.integerValueOf(2));
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Player_0 = TypeId.ORDERED_SET.getSpecializedId(Assignment2Tables.CLSSid_Player, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Square = TypeId.ORDERED_SET.getSpecializedId(Assignment2Tables.CLSSid_Square, true, ValueUtil.integerValueOf(16), ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Assignment2Tables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Assignment2Tables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Board = new EcoreExecutorType(Assignment2Package.Literals.BOARD, PACKAGE, 0);
		public static final EcoreExecutorType _Game = new EcoreExecutorType(Assignment2Package.Literals.GAME, PACKAGE, 0);
		public static final EcoreExecutorType _GamePiece = new EcoreExecutorType(Assignment2Package.Literals.GAME_PIECE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Leaderboard = new EcoreExecutorType(Assignment2Package.Literals.LEADERBOARD, PACKAGE, 0);
		public static final EcoreExecutorType _Loadout = new EcoreExecutorType(Assignment2Package.Literals.LOADOUT, PACKAGE, 0);
		public static final EcoreExecutorType _Medic = new EcoreExecutorType(Assignment2Package.Literals.MEDIC, PACKAGE, 0);
		public static final EcoreExecutorType _Pawn = new EcoreExecutorType(Assignment2Package.Literals.PAWN, PACKAGE, 0);
		public static final EcoreExecutorType _Piece = new EcoreExecutorType(Assignment2Package.Literals.PIECE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Player = new EcoreExecutorType(Assignment2Package.Literals.PLAYER, PACKAGE, 0);
		public static final EcoreExecutorType _Position = new EcoreExecutorType(Assignment2Package.Literals.POSITION, PACKAGE, 0);
		public static final EcoreExecutorType _Rook = new EcoreExecutorType(Assignment2Package.Literals.ROOK, PACKAGE, 0);
		public static final EcoreExecutorType _Square = new EcoreExecutorType(Assignment2Package.Literals.SQUARE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Board,
			_Game,
			_GamePiece,
			_Leaderboard,
			_Loadout,
			_Medic,
			_Pawn,
			_Piece,
			_Player,
			_Position,
			_Rook,
			_Square
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Assignment2Tables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Board__Board = new ExecutorFragment(Types._Board, Assignment2Tables.Types._Board);
		private static final ExecutorFragment _Board__OclAny = new ExecutorFragment(Types._Board, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Board__OclElement = new ExecutorFragment(Types._Board, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Game__Game = new ExecutorFragment(Types._Game, Assignment2Tables.Types._Game);
		private static final ExecutorFragment _Game__OclAny = new ExecutorFragment(Types._Game, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Game__OclElement = new ExecutorFragment(Types._Game, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _GamePiece__GamePiece = new ExecutorFragment(Types._GamePiece, Assignment2Tables.Types._GamePiece);
		private static final ExecutorFragment _GamePiece__OclAny = new ExecutorFragment(Types._GamePiece, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _GamePiece__OclElement = new ExecutorFragment(Types._GamePiece, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Leaderboard__Leaderboard = new ExecutorFragment(Types._Leaderboard, Assignment2Tables.Types._Leaderboard);
		private static final ExecutorFragment _Leaderboard__OclAny = new ExecutorFragment(Types._Leaderboard, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Leaderboard__OclElement = new ExecutorFragment(Types._Leaderboard, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Loadout__Loadout = new ExecutorFragment(Types._Loadout, Assignment2Tables.Types._Loadout);
		private static final ExecutorFragment _Loadout__OclAny = new ExecutorFragment(Types._Loadout, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Loadout__OclElement = new ExecutorFragment(Types._Loadout, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Medic__Medic = new ExecutorFragment(Types._Medic, Assignment2Tables.Types._Medic);
		private static final ExecutorFragment _Medic__OclAny = new ExecutorFragment(Types._Medic, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Medic__OclElement = new ExecutorFragment(Types._Medic, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Medic__Piece = new ExecutorFragment(Types._Medic, Assignment2Tables.Types._Piece);

		private static final ExecutorFragment _Pawn__OclAny = new ExecutorFragment(Types._Pawn, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Pawn__OclElement = new ExecutorFragment(Types._Pawn, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Pawn__Pawn = new ExecutorFragment(Types._Pawn, Assignment2Tables.Types._Pawn);
		private static final ExecutorFragment _Pawn__Piece = new ExecutorFragment(Types._Pawn, Assignment2Tables.Types._Piece);

		private static final ExecutorFragment _Piece__OclAny = new ExecutorFragment(Types._Piece, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Piece__OclElement = new ExecutorFragment(Types._Piece, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Piece__Piece = new ExecutorFragment(Types._Piece, Assignment2Tables.Types._Piece);

		private static final ExecutorFragment _Player__OclAny = new ExecutorFragment(Types._Player, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Player__OclElement = new ExecutorFragment(Types._Player, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Player__Player = new ExecutorFragment(Types._Player, Assignment2Tables.Types._Player);

		private static final ExecutorFragment _Position__OclAny = new ExecutorFragment(Types._Position, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Position__OclElement = new ExecutorFragment(Types._Position, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Position__Position = new ExecutorFragment(Types._Position, Assignment2Tables.Types._Position);

		private static final ExecutorFragment _Rook__OclAny = new ExecutorFragment(Types._Rook, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Rook__OclElement = new ExecutorFragment(Types._Rook, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Rook__Piece = new ExecutorFragment(Types._Rook, Assignment2Tables.Types._Piece);
		private static final ExecutorFragment _Rook__Rook = new ExecutorFragment(Types._Rook, Assignment2Tables.Types._Rook);

		private static final ExecutorFragment _Square__OclAny = new ExecutorFragment(Types._Square, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Square__OclElement = new ExecutorFragment(Types._Square, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Square__Square = new ExecutorFragment(Types._Square, Assignment2Tables.Types._Square);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Assignment2Tables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Assignment2Tables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Board__movepiece = new ExecutorOperation("movepiece", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Board,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Board__populateBoard = new ExecutorOperation("populateBoard", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Board,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Game__getBlackPoints = new ExecutorOperation("getBlackPoints", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Game,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Game__getWhitePoints = new ExecutorOperation("getWhitePoints", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Game,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Game__updateElo = new ExecutorOperation("updateElo", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Game,
			2, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Leaderboard__listProfiles = new ExecutorOperation("listProfiles", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Leaderboard,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Square__isOcupied = new ExecutorOperation("isOcupied", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Square,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Assignment2Tables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Board__size = new EcoreExecutorProperty(Assignment2Package.Literals.BOARD__SIZE, Types._Board, 0);
		public static final ExecutorProperty _Board__square = new EcoreExecutorProperty(Assignment2Package.Literals.BOARD__SQUARE, Types._Board, 1);
		public static final ExecutorProperty _Board__Game__board = new ExecutorPropertyWithImplementation("Game", Types._Board, 2, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.GAME__BOARD));

		public static final ExecutorProperty _Game__board = new EcoreExecutorProperty(Assignment2Package.Literals.GAME__BOARD, Types._Game, 0);
		public static final ExecutorProperty _Game__players = new EcoreExecutorProperty(Assignment2Package.Literals.GAME__PLAYERS, Types._Game, 1);
		public static final ExecutorProperty _Game__time = new EcoreExecutorProperty(Assignment2Package.Literals.GAME__TIME, Types._Game, 2);

		public static final ExecutorProperty _GamePiece__color = new EcoreExecutorProperty(Assignment2Package.Literals.GAME_PIECE__COLOR, Types._GamePiece, 0);
		public static final ExecutorProperty _GamePiece__piece = new EcoreExecutorProperty(Assignment2Package.Literals.GAME_PIECE__PIECE, Types._GamePiece, 1);
		public static final ExecutorProperty _GamePiece__Square__gamepiece = new ExecutorPropertyWithImplementation("Square", Types._GamePiece, 2, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.SQUARE__GAMEPIECE));

		public static final ExecutorProperty _Leaderboard__player = new EcoreExecutorProperty(Assignment2Package.Literals.LEADERBOARD__PLAYER, Types._Leaderboard, 0);

		public static final ExecutorProperty _Loadout__name = new EcoreExecutorProperty(Assignment2Package.Literals.LOADOUT__NAME, Types._Loadout, 0);
		public static final ExecutorProperty _Loadout__piece = new EcoreExecutorProperty(Assignment2Package.Literals.LOADOUT__PIECE, Types._Loadout, 1);
		public static final ExecutorProperty _Loadout__Player__loadout = new ExecutorPropertyWithImplementation("Player", Types._Loadout, 2, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.PLAYER__LOADOUT));

		public static final ExecutorProperty _Medic__abillity = new EcoreExecutorProperty(Assignment2Package.Literals.MEDIC__ABILLITY, Types._Medic, 0);

		public static final ExecutorProperty _Piece__blackImgUrl = new EcoreExecutorProperty(Assignment2Package.Literals.PIECE__BLACK_IMG_URL, Types._Piece, 0);
		public static final ExecutorProperty _Piece__moveStrategy = new EcoreExecutorProperty(Assignment2Package.Literals.PIECE__MOVE_STRATEGY, Types._Piece, 1);
		public static final ExecutorProperty _Piece__name = new EcoreExecutorProperty(Assignment2Package.Literals.PIECE__NAME, Types._Piece, 2);
		public static final ExecutorProperty _Piece__whitekImgUrl = new EcoreExecutorProperty(Assignment2Package.Literals.PIECE__WHITEK_IMG_URL, Types._Piece, 3);
		public static final ExecutorProperty _Piece__GamePiece__piece = new ExecutorPropertyWithImplementation("GamePiece", Types._Piece, 4, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.GAME_PIECE__PIECE));
		public static final ExecutorProperty _Piece__Loadout__piece = new ExecutorPropertyWithImplementation("Loadout", Types._Piece, 5, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.LOADOUT__PIECE));

		public static final ExecutorProperty _Player__eloRating = new EcoreExecutorProperty(Assignment2Package.Literals.PLAYER__ELO_RATING, Types._Player, 0);
		public static final ExecutorProperty _Player__loadout = new EcoreExecutorProperty(Assignment2Package.Literals.PLAYER__LOADOUT, Types._Player, 1);
		public static final ExecutorProperty _Player__name = new EcoreExecutorProperty(Assignment2Package.Literals.PLAYER__NAME, Types._Player, 2);
		public static final ExecutorProperty _Player__settings = new EcoreExecutorProperty(Assignment2Package.Literals.PLAYER__SETTINGS, Types._Player, 3);
		public static final ExecutorProperty _Player__Game__players = new ExecutorPropertyWithImplementation("Game", Types._Player, 4, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.GAME__PLAYERS));
		public static final ExecutorProperty _Player__Leaderboard__player = new ExecutorPropertyWithImplementation("Leaderboard", Types._Player, 5, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.LEADERBOARD__PLAYER));

		public static final ExecutorProperty _Position__x = new EcoreExecutorProperty(Assignment2Package.Literals.POSITION__X, Types._Position, 0);
		public static final ExecutorProperty _Position__y = new EcoreExecutorProperty(Assignment2Package.Literals.POSITION__Y, Types._Position, 1);
		public static final ExecutorProperty _Position__Square__position = new ExecutorPropertyWithImplementation("Square", Types._Position, 2, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.SQUARE__POSITION));

		public static final ExecutorProperty _Square__gamepiece = new EcoreExecutorProperty(Assignment2Package.Literals.SQUARE__GAMEPIECE, Types._Square, 0);
		public static final ExecutorProperty _Square__position = new EcoreExecutorProperty(Assignment2Package.Literals.SQUARE__POSITION, Types._Square, 1);
		public static final ExecutorProperty _Square__Board__square = new ExecutorPropertyWithImplementation("Board", Types._Square, 2, new EcoreLibraryOppositeProperty(Assignment2Package.Literals.BOARD__SQUARE));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Assignment2Tables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Board =
			{
				Fragments._Board__OclAny /* 0 */,
				Fragments._Board__OclElement /* 1 */,
				Fragments._Board__Board /* 2 */
			};
		private static final int /*@NonNull*/ [] __Board = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Game =
			{
				Fragments._Game__OclAny /* 0 */,
				Fragments._Game__OclElement /* 1 */,
				Fragments._Game__Game /* 2 */
			};
		private static final int /*@NonNull*/ [] __Game = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _GamePiece =
			{
				Fragments._GamePiece__OclAny /* 0 */,
				Fragments._GamePiece__OclElement /* 1 */,
				Fragments._GamePiece__GamePiece /* 2 */
			};
		private static final int /*@NonNull*/ [] __GamePiece = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Leaderboard =
			{
				Fragments._Leaderboard__OclAny /* 0 */,
				Fragments._Leaderboard__OclElement /* 1 */,
				Fragments._Leaderboard__Leaderboard /* 2 */
			};
		private static final int /*@NonNull*/ [] __Leaderboard = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Loadout =
			{
				Fragments._Loadout__OclAny /* 0 */,
				Fragments._Loadout__OclElement /* 1 */,
				Fragments._Loadout__Loadout /* 2 */
			};
		private static final int /*@NonNull*/ [] __Loadout = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Medic =
			{
				Fragments._Medic__OclAny /* 0 */,
				Fragments._Medic__OclElement /* 1 */,
				Fragments._Medic__Piece /* 2 */,
				Fragments._Medic__Medic /* 3 */
			};
		private static final int /*@NonNull*/ [] __Medic = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Pawn =
			{
				Fragments._Pawn__OclAny /* 0 */,
				Fragments._Pawn__OclElement /* 1 */,
				Fragments._Pawn__Piece /* 2 */,
				Fragments._Pawn__Pawn /* 3 */
			};
		private static final int /*@NonNull*/ [] __Pawn = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Piece =
			{
				Fragments._Piece__OclAny /* 0 */,
				Fragments._Piece__OclElement /* 1 */,
				Fragments._Piece__Piece /* 2 */
			};
		private static final int /*@NonNull*/ [] __Piece = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Player =
			{
				Fragments._Player__OclAny /* 0 */,
				Fragments._Player__OclElement /* 1 */,
				Fragments._Player__Player /* 2 */
			};
		private static final int /*@NonNull*/ [] __Player = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Position =
			{
				Fragments._Position__OclAny /* 0 */,
				Fragments._Position__OclElement /* 1 */,
				Fragments._Position__Position /* 2 */
			};
		private static final int /*@NonNull*/ [] __Position = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Rook =
			{
				Fragments._Rook__OclAny /* 0 */,
				Fragments._Rook__OclElement /* 1 */,
				Fragments._Rook__Piece /* 2 */,
				Fragments._Rook__Rook /* 3 */
			};
		private static final int /*@NonNull*/ [] __Rook = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Square =
			{
				Fragments._Square__OclAny /* 0 */,
				Fragments._Square__OclElement /* 1 */,
				Fragments._Square__Square /* 2 */
			};
		private static final int /*@NonNull*/ [] __Square = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Board.initFragments(_Board, __Board);
			Types._Game.initFragments(_Game, __Game);
			Types._GamePiece.initFragments(_GamePiece, __GamePiece);
			Types._Leaderboard.initFragments(_Leaderboard, __Leaderboard);
			Types._Loadout.initFragments(_Loadout, __Loadout);
			Types._Medic.initFragments(_Medic, __Medic);
			Types._Pawn.initFragments(_Pawn, __Pawn);
			Types._Piece.initFragments(_Piece, __Piece);
			Types._Player.initFragments(_Player, __Player);
			Types._Position.initFragments(_Position, __Position);
			Types._Rook.initFragments(_Rook, __Rook);
			Types._Square.initFragments(_Square, __Square);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Assignment2Tables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Board__Board = {
			Assignment2Tables.Operations._Board__movepiece /* movepiece() */,
			Assignment2Tables.Operations._Board__populateBoard /* populateBoard() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Board__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Board__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Game__Game = {
			Assignment2Tables.Operations._Game__getBlackPoints /* getBlackPoints() */,
			Assignment2Tables.Operations._Game__getWhitePoints /* getWhitePoints() */,
			Assignment2Tables.Operations._Game__updateElo /* updateElo() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Game__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Game__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _GamePiece__GamePiece = {};
		private static final ExecutorOperation /*@NonNull*/ [] _GamePiece__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _GamePiece__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Leaderboard__Leaderboard = {
			Assignment2Tables.Operations._Leaderboard__listProfiles /* listProfiles() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Leaderboard__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Leaderboard__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Loadout__Loadout = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Loadout__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Loadout__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Medic__Medic = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Medic__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Medic__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Medic__Piece = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Pawn__Pawn = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Pawn__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Pawn__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Pawn__Piece = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Piece__Piece = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Piece__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Piece__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Player__Player = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Player__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Player__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Position__Position = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Position__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Position__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Rook__Rook = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Rook__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Rook__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Rook__Piece = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Square__Square = {
			Assignment2Tables.Operations._Square__isOcupied /* isOcupied() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Square__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Square__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Board__Board.initOperations(_Board__Board);
			Fragments._Board__OclAny.initOperations(_Board__OclAny);
			Fragments._Board__OclElement.initOperations(_Board__OclElement);

			Fragments._Game__Game.initOperations(_Game__Game);
			Fragments._Game__OclAny.initOperations(_Game__OclAny);
			Fragments._Game__OclElement.initOperations(_Game__OclElement);

			Fragments._GamePiece__GamePiece.initOperations(_GamePiece__GamePiece);
			Fragments._GamePiece__OclAny.initOperations(_GamePiece__OclAny);
			Fragments._GamePiece__OclElement.initOperations(_GamePiece__OclElement);

			Fragments._Leaderboard__Leaderboard.initOperations(_Leaderboard__Leaderboard);
			Fragments._Leaderboard__OclAny.initOperations(_Leaderboard__OclAny);
			Fragments._Leaderboard__OclElement.initOperations(_Leaderboard__OclElement);

			Fragments._Loadout__Loadout.initOperations(_Loadout__Loadout);
			Fragments._Loadout__OclAny.initOperations(_Loadout__OclAny);
			Fragments._Loadout__OclElement.initOperations(_Loadout__OclElement);

			Fragments._Medic__Medic.initOperations(_Medic__Medic);
			Fragments._Medic__OclAny.initOperations(_Medic__OclAny);
			Fragments._Medic__OclElement.initOperations(_Medic__OclElement);
			Fragments._Medic__Piece.initOperations(_Medic__Piece);

			Fragments._Pawn__OclAny.initOperations(_Pawn__OclAny);
			Fragments._Pawn__OclElement.initOperations(_Pawn__OclElement);
			Fragments._Pawn__Pawn.initOperations(_Pawn__Pawn);
			Fragments._Pawn__Piece.initOperations(_Pawn__Piece);

			Fragments._Piece__OclAny.initOperations(_Piece__OclAny);
			Fragments._Piece__OclElement.initOperations(_Piece__OclElement);
			Fragments._Piece__Piece.initOperations(_Piece__Piece);

			Fragments._Player__OclAny.initOperations(_Player__OclAny);
			Fragments._Player__OclElement.initOperations(_Player__OclElement);
			Fragments._Player__Player.initOperations(_Player__Player);

			Fragments._Position__OclAny.initOperations(_Position__OclAny);
			Fragments._Position__OclElement.initOperations(_Position__OclElement);
			Fragments._Position__Position.initOperations(_Position__Position);

			Fragments._Rook__OclAny.initOperations(_Rook__OclAny);
			Fragments._Rook__OclElement.initOperations(_Rook__OclElement);
			Fragments._Rook__Piece.initOperations(_Rook__Piece);
			Fragments._Rook__Rook.initOperations(_Rook__Rook);

			Fragments._Square__OclAny.initOperations(_Square__OclAny);
			Fragments._Square__OclElement.initOperations(_Square__OclElement);
			Fragments._Square__Square.initOperations(_Square__Square);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Assignment2Tables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Board = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._Board__size,
			Assignment2Tables.Properties._Board__square
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Game = {
			Assignment2Tables.Properties._Game__board,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._Game__players,
			Assignment2Tables.Properties._Game__time
		};

		private static final ExecutorProperty /*@NonNull*/ [] _GamePiece = {
			Assignment2Tables.Properties._GamePiece__color,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._GamePiece__piece
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Leaderboard = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._Leaderboard__player
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Loadout = {
			Assignment2Tables.Properties._Loadout__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._Loadout__piece
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Medic = {
			Assignment2Tables.Properties._Medic__abillity,
			Assignment2Tables.Properties._Piece__blackImgUrl,
			Assignment2Tables.Properties._Piece__moveStrategy,
			Assignment2Tables.Properties._Piece__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._Piece__whitekImgUrl
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Pawn = {
			Assignment2Tables.Properties._Piece__blackImgUrl,
			Assignment2Tables.Properties._Piece__moveStrategy,
			Assignment2Tables.Properties._Piece__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._Piece__whitekImgUrl
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Piece = {
			Assignment2Tables.Properties._Piece__blackImgUrl,
			Assignment2Tables.Properties._Piece__moveStrategy,
			Assignment2Tables.Properties._Piece__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._Piece__whitekImgUrl
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Player = {
			Assignment2Tables.Properties._Player__eloRating,
			Assignment2Tables.Properties._Player__loadout,
			Assignment2Tables.Properties._Player__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._Player__settings
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Position = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._Position__x,
			Assignment2Tables.Properties._Position__y
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Rook = {
			Assignment2Tables.Properties._Piece__blackImgUrl,
			Assignment2Tables.Properties._Piece__moveStrategy,
			Assignment2Tables.Properties._Piece__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._Piece__whitekImgUrl
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Square = {
			Assignment2Tables.Properties._Square__gamepiece,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Assignment2Tables.Properties._Square__position
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Board__Board.initProperties(_Board);
			Fragments._Game__Game.initProperties(_Game);
			Fragments._GamePiece__GamePiece.initProperties(_GamePiece);
			Fragments._Leaderboard__Leaderboard.initProperties(_Leaderboard);
			Fragments._Loadout__Loadout.initProperties(_Loadout);
			Fragments._Medic__Medic.initProperties(_Medic);
			Fragments._Pawn__Pawn.initProperties(_Pawn);
			Fragments._Piece__Piece.initProperties(_Piece);
			Fragments._Player__Player.initProperties(_Player);
			Fragments._Position__Position.initProperties(_Position);
			Fragments._Rook__Rook.initProperties(_Rook);
			Fragments._Square__Square.initProperties(_Square);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Assignment2Tables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Assignment2Tables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Assignment2Tables();
	}

	private Assignment2Tables() {
		super(Assignment2Package.eNS_URI);
	}
}
