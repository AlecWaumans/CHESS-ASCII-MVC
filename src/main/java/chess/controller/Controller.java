package chess.controller;

import chess.model.GameState;
import chess.model.Model;
import chess.model.Position;
import chess.view.View;

/**
 * This class will allow us to make the link between the view and the model.
 *
 * @author alecw
 */
public class Controller {

    private Model game;
    private View view;

    /**
     * The manufacturer initializes a new controller
     *
     * @param model the interface model of the game
     * @param view the game view interface
     */
    public Controller(Model model, View view) {
        this.game = model;
        this.view = view;
    }

    /**
     * It is this method that will drive the game as a whole.
     *
     */
    public void play() {
        view.displayTitle();
        game.start();
        while (game.getState() != GameState.CHECK_MATE && game.getState() != GameState.STALE_MATE) {
            do {
                view.displayBoard();
                view.displayPlayer();
                Position DepartPosition = view.askPosition();
                Position EndPosition = view.askPosition();
                if (game.isValidMove(DepartPosition, EndPosition)) {
                    game.movePiecePosition(DepartPosition, EndPosition);
                }
            } while (game.getState() == GameState.PLAY);
            if (game.getState() == GameState.CHECK) {
                do {
                    view.displayBoard();
                    view.displayPlayer();
                    view.displayCheck();
                    Position DepartPosition = view.askPosition();
                    Position EndPosition = view.askPosition();
                    if (game.isValidMove(DepartPosition, EndPosition)) {
                        game.movePiecePosition(DepartPosition, EndPosition);
                    }
                } while (game.getState() == GameState.CHECK);

            }
        }
        if (game.getState() == GameState.STALE_MATE) {
            view.displayStaleMat();
        }
        if (game.getState() == GameState.CHECK_MATE) {
            view.displayMat();
        }

        view.displayWinner();
    }

}
