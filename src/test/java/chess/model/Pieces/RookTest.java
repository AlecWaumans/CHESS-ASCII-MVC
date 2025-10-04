package chess.model.Pieces;

import chess.model.Pieces.Pawn;
import chess.model.Pieces.Rook;
import chess.model.Board;
import chess.model.Color;
import chess.model.Position;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author alecw
 */
public class RookTest {

    public RookTest() {
    }

    Board board;

    @BeforeEach
    public void setUp() {
        board = new Board();
    }

    /**
     * TEST ROOK ENTOURER FROM PAWN ALLIER or ENEMY BLACK AND WHITE
     */
    @Test
    public void testGetPossibleMovesRookWALLPawnEnemy() {
        Position PosWhite = new Position(1, 6);
        Rook rookWhite = new Rook(Color.WHITE);
        board.setPiece(rookWhite, PosWhite);

        Position PosBlack2 = new Position(1, 5);
        Pawn pawnBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack2, PosBlack2);

        Position PosBlack4 = new Position(0, 6);
        Pawn pawnBlack4 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack4, PosBlack4);

        Position PosBlack6 = new Position(1, 7);
        Pawn pawnBlack6 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack6, PosBlack6);

        Position PosBlack8 = new Position(2, 6);
        Pawn pawnBlack8 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack8, PosBlack8);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(0, 6);
        Position pos2 = new Position(1, 7);
        Position pos3 = new Position(2, 6);
        Position pos4 = new Position(1, 5);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);

        List<Position> positions = rookWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesRookBALLPawnEnemy() {
        Position PosBlack = new Position(1, 6);
        Rook rookBlack = new Rook(Color.BLACK);
        board.setPiece(rookBlack, PosBlack);

        Position PosWhite2 = new Position(1, 5);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, PosWhite2);

        Position PosWhite4 = new Position(0, 6);
        Pawn pawnWhite4 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite4, PosWhite4);

        Position PosWhite6 = new Position(1, 7);
        Pawn pawnWhite6 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite6, PosWhite6);

        Position PosWhite8 = new Position(2, 6);
        Pawn pawnWhite8 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite8, PosWhite8);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(0, 6);
        Position pos2 = new Position(1, 7);
        Position pos3 = new Position(2, 6);
        Position pos4 = new Position(1, 5);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);

        List<Position> positions = rookBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesRookWALLPawnFriends() {
        Position PosWhite = new Position(1, 6);
        Rook rookWhite = new Rook(Color.WHITE);
        board.setPiece(rookWhite, PosWhite);

        Position PosWhite2 = new Position(1, 5);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, PosWhite2);

        Position PosWhite4 = new Position(0, 6);
        Pawn pawnWhite4 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite4, PosWhite4);

        Position PosWhite6 = new Position(1, 7);
        Pawn pawnWhite6 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite6, PosWhite6);

        Position PosWhite8 = new Position(2, 6);
        Pawn pawnWhite8 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite8, PosWhite8);

        ArrayList expected = new ArrayList();

        List<Position> positions = rookWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesRookBALLPawnFriends() {
        Position PosBlack = new Position(1, 6);
        Rook rookBlack = new Rook(Color.BLACK);
        board.setPiece(rookBlack, PosBlack);

        Position PosBlack2 = new Position(1, 5);
        Pawn pawnBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack2, PosBlack2);

        Position PosBlack4 = new Position(0, 6);
        Pawn pawnBlack4 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack4, PosBlack4);

        Position PosBlack6 = new Position(1, 7);
        Pawn pawnBlack6 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack6, PosBlack6);

        Position PosBlack8 = new Position(2, 6);
        Pawn pawnBlack8 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack8, PosBlack8);

        ArrayList expected = new ArrayList();

        List<Position> positions = rookBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    /**
     * MIXED ROOK TEST SURROUND ALLIER AND ENEMY
     */
    @Test
    public void testGetPossibleMovesRookBMixteEnemyFriends() {
        Position PosBlack = new Position(1, 3);
        Rook rookBlack = new Rook(Color.BLACK);
        board.setPiece(rookBlack, PosBlack);

        Position PosWhite2 = new Position(1, 2);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, PosWhite2);

        Position PosWhite4 = new Position(0, 3);
        Pawn pawnWhite4 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite4, PosWhite4);

        Position PosBlack6 = new Position(2, 3);
        Pawn pawnBlack6 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack6, PosBlack6);

        Position PosBlack8 = new Position(1, 4);
        Pawn pawnBlack8 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack8, PosBlack8);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(1, 2);
        Position pos2 = new Position(0, 3);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = rookBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    /**
     * MIXED ROOK TEST SURROUND ALLIER AND ENEMY
     */
    @Test
    public void testGetPossibleMovesRookWMixteEnemyFriends() {
        Position PosWhite = new Position(1, 3);
        Rook rookWhite = new Rook(Color.WHITE);
        board.setPiece(rookWhite, PosWhite);

        Position PosWhite2 = new Position(1, 2);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, PosWhite2);

        Position PosWhite4 = new Position(0, 3);
        Pawn pawnWhite4 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite4, PosWhite4);

        Position PosBlack6 = new Position(2, 3);
        Pawn pawnBlack6 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack6, PosBlack6);

        Position PosBlack8 = new Position(1, 4);
        Pawn pawnBlack8 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack8, PosBlack8);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 3);
        Position pos2 = new Position(1, 4);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = rookWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    /**
     * TEST ROOK random.
     */
    @Test
    public void testGetPossibleMovesRookWRandom() {
        Position PosWhite = new Position(5, 2);
        Rook rookWhite = new Rook(Color.WHITE);
        board.setPiece(rookWhite, PosWhite);

        Position PosWhite2 = new Position(5, 1);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, PosWhite2);

        Position PosWhite4 = new Position(7, 0);
        Pawn pawnWhite4 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite4, PosWhite4);

        Position PosWhite6 = new Position(7, 2);
        Pawn pawnWhite6 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite6, PosWhite6);

        Position PosBlack7 = new Position(3, 2);
        Pawn pawnBlack7 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack7, PosBlack7);

        Position PosBlack8 = new Position(5, 3);
        Pawn pawnBlack8 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack8, PosBlack8);

        Position PosBlack9 = new Position(3, 4);
        Pawn pawnBlack9 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack9, PosBlack9);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(6, 2);
        Position pos2 = new Position(5, 3);
        Position pos4 = new Position(4, 2);
        Position pos5 = new Position(3, 2);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos4);
        expected.add(pos5);

        List<Position> positions = rookWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    /*
     * Allows to test if two lists of positions are identical to the order
     * of the ready elements. This method is called
     * by the test methods.
     */
    private void assertEqualsIgnoringOrder(List<Position> expected, List<Position> actual) {
        assertEquals(expected.size(), actual.size());
        assertTrue(actual.containsAll(expected));
        assertTrue(expected.containsAll(actual));
    }

}
