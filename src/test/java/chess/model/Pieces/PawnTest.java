package chess.model.Pieces;

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
public class PawnTest {

    Board board;

    @BeforeEach
    public void setUp() {
        board = new Board();
    }

    @Test
    public void testGetPossibleMovesPosInitialW() {
        System.out.println("This method will test the moves if the piece is on the initial "
                + "pos and if there are no piece in front of it and if the piece is white. ");
        Position PosInitWhite = new Position(1, 0);
        Pawn pawnInitWhite = new Pawn(Color.WHITE);
        board.setPiece(pawnInitWhite, PosInitWhite);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 0);
        Position pos2 = new Position(3, 0);
        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = pawnInitWhite.getPossibleMoves(PosInitWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesPosInitialN() {
        System.out.println("This method will test the moves if the piece is on the initial position "
                + "and if there are no pieces in front of it and if the piece is black. ");
        Position PosInitBlack = new Position(6, 0);
        Pawn pawnInitBLACK = new Pawn(Color.BLACK);
        board.setPiece(pawnInitBLACK, PosInitBlack);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(5, 0);
        Position pos2 = new Position(4, 0);
        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = pawnInitBLACK.getPossibleMoves(PosInitBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesPosW() {
        System.out.println("This method will test the moves if there are no piece in front of him "
                + "and if the piece is white and he is not on his initial position.");
        Position PosWhite = new Position(2, 0);
        Pawn pawnWhite = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite, PosWhite);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(3, 0);

        expected.add(pos1);

        List<Position> positions = pawnWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesPosB() {
        System.out.println("This method will test the moves if there are no piece in front of him "
                + "and if the piece is black and he is not on his initial position. ");
        Position PosBlack = new Position(5, 0);
        Pawn pawnBlack = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack, PosBlack);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(4, 0);

        expected.add(pos1);

        List<Position> positions = pawnBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesPosWPionsNW() {
        System.out.println("This method will test the moves if there is a piece in NW in front of it "
                + "and if the piece is white and it is not on its initial position. ");
        Position PosWhite = new Position(2, 1);
        Pawn pawnWhite = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite, PosWhite);

        Position PosBlack = new Position(3, 0);
        Pawn pawnBlack = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack, PosBlack);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(3, 1);
        Position pos2 = new Position(3, 0);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = pawnWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesPosBPionsSE() {
        System.out.println("This method will test the moves if there is a SE piece in front of it "
                + "and if the piece is black and it is not on its initial position. ");
        Position PosBlack = new Position(5, 1);
        Pawn pionBlack = new Pawn(Color.BLACK);
        board.setPiece(pionBlack, PosBlack);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(4, 1);
        Position pos2 = new Position(4, 2);

        Position PosWhite = new Position(4, 2);
        Pawn pionWhite = new Pawn(Color.WHITE);
        board.setPiece(pionWhite, PosWhite);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = pionBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesPosWPionsNE() {
        System.out.println("This method will test the moves if there is a NE piece in front of it "
                + "and if the piece is white and it is not on its initial position. ");
        Position PosWhite = new Position(2, 1);
        Pawn pionWhite = new Pawn(Color.WHITE);
        board.setPiece(pionWhite, PosWhite);

        Position PosBlack = new Position(3, 2);
        Pawn pionBlack = new Pawn(Color.BLACK);
        board.setPiece(pionBlack, PosBlack);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(3, 1);
        Position pos2 = new Position(3, 2);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = pionWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesPosBPionsSW() {
        System.out.println("This method will test the moves if there is a SW piece in front of it "
                + "and if the piece is black and it is not on its initial position. ");
        Position PosBlack = new Position(5, 1);
        Pawn pionBlack = new Pawn(Color.BLACK);
        board.setPiece(pionBlack, PosBlack);

        Position PosWhite = new Position(4, 0);
        Pawn pionWhite = new Pawn(Color.WHITE);
        board.setPiece(pionWhite, PosWhite);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(4, 1);
        Position pos2 = new Position(4, 0);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = pionBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesPosWPions2Diagonales() {
        System.out.println("This method will test the moves if there are two piece in front of him "
                + "and if the piece is white and he is not on his initial position. ");
        Position PosWhite = new Position(2, 1);
        Pawn pionWhite = new Pawn(Color.WHITE);
        board.setPiece(pionWhite, PosWhite);

        Position PosBlack = new Position(3, 2);
        Pawn pionBlack = new Pawn(Color.BLACK);
        board.setPiece(pionBlack, PosBlack);

        Position PosBlack2 = new Position(3, 0);
        Pawn pionBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pionBlack2, PosBlack2);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(3, 1);
        Position pos2 = new Position(3, 2);
        Position pos3 = new Position(3, 0);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);

        List<Position> positions = pionWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesPosBPions2diagonales() {
        System.out.println("This method will test the moves if there are 2 piece diagonally in front of him "
                + "and if the piece is white and he is not on his initial position. ");
        Position PosBlack = new Position(5, 1);
        Pawn pionBlack = new Pawn(Color.BLACK);
        board.setPiece(pionBlack, PosBlack);

        Position PosWhite = new Position(4, 0);
        Pawn pionWhite = new Pawn(Color.WHITE);
        board.setPiece(pionWhite, PosWhite);

        Position PosWhite2 = new Position(4, 2);
        Pawn pionWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pionWhite2, PosWhite2);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(4, 1);
        Position pos2 = new Position(4, 2);
        Position pos3 = new Position(4, 0);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);

        List<Position> positions = pionBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesWNull() {
        System.out.println("This method will test the moves if there is an opposing piece in front of him "
                + "and if the piece is white. ");
        Position PosInitWhite = new Position(1, 0);
        Pawn pionInitWhite = new Pawn(Color.WHITE);
        board.setPiece(pionInitWhite, PosInitWhite);

        Position PosBlack = new Position(2, 0);
        Pawn pionBlack = new Pawn(Color.BLACK);
        board.setPiece(pionBlack, PosBlack);

        ArrayList expected = new ArrayList();

        List<Position> positions = pionInitWhite.getPossibleMoves(PosInitWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesBNull() {
        System.out.println("This method will test the moves if there is an opponent's piece in front "
                + "and if the piece is black. ");
        Position PosInitBlack = new Position(6, 0);
        Pawn pawnInitBlack = new Pawn(Color.BLACK);
        board.setPiece(pawnInitBlack, PosInitBlack);

        Position PosWhite = new Position(5, 0);
        Pawn pionWhite = new Pawn(Color.WHITE);
        board.setPiece(pionWhite, PosWhite);

        ArrayList expected = new ArrayList();

        List<Position> positions = pawnInitBlack.getPossibleMoves(PosInitBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesW1Face1NE() {
        System.out.println("This method will test the moves if there is an opponent's piece in front "
                + "and one in the NE if the piece is white. ");
        Position PosInitWhite = new Position(2, 1);
        Pawn pionInitWhite = new Pawn(Color.WHITE);
        board.setPiece(pionInitWhite, PosInitWhite);

        Position PosBlack = new Position(3, 1);
        Pawn pionBlack = new Pawn(Color.BLACK);
        board.setPiece(pionBlack, PosBlack);

        Position PosBlack2 = new Position(3, 2);
        Pawn pionBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pionBlack2, PosBlack2);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(3, 2);

        expected.add(pos1);

        List<Position> positions = pionInitWhite.getPossibleMoves(PosInitWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesB1Face1SE() {
        System.out.println("This method will test the moves if there is an opposing piece in front "
                + "and an opposing piece to the SE if the piece is black. ");
        Position PosInitBlack = new Position(5, 1);
        Pawn pionInitBlack = new Pawn(Color.BLACK);
        board.setPiece(pionInitBlack, PosInitBlack);

        Position PosWhite = new Position(4, 1);
        Pawn pionWhite = new Pawn(Color.WHITE);
        board.setPiece(pionWhite, PosWhite);

        Position PosWhite2 = new Position(4, 2);
        Pawn pionWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pionWhite2, PosWhite2);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(4, 2);

        expected.add(pos1);

        List<Position> positions = pionInitBlack.getPossibleMoves(PosInitBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesW1Face1NW() {
        System.out.println("This method will test the moves if there is an opponent's piece in front "
                + "and an opponent's piece to the NW if the piece is white. ");
        Position PosInitWhite = new Position(2, 1);
        Pawn pionInitWhite = new Pawn(Color.WHITE);
        board.setPiece(pionInitWhite, PosInitWhite);

        Position PosBlack = new Position(3, 1);
        Pawn pionBlack = new Pawn(Color.BLACK);
        board.setPiece(pionBlack, PosBlack);

        Position PosBlack2 = new Position(3, 0);
        Pawn pionBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pionBlack2, PosBlack2);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(3, 0);

        expected.add(pos1);

        List<Position> positions = pionInitWhite.getPossibleMoves(PosInitWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesB1Face1SW() {
        System.out.println("This method will test the moves if there is an opposing piece in front "
                + "and an opposing piece in the SW if the piece is black. ");
        Position PosInitBlack = new Position(5, 1);
        Pawn pionInitBlack = new Pawn(Color.BLACK);
        board.setPiece(pionInitBlack, PosInitBlack);

        Position PosWhite = new Position(4, 1);
        Pawn pionWhite = new Pawn(Color.WHITE);
        board.setPiece(pionWhite, PosWhite);

        Position PosWhite2 = new Position(4, 0);
        Pawn pionWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pionWhite2, PosWhite2);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(4, 0);

        expected.add(pos1);

        List<Position> positions = pionInitBlack.getPossibleMoves(PosInitBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesW1Face1NW1NE() {
        System.out.println("This method will test the moves if there is an opponent's piece in front "
                + "and an opponent's piece in the NW "
                + "and an opponent's piece in the NE "
                + "if the piece is white. ");
        Position PosInitWhite = new Position(2, 1);
        Pawn pionInitWhite = new Pawn(Color.WHITE);
        board.setPiece(pionInitWhite, PosInitWhite);

        Position PosBlack = new Position(3, 1);
        Pawn pionBlack = new Pawn(Color.BLACK);
        board.setPiece(pionBlack, PosBlack);

        Position PosBlack2 = new Position(3, 0);
        Pawn pionBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pionBlack2, PosBlack2);

        Position PosBlack3 = new Position(3, 2);
        Pawn pionBlack3 = new Pawn(Color.BLACK);
        board.setPiece(pionBlack3, PosBlack3);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(3, 0);
        Position pos2 = new Position(3, 2);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = pionInitWhite.getPossibleMoves(PosInitWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesB1Face1SW1SE() {
        System.out.println("This method will test the moves if there is an opponent piece in front "
                + "and an opponent piece to the SW "
                + "and an opponent to the SE "
                + "if the piece is black. ");
        Position PosInitBlack = new Position(5, 1);
        Pawn pionInitBlack = new Pawn(Color.BLACK);
        board.setPiece(pionInitBlack, PosInitBlack);

        Position PosWhite = new Position(4, 1);
        Pawn pionWhite = new Pawn(Color.WHITE);
        board.setPiece(pionWhite, PosWhite);

        Position PosWhite2 = new Position(4, 0);
        Pawn pionWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pionWhite2, PosWhite2);

        Position PosWhite3 = new Position(4, 2);
        Pawn pionWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pionWhite3, PosWhite3);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(4, 0);
        Position pos2 = new Position(4, 2);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = pionInitBlack.getPossibleMoves(PosInitBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetCapturesPositionsB1Sw1Se() {
        System.out.println("Capture position by testing with an initial black pos pawn with 1 white SW and 1 SE pawn");

        Position PosInitBlack = new Position(6, 1);
        Pawn pionInitBlack = new Pawn(Color.BLACK);
        board.setPiece(pionInitBlack, PosInitBlack);

        Position PosWhite = new Position(5, 0);
        Pawn pionWhite = new Pawn(Color.WHITE);
        board.setPiece(pionWhite, PosWhite);

        Position PosWhite2 = new Position(5, 2);
        Pawn pionWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pionWhite2, PosWhite2);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(5, 0);
        Position pos2 = new Position(5, 2);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = pionInitBlack.getCapturePositions(PosInitBlack, board);
        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetCapturesPositionsB1Sw() {
        System.out.println("Capture position by testing with an initial black pos pawn with 1 white SW pawn");

        Position PosInitBlack = new Position(6, 4);
        Pawn pionInitBlack = new Pawn(Color.BLACK);
        board.setPiece(pionInitBlack, PosInitBlack);

        Position PosWhite = new Position(5, 3);
        Pawn pionWhite = new Pawn(Color.WHITE);
        board.setPiece(pionWhite, PosWhite);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(5, 3);

        expected.add(pos1);

        List<Position> positions = pionInitBlack.getCapturePositions(PosInitBlack, board);
        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetCapturesPositionsB1Se() {
        System.out.println("Capture position by testing with an initial black pos pawn with 1 white SE pawn");

        Position PosInitBlack = new Position(6, 6);
        Pawn pionInitBlack = new Pawn(Color.BLACK);
        board.setPiece(pionInitBlack, PosInitBlack);

        Position PosWhite = new Position(5, 7);
        Pawn pionWhite = new Pawn(Color.WHITE);
        board.setPiece(pionWhite, PosWhite);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(5, 7);

        expected.add(pos1);

        List<Position> positions = pionInitBlack.getCapturePositions(PosInitBlack, board);
        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetCapturesPositionsW1NW1NE() {
        System.out.println("Capture position by testing with a White pawn initial position with 1 Black pawn NW and 1 NE");

        Position PosInitWhite = new Position(1, 1);
        Pawn pionInitWhite = new Pawn(Color.WHITE);
        board.setPiece(pionInitWhite, PosInitWhite);

        Position PosBlack = new Position(2, 0);
        Pawn pionBlack = new Pawn(Color.BLACK);
        board.setPiece(pionBlack, PosBlack);

        Position PosBlack2 = new Position(2, 2);
        Pawn pionBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pionBlack2, PosBlack2);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 0);
        Position pos2 = new Position(2, 2);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = pionInitWhite.getCapturePositions(PosInitWhite, board);
        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetCapturesPositionsW1NW() {
        System.out.println("Capture position by testing with a White pawn initial position with 1 Black pawn NW");

        Position PosInitWhite = new Position(1, 1);
        Pawn pionInitWhite = new Pawn(Color.WHITE);
        board.setPiece(pionInitWhite, PosInitWhite);

        Position PosBlack = new Position(2, 0);
        Pawn pionBlack = new Pawn(Color.BLACK);
        board.setPiece(pionBlack, PosBlack);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 0);

        expected.add(pos1);

        List<Position> positions = pionInitWhite.getCapturePositions(PosInitWhite, board);
        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetCapturesPositionsW1NE() {
        System.out.println("Capture position by testing with a White pawn initial position with 1 Black pawn NE");

        Position PosInitWhite = new Position(1, 1);
        Pawn pionInitWhite = new Pawn(Color.WHITE);
        board.setPiece(pionInitWhite, PosInitWhite);

        Position PosBlack2 = new Position(2, 2);
        Pawn pionBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pionBlack2, PosBlack2);

        ArrayList expected = new ArrayList();
        Position pos2 = new Position(2, 2);

        expected.add(pos2);

        List<Position> positions = pionInitWhite.getCapturePositions(PosInitWhite, board);
        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetCapturesPositionsW1NW1NEPasInitial() {
        System.out.println("Capture position by testing with a white pawn with 1 black pawn NW and 1 NE");

        Position PosInitWhite = new Position(3, 3);
        Pawn pionInitWhite = new Pawn(Color.WHITE);
        board.setPiece(pionInitWhite, PosInitWhite);

        Position PosBlack = new Position(4, 2);
        Pawn pionBlack = new Pawn(Color.BLACK);
        board.setPiece(pionBlack, PosBlack);

        Position PosBlack2 = new Position(4, 4);
        Pawn pionBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pionBlack2, PosBlack2);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(4, 2);
        Position pos2 = new Position(4, 4);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = pionInitWhite.getCapturePositions(PosInitWhite, board);
        assertEqualsIgnoringOrder(expected, positions);
    }

    @Test
    public void testGetCapturesPositionsB1Sw1SePasInitial() {
        System.out.println("Capture position by testing with a black pawn with 1 white pawn SW and 1 SE");

        Position PosInitBlack = new Position(4, 6);
        Pawn pionInitBlack = new Pawn(Color.BLACK);
        board.setPiece(pionInitBlack, PosInitBlack);

        Position PosWhite = new Position(3, 5);
        Pawn pionWhite = new Pawn(Color.WHITE);
        board.setPiece(pionWhite, PosWhite);

        Position PosWhite2 = new Position(3, 7);
        Pawn pionWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pionWhite2, PosWhite2);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(3, 5);
        Position pos2 = new Position(3, 7);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = pionInitBlack.getCapturePositions(PosInitBlack, board);
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
