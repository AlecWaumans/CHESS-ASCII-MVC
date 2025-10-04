package chess.main;

import chess.controller.Controller;
import chess.model.Game;
import chess.model.Model;
import chess.view.TextView;

/**
 *
 * @author alecw
 */
public class main {

    /**
     * Start the chess game.
     *
     * @param args
     */
    public static void main(String[] args) {
        Model game = new Game();
        Controller controller = new Controller(game, new TextView(game));
        controller.play();
    }

}
