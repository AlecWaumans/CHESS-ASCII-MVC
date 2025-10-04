package chess.model.Pieces;

import chess.model.Pieces.King;
import chess.model.Pieces.Pawn;
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
public class KingTest {

    public KingTest() {
    }

    Board board;

    @BeforeEach
    public void setUp() {
        board = new Board();
    }

    /**
     * TEST CENTRE SIDE AND CORNERS OF A KING WITHOUT A SURROUNDING PIECE
     */
    @Test
    public void testGetPossibleMovesKingWCenterWhitoutPawn() {
        Position PosWhite = new Position(3, 3);
        King kingWhite = new King(Color.WHITE);
        board.setPiece(kingWhite, PosWhite);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 2);
        Position pos2 = new Position(3, 2);
        Position pos3 = new Position(4, 2);
        Position pos4 = new Position(4, 3);
        Position pos5 = new Position(4, 4);
        Position pos6 = new Position(3, 4);
        Position pos7 = new Position(2, 4);
        Position pos8 = new Position(2, 3);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);
        expected.add(pos6);
        expected.add(pos7);
        expected.add(pos8);

        List<Position> positions = kingWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesKingBCenterWhitoutPawn() {
        Position PosBlack = new Position(3, 3);
        King kingBlack = new King(Color.BLACK);
        board.setPiece(kingBlack, PosBlack);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 2);
        Position pos2 = new Position(3, 2);
        Position pos3 = new Position(4, 2);
        Position pos4 = new Position(4, 3);
        Position pos5 = new Position(4, 4);
        Position pos6 = new Position(3, 4);
        Position pos7 = new Position(2, 4);
        Position pos8 = new Position(2, 3);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);
        expected.add(pos6);
        expected.add(pos7);
        expected.add(pos8);

        List<Position> positions = kingBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesKingWLeftWhitoutPawn() {
        Position PosWhite = new Position(3, 7);
        King kingWhite = new King(Color.WHITE);
        board.setPiece(kingWhite, PosWhite);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 7);
        Position pos2 = new Position(2, 6);
        Position pos3 = new Position(3, 6);
        Position pos4 = new Position(4, 6);
        Position pos5 = new Position(4, 7);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);

        List<Position> positions = kingWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesKingBLeftWhitoutPawn() {
        Position PosBlack = new Position(3, 7);
        King kingBlack = new King(Color.BLACK);
        board.setPiece(kingBlack, PosBlack);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 7);
        Position pos2 = new Position(2, 6);
        Position pos3 = new Position(3, 6);
        Position pos4 = new Position(4, 6);
        Position pos5 = new Position(4, 7);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);

        List<Position> positions = kingBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesKingWCoinWhitoutPawn() {
        Position PosWhite = new Position(7, 7);
        King kingWhite = new King(Color.WHITE);
        board.setPiece(kingWhite, PosWhite);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(7, 6);
        Position pos2 = new Position(6, 6);
        Position pos3 = new Position(6, 7);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);

        List<Position> positions = kingWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesKingBCoinWhitoutPawn() {
        Position PosBlack = new Position(7, 7);
        King kingBlack = new King(Color.BLACK);
        board.setPiece(kingBlack, PosBlack);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(7, 6);
        Position pos2 = new Position(6, 6);
        Position pos3 = new Position(6, 7);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);

        List<Position> positions = kingBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    /**
     * TEST CENTRE SIDE AND CORNERS OF A KING WITH SOME ALLIED PIECE AROUND HIM
     */
    @Test
    public void testGetPossibleMovesKingWCenterWhitAllFriends() {
        Position PosWhite = new Position(3, 3);
        King kingWhite = new King(Color.WHITE);
        board.setPiece(kingWhite, PosWhite);

        Position PosWhite2 = new Position(3, 2);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, PosWhite2);

        Position PosWhite3 = new Position(4, 4);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 2);
        Position pos3 = new Position(4, 2);
        Position pos4 = new Position(4, 3);
        Position pos6 = new Position(3, 4);
        Position pos7 = new Position(2, 4);
        Position pos8 = new Position(2, 3);

        expected.add(pos1);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos6);
        expected.add(pos7);
        expected.add(pos8);

        List<Position> positions = kingWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesKingBCenterWhitAllFriends() {
        Position PosBlack = new Position(3, 3);
        King kingBlack = new King(Color.BLACK);
        board.setPiece(kingBlack, PosBlack);

        Position PosBlack2 = new Position(2, 2);
        Pawn pawnBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack2, PosBlack2);

        Position PosBlack3 = new Position(2, 4);
        Pawn pawnBlack3 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack3, PosBlack3);

        ArrayList expected = new ArrayList();
        Position pos2 = new Position(3, 2);
        Position pos3 = new Position(4, 2);
        Position pos4 = new Position(4, 3);
        Position pos5 = new Position(4, 4);
        Position pos6 = new Position(3, 4);
        Position pos8 = new Position(2, 3);

        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);
        expected.add(pos6);
        expected.add(pos8);

        List<Position> positions = kingBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesKingWLeftWhitAllFriends() {
        Position PosWhite = new Position(3, 7);
        King kingWhite = new King(Color.WHITE);
        board.setPiece(kingWhite, PosWhite);

        Position PosWhite2 = new Position(2, 6);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, PosWhite2);

        Position PosWhite3 = new Position(4, 7);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 7);
        Position pos3 = new Position(3, 6);
        Position pos4 = new Position(4, 6);

        expected.add(pos1);
        expected.add(pos3);
        expected.add(pos4);

        List<Position> positions = kingWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesKingBLeftWhitAllFriends() {
        Position PosBlack = new Position(3, 7);
        King kingBlack = new King(Color.BLACK);
        board.setPiece(kingBlack, PosBlack);

        Position PosBlack2 = new Position(2, 6);
        Pawn pawnBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack2, PosBlack2);

        Position PosBlack3 = new Position(4, 6);
        Pawn pawnBlack3 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack3, PosBlack3);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 7);
        Position pos3 = new Position(3, 6);
        Position pos5 = new Position(4, 7);

        expected.add(pos1);
        expected.add(pos3);
        expected.add(pos5);

        List<Position> positions = kingBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesKingWCoinWhitAllFriends() {
        Position PosWhite = new Position(7, 7);
        King kingWhite = new King(Color.WHITE);
        board.setPiece(kingWhite, PosWhite);

        Position PosWhite2 = new Position(7, 6);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, PosWhite2);

        Position PosWhite3 = new Position(6, 6);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        ArrayList expected = new ArrayList();
        Position pos3 = new Position(6, 7);

        expected.add(pos3);

        List<Position> positions = kingWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesKingBCoinWhitAllFriends() {
        Position PosBlack = new Position(7, 7);
        King kingBlack = new King(Color.BLACK);
        board.setPiece(kingBlack, PosBlack);

        Position PosBlack2 = new Position(6, 7);
        Pawn pawnBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack2, PosBlack2);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(7, 6);
        Position pos2 = new Position(6, 6);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = kingBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    /**
     * TEST CENTRE SIDE AND CORNERS OF A KING WITH SOME RAINY PIECE AROUND HIM
     */
    @Test
    public void testGetPossibleMovesKingWCenterWhitEnemy() {
        Position PosWhite = new Position(3, 3);
        King kingWhite = new King(Color.WHITE);
        board.setPiece(kingWhite, PosWhite);

        Position PosBlack2 = new Position(2, 2);
        Pawn pawnBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack2, PosBlack2);

        Position PosBlack3 = new Position(2, 4);
        Pawn pawnBlack3 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack3, PosBlack3);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 2);
        Position pos2 = new Position(3, 2);
        Position pos3 = new Position(4, 2);
        Position pos4 = new Position(4, 3);
        Position pos5 = new Position(4, 4);
        Position pos6 = new Position(3, 4);
        Position pos7 = new Position(2, 4);
        Position pos8 = new Position(2, 3);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);
        expected.add(pos6);
        expected.add(pos7);
        expected.add(pos8);

        List<Position> positions = kingWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesKingBCenterWhitEnemy() {
        Position PosBlack = new Position(3, 3);
        King kingBlack = new King(Color.BLACK);
        board.setPiece(kingBlack, PosBlack);

        Position PosWhite2 = new Position(3, 2);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, PosWhite2);

        Position PosWhite3 = new Position(4, 4);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 2);
        Position pos2 = new Position(3, 2);
        Position pos3 = new Position(4, 2);
        Position pos4 = new Position(4, 3);
        Position pos5 = new Position(4, 4);
        Position pos6 = new Position(3, 4);
        Position pos7 = new Position(2, 4);
        Position pos8 = new Position(2, 3);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);
        expected.add(pos6);
        expected.add(pos7);
        expected.add(pos8);

        List<Position> positions = kingBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesKingWLeftWhitEnemy() {
        Position PosWhite = new Position(3, 7);
        King kingWhite = new King(Color.WHITE);
        board.setPiece(kingWhite, PosWhite);

        Position PosBlack2 = new Position(2, 6);
        Pawn pawnBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack2, PosBlack2);

        Position PosBlack3 = new Position(4, 6);
        Pawn pawnBlack3 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack3, PosBlack3);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 7);
        Position pos2 = new Position(2, 6);
        Position pos3 = new Position(3, 6);
        Position pos4 = new Position(4, 6);
        Position pos5 = new Position(4, 7);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);

        List<Position> positions = kingWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesKingBLeftWhitEnemy() {
        Position PosBlack = new Position(3, 7);
        King kingBlack = new King(Color.BLACK);
        board.setPiece(kingBlack, PosBlack);

        Position PosWhite2 = new Position(2, 6);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, PosWhite2);

        Position PosWhite3 = new Position(4, 7);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 7);
        Position pos2 = new Position(2, 6);
        Position pos3 = new Position(3, 6);
        Position pos4 = new Position(4, 6);
        Position pos5 = new Position(4, 7);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);

        List<Position> positions = kingBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesKingWCoinWhitEnemy() {
        Position PosWhite = new Position(7, 7);
        King kingWhite = new King(Color.WHITE);
        board.setPiece(kingWhite, PosWhite);

        Position PosBlack2 = new Position(6, 7);
        Pawn pawnBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack2, PosBlack2);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(7, 6);
        Position pos2 = new Position(6, 6);
        Position pos3 = new Position(6, 7);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);

        List<Position> positions = kingWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesKingBCoinWhitEnemy() {
        Position PosBlack = new Position(7, 7);
        King kingBlack = new King(Color.BLACK);
        board.setPiece(kingBlack, PosBlack);

        Position PosWhite2 = new Position(7, 6);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, PosWhite2);

        Position PosWhite3 = new Position(6, 6);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(7, 6);
        Position pos2 = new Position(6, 6);
        Position pos3 = new Position(6, 7);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);

        List<Position> positions = kingBlack.getPossibleMoves(PosBlack, board);

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
