package chess.view;

import chess.model.Position;

/**
 *
 * @author alecw
 */
public interface View {

    /**
     * displays a title and a welcome message to players.
     */
    public void displayTitle();

    /**
     * displays the game board. See the important note about this below.
     *
     */
    public void displayBoard();

    /**
     * shows the winning player.
     */
    public void displayWinner();
 
    /**
     * displays a message inviting the current player (white or black) to play,
     */
    public void displayPlayer();

    /*
     * Requires a valid position on the game board from the user. See
     * the important note about this below.
     *
     * @return returns a position to ask the user.
     */
    public Position askPosition();

    /**
     * displays the error message passed in parameter.
     *
     * @param message The error message in question which is a sentence.
     */
    public void displayError(String message);

    /**
     * This message tells the player that he is in check and must move his king.
     */
    public void displayCheck();

    /**
     * Message that tells the player he is in checkmate
     */
    public void displayMat();

    /**
     * Message that tells the player that the game ends on a null match
     */
    public void displayStaleMat();
}
