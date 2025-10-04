package chess.model.Pieces;

import chess.model.Pieces.Bishop;
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
public class BishopTest {

    public BishopTest() {
    }

    Board board;

    @BeforeEach
    public void setUp() {
        board = new Board();
    }

    /**
     * TEST BISHOP SURROUNDED BY PAWN ALLY AND ENEMY BLACK AND WHITE
     */
    @Test
    public void testGetPosiibleMovesBishopWAllEnemy() {
        Position PosWhite = new Position(1, 6);
        Bishop bishopWhite = new Bishop(Color.WHITE);
        board.setPiece(bishopWhite, PosWhite);

        Position PosBlack2 = new Position(0, 5);
        Pawn pawnBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack2, PosBlack2);

        Position PosBlack3 = new Position(0, 7);
        Pawn pawnBlack3 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack3, PosBlack3);

        Position PosBlack4 = new Position(2, 5);
        Pawn pawnBlack4 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack4, PosBlack4);

        Position PosBlack5 = new Position(2, 7);
        Pawn pawnBlack5 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack5, PosBlack5);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(0, 5);
        Position pos2 = new Position(0, 7);
        Position pos3 = new Position(2, 5);
        Position pos4 = new Position(2, 7);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);

        List<Position> positions = bishopWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPosiibleMovesBishopBAllEnemy() {
        Position PosBlack = new Position(1, 6);
        Bishop bishopBlack = new Bishop(Color.BLACK);
        board.setPiece(bishopBlack, PosBlack);

        Position PosWhite2 = new Position(0, 5);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, PosWhite2);

        Position PosWhite3 = new Position(0, 7);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        Position PosWhite4 = new Position(2, 5);
        Pawn pawnWhite4 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite4, PosWhite4);

        Position PosWhite5 = new Position(2, 7);
        Pawn pawnWhite5 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite5, PosWhite5);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(0, 5);
        Position pos2 = new Position(0, 7);
        Position pos3 = new Position(2, 5);
        Position pos4 = new Position(2, 7);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);

        List<Position> positions = bishopBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPosiibleMovesBishopBAllFriends() {
        Position PosBlack = new Position(1, 6);
        Bishop bishopBlack = new Bishop(Color.BLACK);
        board.setPiece(bishopBlack, PosBlack);

        Position PosWhite2 = new Position(0, 5);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, PosWhite2);

        Position PosWhite3 = new Position(0, 7);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        Position PosWhite4 = new Position(2, 5);
        Pawn pawnWhite4 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite4, PosWhite4);

        Position PosWhite5 = new Position(2, 7);
        Pawn pawnWhite5 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite5, PosWhite5);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(0, 5);
        Position pos2 = new Position(0, 7);
        Position pos3 = new Position(2, 5);
        Position pos4 = new Position(2, 7);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);

        List<Position> positions = bishopBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    /**
     * TEST BISHOP SURROUND WITH PAWN ALLY AND ENEMY AT THE SAME TIME
     */
    @Test
    public void testGetPossibleMovesBishopWMixteFriendsEnemy() {
        Position PosBlack = new Position(1, 5);
        Bishop bishopBlack = new Bishop(Color.BLACK);
        board.setPiece(bishopBlack, PosBlack);

        Position PosWhite2 = new Position(0, 6);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, PosWhite2);

        Position PosWhite3 = new Position(2, 4);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        Position PosBlack4 = new Position(0, 4);
        Pawn pawnBlack4 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack4, PosBlack4);

        Position PosBlack5 = new Position(2, 6);
        Pawn pawnBlack5 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack5, PosBlack5);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(0, 6);
        Position pos2 = new Position(2, 4);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = bishopBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesBishopBMixteFriendsEnemy() {
        Position PosBlack = new Position(1, 2);
        Bishop bishopBlack = new Bishop(Color.BLACK);
        board.setPiece(bishopBlack, PosBlack);

        Position PosWhite2 = new Position(0, 1);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, PosWhite2);

        Position PosWhite3 = new Position(2, 3);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        Position PosBlack4 = new Position(0, 3);
        Pawn pawnBlack4 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack4, PosBlack4);

        Position PosBlack5 = new Position(2, 1);
        Pawn pawnBlack5 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack5, PosBlack5);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(0, 1);
        Position pos2 = new Position(2, 3);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = bishopBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    /**
     * TEST BISHOP RANDOM POSITION
     */
    @Test
    public void testGetPossibleMovesBishopBRandom1() {
        Position PosBlack = new Position(5, 2);
        Bishop bishopBlack = new Bishop(Color.BLACK);
        board.setPiece(bishopBlack, PosBlack);

        Position PosWhite2 = new Position(4, 1);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, PosWhite2);

        Position PosWhite3 = new Position(7, 4);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        Position PosBlack4 = new Position(6, 2);
        Pawn pawnBlack4 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack4, PosBlack4);

        Position PosBlack5 = new Position(3, 4);
        Pawn pawnBlack5 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack5, PosBlack5);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(4, 1);
        Position pos2 = new Position(4, 3);
        Position pos3 = new Position(6, 3);
        Position pos4 = new Position(7, 4);
        Position pos5 = new Position(6, 1);
        Position pos6 = new Position(7, 0);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);
        expected.add(pos6);

        List<Position> positions = bishopBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesbishopWRandom2() {
        Position PosWhite = new Position(3, 2);
        Bishop bishopWhite = new Bishop(Color.WHITE);
        board.setPiece(bishopWhite, PosWhite);

        Position PosWhite2 = new Position(5, 0);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, PosWhite2);

        Position PosWhite3 = new Position(1, 0);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        Position PosWhite4 = new Position(0, 5);
        Pawn pawnWhite4 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite4, PosWhite4);

        Position PosBlack5 = new Position(6, 5);
        Pawn pawnBlack5 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack5, PosBlack5);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 1);
        Position pos2 = new Position(4, 1);
        Position pos3 = new Position(4, 3);
        Position pos4 = new Position(5, 4);
        Position pos5 = new Position(6, 5);
        Position pos6 = new Position(2, 3);
        Position pos7 = new Position(1, 4);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);
        expected.add(pos6);
        expected.add(pos7);

        List<Position> positions = bishopWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesbishopBBRandom2() {
        Position PosBlack = new Position(3, 2);
        Bishop bishopBlack = new Bishop(Color.BLACK);
        board.setPiece(bishopBlack, PosBlack);

        Position PosWhite2 = new Position(5, 0);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, PosWhite2);

        Position PosWhite3 = new Position(1, 0);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        Position PosWhite4 = new Position(0, 5);
        Pawn pawnWhite4 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite4, PosWhite4);

        Position PosBlack5 = new Position(6, 5);
        Pawn pawnBlack5 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack5, PosBlack5);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 1);
        Position pos2 = new Position(4, 1);
        Position pos3 = new Position(4, 3);
        Position pos4 = new Position(5, 4);
        Position pos5 = new Position(5, 0);
        Position pos6 = new Position(2, 3);
        Position pos7 = new Position(1, 4);
        Position pos8 = new Position(0, 5);
        Position pos9 = new Position(1, 0);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);
        expected.add(pos6);
        expected.add(pos7);
        expected.add(pos8);
        expected.add(pos9);

        List<Position> positions = bishopBlack.getPossibleMoves(PosBlack, board);

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
