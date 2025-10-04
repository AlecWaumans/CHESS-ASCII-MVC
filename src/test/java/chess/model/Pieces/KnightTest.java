package chess.model.Pieces;

import chess.model.Pieces.Knight;
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
public class KnightTest {

    Board board;

    @BeforeEach
    public void setUp() {
        board = new Board();
    }

    /**
     * WITHOUT A PAWN ON THE POSSIBLE POSITIONS
     */
    @Test
    public void testGetPossibleMovesWCentrewithoutPawn() {
        System.out.println("Knight in the centre with no Piece around him (White) ");
        Position posKnightWhite = new Position(4, 3);
        Knight KnightWhite = new Knight(Color.WHITE);
        board.setPiece(KnightWhite, posKnightWhite);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(3, 1);
        Position pos2 = new Position(2, 2);
        Position pos3 = new Position(2, 4);
        Position pos4 = new Position(3, 5);
        Position pos5 = new Position(5, 5);
        Position pos6 = new Position(6, 4);
        Position pos7 = new Position(6, 2);
        Position pos8 = new Position(5, 1);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);
        expected.add(pos6);
        expected.add(pos7);
        expected.add(pos8);

        List<Position> positions = KnightWhite.getPossibleMoves(posKnightWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesBCentreSansPionswithoutPawn() {
        System.out.println("Knight in the centre with no Piece around him (Black) ");
        Position posKnightBlack = new Position(4, 3);
        Knight KnightBlack = new Knight(Color.BLACK);
        board.setPiece(KnightBlack, posKnightBlack);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(3, 1);
        Position pos2 = new Position(2, 2);
        Position pos3 = new Position(2, 4);
        Position pos4 = new Position(3, 5);
        Position pos5 = new Position(5, 5);
        Position pos6 = new Position(6, 4);
        Position pos7 = new Position(6, 2);
        Position pos8 = new Position(5, 1);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);
        expected.add(pos6);
        expected.add(pos7);
        expected.add(pos8);

        List<Position> positions = KnightBlack.getPossibleMoves(posKnightBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesWCoinswithoutPawn() {
        Position posKnightWhite = new Position(0, 0);
        Knight KnightWhite = new Knight(Color.WHITE);
        board.setPiece(KnightWhite, posKnightWhite);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 1);
        Position pos2 = new Position(1, 2);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = KnightWhite.getPossibleMoves(posKnightWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesBCoinsWithoutPawn() {
        Position posKnightBlack = new Position(7, 0);
        Knight KnightBlack = new Knight(Color.BLACK);
        board.setPiece(KnightBlack, posKnightBlack);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(6, 2);
        Position pos2 = new Position(5, 1);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = KnightBlack.getPossibleMoves(posKnightBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesBCotéWithoutPawn() {
        Position posKnightBlack = new Position(3, 7);
        Knight KnightBlack = new Knight(Color.BLACK);
        board.setPiece(KnightBlack, posKnightBlack);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(1, 6);
        Position pos2 = new Position(2, 5);
        Position pos3 = new Position(4, 5);
        Position pos4 = new Position(5, 6);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);

        List<Position> positions = KnightBlack.getPossibleMoves(posKnightBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesWCotéWithoutPawn() {
        Position posKnightWhite = new Position(3, 0);
        Knight KnightWhite = new Knight(Color.WHITE);
        board.setPiece(KnightWhite, posKnightWhite);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(1, 1);
        Position pos2 = new Position(2, 2);
        Position pos3 = new Position(4, 2);
        Position pos4 = new Position(5, 1);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);

        List<Position> positions = KnightWhite.getPossibleMoves(posKnightWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    /**
     * CORNERS WITH ADVERTIZED PIECES ALL AROUND HIM EXCEPT ON THE POSSIBLE
     * POSITIONS.TO TEST THE RIDER'S JUMP.
     */
    @Test
    public void testGetPossibleMovesWCoinsPieceJumping() {
        Position posKnightWhite = new Position(0, 0);
        Knight KnightWhite = new Knight(Color.WHITE);
        board.setPiece(KnightWhite, posKnightWhite);

        Position posPawnBlack = new Position(1, 0);
        Pawn pawnBlack = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack, posPawnBlack);

        Position posPawnBlack2 = new Position(1, 1);
        Pawn PawnBlack2 = new Pawn(Color.BLACK);
        board.setPiece(PawnBlack2, posPawnBlack2);

        Position posPawnBlac3 = new Position(0, 1);
        Pawn pawnBlack3 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack3, posPawnBlac3);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 1);
        Position pos2 = new Position(1, 2);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = KnightWhite.getPossibleMoves(posKnightWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesBCoinsPieceJumping() {
        Position posKnightBlack = new Position(7, 0);
        Knight KnightBlack = new Knight(Color.BLACK);
        board.setPiece(KnightBlack, posKnightBlack);

        Position posPawnWhite = new Position(6, 0);
        Pawn pawnWhite = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite, posPawnWhite);

        Position posPawnWhite2 = new Position(6, 1);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, posPawnWhite2);

        Position posPawnWhite3 = new Position(7, 1);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, posPawnWhite3);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(6, 2);
        Position pos2 = new Position(5, 1);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = KnightBlack.getPossibleMoves(posKnightBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    /**
     * CORNER WITH PIECES Allier ALL AROUND EXCEPT ON THE POSITIONS TO TEST THE
     * RIDER'S JUMPS.
     */
    @Test
    public void testGetPossibleMovesWCoinsPieceJumpingFriends() {
        Position posKnightWhite = new Position(0, 0);
        Knight KnightWhite = new Knight(Color.WHITE);
        board.setPiece(KnightWhite, posKnightWhite);

        Position posPawnWhite = new Position(1, 0);
        Pawn pawnWhite = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite, posPawnWhite);

        Position posPawnWhite2 = new Position(1, 1);
        Pawn PawnBlack2 = new Pawn(Color.WHITE);
        board.setPiece(PawnBlack2, posPawnWhite2);

        Position posPawnWhite3 = new Position(0, 1);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, posPawnWhite3);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 1);
        Position pos2 = new Position(1, 2);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = KnightWhite.getPossibleMoves(posKnightWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesBCoinsPieceJumpingFriends() {
        Position posKnightBlack = new Position(7, 0);
        Knight KnightBlack = new Knight(Color.BLACK);
        board.setPiece(KnightBlack, posKnightBlack);

        Position posPawnBLACK = new Position(6, 0);
        Pawn pawnBLACK = new Pawn(Color.BLACK);
        board.setPiece(pawnBLACK, posPawnBLACK);

        Position posPawnBLACK2 = new Position(6, 1);
        Pawn pawnBLACK2 = new Pawn(Color.BLACK);
        board.setPiece(pawnBLACK2, posPawnBLACK2);

        Position posPawnBLACK3 = new Position(7, 1);
        Pawn pawnBLACK3 = new Pawn(Color.BLACK);
        board.setPiece(pawnBLACK3, posPawnBLACK3);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(6, 2);
        Position pos2 = new Position(5, 1);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = KnightBlack.getPossibleMoves(posKnightBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    /**
     * TEST WITH SOME OPPOSING PIECE ON THE POSITIONS QUOTED CENTRES
     */
    @Test
    public void testGetPossibleMovesWCentreWhitPawn() {
        System.out.println("Knight dans le centre avec aucune piece autour de lui (White) ");
        Position posKnightWhite = new Position(4, 3);
        Knight KnightWhite = new Knight(Color.WHITE);
        board.setPiece(KnightWhite, posKnightWhite);

        Position posPawnBLACK = new Position(3, 1);
        Pawn pawnBLACK = new Pawn(Color.BLACK);
        board.setPiece(pawnBLACK, posPawnBLACK);

        Position posPawnBLACK2 = new Position(5, 5);
        Pawn pawnBLACK2 = new Pawn(Color.BLACK);
        board.setPiece(pawnBLACK2, posPawnBLACK2);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(3, 1);
        Position pos2 = new Position(2, 2);
        Position pos3 = new Position(2, 4);
        Position pos4 = new Position(3, 5);
        Position pos5 = new Position(5, 5);
        Position pos6 = new Position(6, 4);
        Position pos7 = new Position(6, 2);
        Position pos8 = new Position(5, 1);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);
        expected.add(pos6);
        expected.add(pos7);
        expected.add(pos8);

        List<Position> positions = KnightWhite.getPossibleMoves(posKnightWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesWCornersWithAdversePieces() {
        Position posKnightWhite = new Position(0, 0);
        Knight KnightWhite = new Knight(Color.WHITE);
        board.setPiece(KnightWhite, posKnightWhite);

        Position posPawnBlack = new Position(2, 1);
        Pawn pawnBlack = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack, posPawnBlack);

        Position posPawnBlack2 = new Position(1, 2);
        Pawn PawnBlack2 = new Pawn(Color.BLACK);
        board.setPiece(PawnBlack2, posPawnBlack2);

        Position posPawnBlac3 = new Position(1, 1);
        Pawn pawnBlack3 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack3, posPawnBlac3);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 1);
        Position pos2 = new Position(1, 2);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = KnightWhite.getPossibleMoves(posKnightWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesBCornersWithAdverse() {
        Position posKnightBlack = new Position(7, 0);
        Knight KnightBlack = new Knight(Color.BLACK);
        board.setPiece(KnightBlack, posKnightBlack);

        Position posPawnWhite = new Position(5, 1);
        Pawn pawnBlack = new Pawn(Color.WHITE);
        board.setPiece(pawnBlack, posPawnWhite);

        Position posPawnWhite2 = new Position(6, 2);
        Pawn PawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(PawnWhite2, posPawnWhite2);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(5, 1);
        Position pos2 = new Position(6, 2);

        expected.add(pos1);
        expected.add(pos2);

        List<Position> positions = KnightBlack.getPossibleMoves(posKnightBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    /**
     * TEST WITH SOME ALLIED PIECE ON THE POSITIONS
     */
    @Test
    public void testGetPossibleMovesWCenterWhitPawnFriends() {
        Position posKnightWhite = new Position(4, 3);
        Knight KnightWhite = new Knight(Color.WHITE);
        board.setPiece(KnightWhite, posKnightWhite);

        Position posPawnWHITE = new Position(3, 1);
        Pawn pawnWhite = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite, posPawnWHITE);

        Position posPawnWhite2 = new Position(5, 5);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, posPawnWhite2);

        ArrayList expected = new ArrayList();
        Position pos2 = new Position(2, 2);
        Position pos3 = new Position(2, 4);
        Position pos4 = new Position(3, 5);
        Position pos6 = new Position(6, 4);
        Position pos7 = new Position(6, 2);
        Position pos8 = new Position(5, 1);

        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos6);
        expected.add(pos7);
        expected.add(pos8);

        List<Position> positions = KnightWhite.getPossibleMoves(posKnightWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesWCoinsWhitPawnFriends() {
        Position posKnightWhite = new Position(0, 0);
        Knight KnightWhite = new Knight(Color.WHITE);
        board.setPiece(KnightWhite, posKnightWhite);

        Position posPawnWhite = new Position(2, 1);
        Pawn pawnWhite = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite, posPawnWhite);

        Position posPawnWhite2 = new Position(1, 2);
        Pawn PawnBlack2 = new Pawn(Color.WHITE);
        board.setPiece(PawnBlack2, posPawnWhite2);

        ArrayList expected = new ArrayList();

        List<Position> positions = KnightWhite.getPossibleMoves(posKnightWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesBCoinsWhitPawnFriends() {
        Position posKnightBlack = new Position(7, 0);
        Knight KnightBlack = new Knight(Color.BLACK);
        board.setPiece(KnightBlack, posKnightBlack);

        Position posPawnBLACK = new Position(5, 1);
        Pawn pawnBLACK = new Pawn(Color.BLACK);
        board.setPiece(pawnBLACK, posPawnBLACK);

        Position posPawnBLACK2 = new Position(6, 2);
        Pawn pawnBLACK2 = new Pawn(Color.BLACK);
        board.setPiece(pawnBLACK2, posPawnBLACK2);

        ArrayList expected = new ArrayList();

        List<Position> positions = KnightBlack.getPossibleMoves(posKnightBlack, board);

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
