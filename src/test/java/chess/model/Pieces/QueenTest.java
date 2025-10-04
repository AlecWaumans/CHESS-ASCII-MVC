package chess.model.Pieces;

import chess.model.Pieces.Queen;
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
public class QueenTest {

    public QueenTest() {
    }

    Board board;

    @BeforeEach
    public void setUp() {
        board = new Board();
    }

    /**
     * QUEEN'S TEST SURROUND ENEMY PAWNS
     */
    @Test
    public void testGetPossibleMovesQueenWAllEnemy() {
        Position PosWhite = new Position(3, 5);
        Queen queenWhite = new Queen(Color.WHITE);
        board.setPiece(queenWhite, PosWhite);

        Position PosBlack2 = new Position(2, 5);
        Pawn pawnBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack2, PosBlack2);

        Position PosBlack3 = new Position(2, 6);
        Pawn pawnBlack3 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack3, PosBlack3);

        Position PosBlack4 = new Position(3, 6);
        Pawn pawnBlack4 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack4, PosBlack4);

        Position PosBlack5 = new Position(4, 6);
        Pawn pawnBlack5 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack5, PosBlack5);

        Position PosBlack6 = new Position(4, 5);
        Pawn pawnBlack6 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack6, PosBlack6);

        Position PosBlack7 = new Position(4, 4);
        Pawn pawnBlack7 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack7, PosBlack7);

        Position PosBlack8 = new Position(3, 4);
        Pawn pawnBlack8 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack8, PosBlack8);

        Position PosBlack9 = new Position(2, 4);
        Pawn pawnBlack9 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack9, PosBlack9);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 5);
        Position pos2 = new Position(2, 6);
        Position pos3 = new Position(3, 6);
        Position pos4 = new Position(4, 6);
        Position pos5 = new Position(4, 5);
        Position pos6 = new Position(4, 4);
        Position pos7 = new Position(3, 4);
        Position pos8 = new Position(2, 4);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);
        expected.add(pos6);
        expected.add(pos7);
        expected.add(pos8);

        List<Position> positions = queenWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesQueenBAllEnemy() {
        Position PosBlack = new Position(3, 5);
        Queen queenBlack = new Queen(Color.BLACK);
        board.setPiece(queenBlack, PosBlack);

        Position PosWhite2 = new Position(2, 5);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, PosWhite2);

        Position PosWhite3 = new Position(2, 6);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        Position PosWhite4 = new Position(3, 6);
        Pawn pawnWhite4 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite4, PosWhite4);

        Position PosWhite5 = new Position(4, 6);
        Pawn pawnWhite5 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite5, PosWhite5);

        Position PosWhite6 = new Position(4, 5);
        Pawn pawnWhite6 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite6, PosWhite6);

        Position PosWhite7 = new Position(4, 4);
        Pawn pawnWhite7 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite7, PosWhite7);

        Position PosWhite8 = new Position(3, 4);
        Pawn pawnWhite8 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite8, PosWhite8);

        Position PosWhite9 = new Position(2, 4);
        Pawn pawnWhite9 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite9, PosWhite9);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 5);
        Position pos2 = new Position(2, 6);
        Position pos3 = new Position(3, 6);
        Position pos4 = new Position(4, 6);
        Position pos5 = new Position(4, 5);
        Position pos6 = new Position(4, 4);
        Position pos7 = new Position(3, 4);
        Position pos8 = new Position(2, 4);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);
        expected.add(pos6);
        expected.add(pos7);
        expected.add(pos8);

        List<Position> positions = queenBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    /**
     * QUEEN'S TEST SURROUNDING ALLY PAWNS
     */
    @Test
    public void testGetPossibleMovesQueenWAllFriend() {
        Position PosWhite = new Position(3, 5);
        Queen queenWhite = new Queen(Color.WHITE);
        board.setPiece(queenWhite, PosWhite);

        Position PosWhite2 = new Position(2, 5);
        Pawn pawnWhite2 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite2, PosWhite2);

        Position PosWhite3 = new Position(2, 6);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        Position PosWhite4 = new Position(3, 6);
        Pawn pawnWhite4 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite4, PosWhite4);

        Position PosWhite5 = new Position(4, 6);
        Pawn pawnWhite5 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite5, PosWhite5);

        Position PosWhite6 = new Position(4, 5);
        Pawn pawnWhite6 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite6, PosWhite6);

        Position PosWhite7 = new Position(4, 4);
        Pawn pawnWhite7 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite7, PosWhite7);

        Position PosWhite8 = new Position(3, 4);
        Pawn pawnWhite8 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite8, PosWhite8);

        Position PosWhite9 = new Position(2, 4);
        Pawn pawnWhite9 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite9, PosWhite9);

        ArrayList expected = new ArrayList();

        List<Position> positions = queenWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesQueenBAllFriends() {
        Position PosBlack = new Position(3, 5);
        Queen queenBlack = new Queen(Color.BLACK);
        board.setPiece(queenBlack, PosBlack);

        Position PosBlack2 = new Position(2, 5);
        Pawn pawnBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack2, PosBlack2);

        Position PosBlack3 = new Position(2, 6);
        Pawn pawnBlack3 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack3, PosBlack3);

        Position PosBlack4 = new Position(3, 6);
        Pawn pawnBlack4 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack4, PosBlack4);

        Position PosBlack5 = new Position(4, 6);
        Pawn pawnBlack5 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack5, PosBlack5);

        Position PosBlack6 = new Position(4, 5);
        Pawn pawnBlack6 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack6, PosBlack6);

        Position PosBlack7 = new Position(4, 4);
        Pawn pawnBlack7 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack7, PosBlack7);

        Position PosBlack8 = new Position(3, 4);
        Pawn pawnBlack8 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack8, PosBlack8);

        Position PosBlack9 = new Position(2, 4);
        Pawn pawnBlack9 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack9, PosBlack9);

        ArrayList expected = new ArrayList();

        List<Position> positions = queenBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    /**
     * TEST OF THE QUEEN FREE OF ANY POSITION
     */
    @Test
    public void testGetPossibleMovesQueenWWhitoutPawn() {
        Position PosWhite = new Position(3, 3);
        Queen queenWhite = new Queen(Color.WHITE);
        board.setPiece(queenWhite, PosWhite);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(3, 4);
        Position pos2 = new Position(3, 5);
        Position pos3 = new Position(3, 6);
        Position pos4 = new Position(3, 7);
        Position pos5 = new Position(3, 2);
        Position pos6 = new Position(3, 1);
        Position pos7 = new Position(3, 0);

        Position pos8 = new Position(2, 3);
        Position pos9 = new Position(1, 3);
        Position pos10 = new Position(0, 3);
        Position pos11 = new Position(4, 3);
        Position pos12 = new Position(5, 3);
        Position pos13 = new Position(6, 3);
        Position pos14 = new Position(7, 3);

        Position pos15 = new Position(0, 0);
        Position pos16 = new Position(1, 1);
        Position pos17 = new Position(2, 2);
        Position pos18 = new Position(4, 4);
        Position pos19 = new Position(5, 5);
        Position pos20 = new Position(6, 6);
        Position pos21 = new Position(7, 7);

        Position pos22 = new Position(6, 0);
        Position pos23 = new Position(5, 1);
        Position pos24 = new Position(4, 2);
        Position pos25 = new Position(2, 4);
        Position pos26 = new Position(1, 5);
        Position pos27 = new Position(0, 6);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);
        expected.add(pos6);
        expected.add(pos7);
        expected.add(pos8);
        expected.add(pos9);
        expected.add(pos10);
        expected.add(pos11);
        expected.add(pos12);
        expected.add(pos13);
        expected.add(pos14);
        expected.add(pos15);
        expected.add(pos16);
        expected.add(pos17);
        expected.add(pos18);
        expected.add(pos19);
        expected.add(pos20);
        expected.add(pos21);
        expected.add(pos22);
        expected.add(pos23);
        expected.add(pos24);
        expected.add(pos25);
        expected.add(pos26);
        expected.add(pos27);

        List<Position> positions = queenWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesQueenBWhitoutPawn() {
        Position PosBlack = new Position(3, 3);
        Queen queenBlack = new Queen(Color.BLACK);
        board.setPiece(queenBlack, PosBlack);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(3, 4);
        Position pos2 = new Position(3, 5);
        Position pos3 = new Position(3, 6);
        Position pos4 = new Position(3, 7);
        Position pos5 = new Position(3, 2);
        Position pos6 = new Position(3, 1);
        Position pos7 = new Position(3, 0);

        Position pos8 = new Position(2, 3);
        Position pos9 = new Position(1, 3);
        Position pos10 = new Position(0, 3);
        Position pos11 = new Position(4, 3);
        Position pos12 = new Position(5, 3);
        Position pos13 = new Position(6, 3);
        Position pos14 = new Position(7, 3);

        Position pos15 = new Position(0, 0);
        Position pos16 = new Position(1, 1);
        Position pos17 = new Position(2, 2);
        Position pos18 = new Position(4, 4);
        Position pos19 = new Position(5, 5);
        Position pos20 = new Position(6, 6);
        Position pos21 = new Position(7, 7);

        Position pos22 = new Position(6, 0);
        Position pos23 = new Position(5, 1);
        Position pos24 = new Position(4, 2);
        Position pos25 = new Position(2, 4);
        Position pos26 = new Position(1, 5);
        Position pos27 = new Position(0, 6);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);
        expected.add(pos6);
        expected.add(pos7);
        expected.add(pos8);
        expected.add(pos9);
        expected.add(pos10);
        expected.add(pos11);
        expected.add(pos12);
        expected.add(pos13);
        expected.add(pos14);
        expected.add(pos15);
        expected.add(pos16);
        expected.add(pos17);
        expected.add(pos18);
        expected.add(pos19);
        expected.add(pos20);
        expected.add(pos21);
        expected.add(pos22);
        expected.add(pos23);
        expected.add(pos24);
        expected.add(pos25);
        expected.add(pos26);
        expected.add(pos27);

        List<Position> positions = queenBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    /**
     * TEST OF THE QUEEN SURROUNDING ENEMY PAWN AND ALLY IN ALL
     * DIRECTIONS
     */
    @Test
    public void testGetPossibleMovesQueenWMixteALLDirection() {
        Position PosWhite = new Position(3, 5);
        Queen queenWhite = new Queen(Color.WHITE);
        board.setPiece(queenWhite, PosWhite);

        Position PosBlack2 = new Position(2, 5);
        Pawn pawnBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack2, PosBlack2);

        Position PosWhite3 = new Position(2, 6);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        Position PosBlack4 = new Position(3, 6);
        Pawn pawnBlack4 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack4, PosBlack4);

        Position PosWhite5 = new Position(4, 6);
        Pawn pawnWhite5 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite5, PosWhite5);

        Position PosBlack6 = new Position(4, 5);
        Pawn pawnBlack6 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack6, PosBlack6);

        Position PosWhite7 = new Position(4, 4);
        Pawn pawnWhite7 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite7, PosWhite7);

        Position PosBlack8 = new Position(3, 4);
        Pawn pawnBlack8 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack8, PosBlack8);

        Position PosWhite9 = new Position(2, 4);
        Pawn pawnWhite9 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite9, PosWhite9);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 5);
        Position pos3 = new Position(3, 6);
        Position pos5 = new Position(4, 5);
        Position pos7 = new Position(3, 4);

        expected.add(pos1);
        expected.add(pos3);
        expected.add(pos5);
        expected.add(pos7);

        List<Position> positions = queenWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesQueenBMixteALLDirection() {
        Position PosBlack = new Position(3, 5);
        Queen queenBlack = new Queen(Color.BLACK);
        board.setPiece(queenBlack, PosBlack);

        Position PosBlack2 = new Position(2, 5);
        Pawn pawnBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack2, PosBlack2);

        Position PosWhite3 = new Position(2, 6);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        Position PosBlack4 = new Position(3, 6);
        Pawn pawnBlack4 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack4, PosBlack4);

        Position PosWhite5 = new Position(4, 6);
        Pawn pawnWhite5 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite5, PosWhite5);

        Position PosBlack6 = new Position(4, 5);
        Pawn pawnBlack6 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack6, PosBlack6);

        Position PosWhite7 = new Position(4, 4);
        Pawn pawnWhite7 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite7, PosWhite7);

        Position PosBlack8 = new Position(3, 4);
        Pawn pawnBlack8 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack8, PosBlack8);

        Position PosWhite9 = new Position(2, 4);
        Pawn pawnWhite9 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite9, PosWhite9);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(2, 6);
        Position pos3 = new Position(2, 4);
        Position pos5 = new Position(4, 6);
        Position pos7 = new Position(4, 4);

        expected.add(pos1);
        expected.add(pos3);
        expected.add(pos5);
        expected.add(pos7);

        List<Position> positions = queenBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    /**
     * TQUEEN'S TEST SURROUNDING MIXED PIECES RANDOMLY POSITIONED
     */
    @Test
    public void testGetPossibleMovesQueenWPawnAleatoireMixte1() {
        Position PosWhite = new Position(2, 5);
        Queen queenWhite = new Queen(Color.WHITE);
        board.setPiece(queenWhite, PosWhite);

        Position PosBlack2 = new Position(2, 3);
        Pawn pawnBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack2, PosBlack2);

        Position PosWhite3 = new Position(3, 5);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        Position PosBlack4 = new Position(1, 3);
        Pawn pawnBlack4 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack4, PosBlack4);

        Position PosWhite5 = new Position(5, 2);
        Pawn pawnWhite5 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite5, PosWhite5);

        Position PosBlack6 = new Position(2, 7);
        Pawn pawnBlack6 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack6, PosBlack6);

        Position PosBlack8 = new Position(4, 7);
        Pawn pawnBlack8 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack8, PosBlack8);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(1, 5);
        Position pos2 = new Position(0, 5);
        Position pos3 = new Position(2, 6);
        Position pos4 = new Position(2, 7);
        Position pos5 = new Position(3, 6);
        Position pos6 = new Position(4, 7);
        Position pos7 = new Position(3, 4);

        Position pos8 = new Position(4, 3);
        Position pos9 = new Position(2, 4);
        Position pos10 = new Position(2, 3);
        Position pos11 = new Position(1, 4);
        Position pos12 = new Position(0, 3);

        Position pos13 = new Position(1, 6);
        Position pos14 = new Position(0, 7);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);
        expected.add(pos6);
        expected.add(pos7);
        expected.add(pos8);
        expected.add(pos9);
        expected.add(pos10);
        expected.add(pos11);
        expected.add(pos12);
        expected.add(pos13);
        expected.add(pos14);

        List<Position> positions = queenWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesQueenWPawnAleatoireMixte2() {
        Position PosBlack = new Position(6, 5);
        Queen queenBlack = new Queen(Color.BLACK);
        board.setPiece(queenBlack, PosBlack);

        Position PosBlack2 = new Position(6, 4);
        Pawn pawnBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack2, PosBlack2);

        Position PosWhite3 = new Position(5, 5);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        Position PosBlack4 = new Position(6, 6);
        Pawn pawnBlack4 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack4, PosBlack4);

        Position PosWhite5 = new Position(7, 5);
        Pawn pawnWhite5 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite5, PosWhite5);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(5, 5);
        Position pos2 = new Position(5, 6);
        Position pos3 = new Position(4, 7);
        Position pos4 = new Position(7, 5);
        Position pos5 = new Position(7, 6);
        Position pos6 = new Position(7, 4);
        Position pos7 = new Position(5, 4);

        Position pos8 = new Position(4, 3);
        Position pos9 = new Position(3, 2);
        Position pos10 = new Position(2, 1);
        Position pos11 = new Position(1, 0);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);
        expected.add(pos6);
        expected.add(pos7);
        expected.add(pos8);
        expected.add(pos9);
        expected.add(pos10);
        expected.add(pos11);

        List<Position> positions = queenBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesQueenWPawnAleatoireMixte3() {
        Position PosWhite = new Position(6, 2);
        Queen queenWhite = new Queen(Color.WHITE);
        board.setPiece(queenWhite, PosWhite);

        Position PosBlack2 = new Position(6, 1);
        Pawn pawnBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack2, PosBlack2);

        Position PosWhite3 = new Position(7, 1);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        Position PosBlack4 = new Position(5, 1);
        Pawn pawnBlack4 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack4, PosBlack4);

        Position PosWhite5 = new Position(5, 3);
        Pawn pawnWhite5 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite5, PosWhite5);

        Position PosBlack8 = new Position(7, 3);
        Pawn pawnBlack8 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack8, PosBlack8);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(7, 2);
        Position pos2 = new Position(6, 1);
        Position pos3 = new Position(5, 1);
        Position pos4 = new Position(5, 2);
        Position pos5 = new Position(4, 2);
        Position pos6 = new Position(3, 2);
        Position pos7 = new Position(2, 2);

        Position pos8 = new Position(1, 2);
        Position pos9 = new Position(0, 2);

        Position pos10 = new Position(6, 3);
        Position pos11 = new Position(6, 4);
        Position pos15 = new Position(6, 5);
        Position pos16 = new Position(6, 6);
        Position pos17 = new Position(6, 7);
        Position pos18 = new Position(7, 3);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);
        expected.add(pos6);
        expected.add(pos7);
        expected.add(pos8);
        expected.add(pos9);
        expected.add(pos10);
        expected.add(pos11);
        expected.add(pos15);
        expected.add(pos16);
        expected.add(pos17);
        expected.add(pos18);

        List<Position> positions = queenWhite.getPossibleMoves(PosWhite, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesQueenWPawnAleatoireMixte4() {
        Position PosBlack = new Position(4, 1);
        Queen queenBlack = new Queen(Color.BLACK);
        board.setPiece(queenBlack, PosBlack);

        Position PosBlack2 = new Position(4, 0);
        Pawn pawnBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack2, PosBlack2);

        Position PosWhite3 = new Position(5, 0);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        Position PosBlack4 = new Position(4, 2);
        Pawn pawnBlack4 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack4, PosBlack4);

        Position PosWhite5 = new Position(3, 2);
        Pawn pawnWhite5 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite5, PosWhite5);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(5, 0);
        Position pos2 = new Position(3, 2);
        Position pos3 = new Position(5, 1);
        Position pos4 = new Position(6, 1);
        Position pos5 = new Position(7, 1);
        Position pos6 = new Position(3, 0);
        Position pos7 = new Position(3, 1);

        Position pos8 = new Position(2, 1);
        Position pos9 = new Position(1, 1);

        Position pos10 = new Position(0, 1);
        Position pos11 = new Position(5, 2);
        Position pos15 = new Position(6, 3);
        Position pos16 = new Position(7, 4);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);
        expected.add(pos6);
        expected.add(pos7);
        expected.add(pos8);
        expected.add(pos9);
        expected.add(pos10);
        expected.add(pos11);
        expected.add(pos15);
        expected.add(pos16);

        List<Position> positions = queenBlack.getPossibleMoves(PosBlack, board);

        assertEqualsIgnoringOrder(expected, positions);

    }

    @Test
    public void testGetPossibleMovesQueenWPawnAleatoireMixte5() {
        Position PosWhite = new Position(1, 1);
        Queen queenWhite = new Queen(Color.WHITE);
        board.setPiece(queenWhite, PosWhite);

        Position PosBlack2 = new Position(0, 1);
        Pawn pawnBlack2 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack2, PosBlack2);

        Position PosWhite3 = new Position(2, 0);
        Pawn pawnWhite3 = new Pawn(Color.WHITE);
        board.setPiece(pawnWhite3, PosWhite3);

        Position PosBlack4 = new Position(1, 2);
        Pawn pawnBlack4 = new Pawn(Color.BLACK);
        board.setPiece(pawnBlack4, PosBlack4);

        ArrayList expected = new ArrayList();
        Position pos1 = new Position(0, 0);
        Position pos2 = new Position(0, 1);
        Position pos3 = new Position(0, 2);
        Position pos4 = new Position(1, 0);
        Position pos5 = new Position(1, 2);
        Position pos6 = new Position(2, 1);
        Position pos7 = new Position(3, 1);

        Position pos8 = new Position(4, 1);
        Position pos9 = new Position(5, 1);

        Position pos10 = new Position(6, 1);
        Position pos11 = new Position(7, 1);
        Position pos12 = new Position(6, 6);
        Position pos13 = new Position(7, 7);
        Position pos15 = new Position(2, 2);
        Position pos16 = new Position(3, 3);
        Position pos17 = new Position(4, 4);
        Position pos18 = new Position(5, 5);

        expected.add(pos1);
        expected.add(pos2);
        expected.add(pos3);
        expected.add(pos4);
        expected.add(pos5);
        expected.add(pos6);
        expected.add(pos7);
        expected.add(pos8);
        expected.add(pos9);
        expected.add(pos10);
        expected.add(pos11);
        expected.add(pos12);
        expected.add(pos13);
        expected.add(pos15);
        expected.add(pos16);
        expected.add(pos17);
        expected.add(pos18);

        List<Position> positions = queenWhite.getPossibleMoves(PosWhite, board);

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
