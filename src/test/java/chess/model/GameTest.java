package chess.model;

import chess.model.GameState;
import chess.model.Game;
import chess.model.Position;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author alecw
 */
public class GameTest {

    Game game;

    public GameTest() {

    }

    @BeforeEach
    public void setUp() {
        Game game = new Game();

    }

    @Test
    public void testMovePiecePositionPLAY() {
        Game game = new Game();
        game.start();
        Position oldPos1 = new Position(1, 4);
        Position newPos1 = new Position(2, 4);
        game.movePiecePosition(oldPos1, newPos1);

        assertTrue(game.getState() == GameState.PLAY);

    }

    @Test
    public void testMovePiecePositionTheLionsMast() {
        Game game = new Game();
        game.start();
        Position oldPos1 = new Position(1, 4);
        Position newPos1 = new Position(2, 4);
        game.movePiecePosition(oldPos1, newPos1);
        Position oldPos2 = new Position(6, 4);
        Position newPos2 = new Position(4, 4);
        game.movePiecePosition(oldPos2, newPos2);
        Position oldPos3 = new Position(1, 5);
        Position newPos3 = new Position(3, 5);
        game.movePiecePosition(oldPos3, newPos3);
        Position oldPos4 = new Position(7, 3);
        Position newPos4 = new Position(3, 7);
        game.movePiecePosition(oldPos4, newPos4);

        assertTrue(game.getState() == GameState.CHECK_MATE);

    }
    /**
     * ATTENTION: I KNOW THAT IT IS ALMOST NON-EXISTENT AS A TEST AND THAT IT DOES NOT WORK 
     * UNFORTUNATELY I DIDN'T HAVE THE TIME TO DO MORE OR TO CORRECT THE MOVEPIECEPOSITION METHOD
     */

}
