package chess.model.Pieces;

import chess.model.Pieces.Piece;
import chess.model.Pieces.Pawn;
import chess.model.Board;
import chess.model.Color;
import chess.model.Position;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author alecw
 */
public class PieceTest {

    Board board;

    @BeforeEach
    public void setUp() {
        board = new Board();
    }

    public PieceTest() {

    }

    /**
     * Test of getColor method, of class Piece.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Position PosInitWhite = new Position(1, 0);
        Pawn pawnInitWhite = new Pawn(Color.WHITE);
        board.setPiece(pawnInitWhite, PosInitWhite);
        Piece instance = pawnInitWhite;
        Color expResult = Color.WHITE;
        Color result = instance.getColor();
        assertEquals(expResult, result);
    }
    /**
     * ATTENTION : THAT THE TESTS FOR GETPOSSIBLESMOVES AND GETCAPTURESPOSITION
     * ARE IN THE TESTS OF THE PART SUBCLASSES FOR BETTER VISIBILITY OF THE
     * TESTS.
     */
}
