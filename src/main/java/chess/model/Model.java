package chess.model;

import chess.model.Pieces.Piece;
import java.util.List;

/**
 *
 * @author alecw
 */
public interface Model {

    /**
     * Start the game: create the pieces and put them on the board, initialize
     * the current player to 'WHITE'.
     *
     */
    public void start();

    /**
     * Get the piece of the board located on a given position
     *
     * @param pos the position
     * @return the piece located at P
     * @throws IllegalArgumentException pos is not located on the board.
     */
    public Piece getPiece(Position pos);

    /**
     * Getter for the current player. Getter pour le joueur actuel.
     *
     * @return the current player.
     */
    public Player getCurrentPlayer();

    /**
     * Getter for the second player. Getter pour le deuxième joueur.
     *
     * @return the player that is waiting le joueur qui attend
     */
    public Player getOppositePlayer();

    /**
     * Check if the square at the given position is occupied by a piece of the
     * current player.
     *
     * @param pos the postion
     * @return true if the position is occupied by a piece of the current
     * player, false otherwise.
     * @throws IllegalArgumentException if the position is not located on the
     * board.
     */
    public boolean isCurrentPlayerPosition(Position pos);

    /**
     * Moves a piece from one position of the chess board to another one. If the
     * game is not over, change the current player.
     *
     * @param oldPos the current position
     * @param newPos the new position of the board where to put the piece
     * @throws IllegalArgumentException if 1) oldPos or newPos are not located
     * on the board, or 2) oldPos does not contain a piece, or 3) the piece does
     * not belong to the current player, or 4) the move is not valid for the
     * piece located at position oldPos
     *
     */
    public void movePiecePosition(Position oldPos, Position newPos);

    /**
     * Get the possible moves for the piece located at the specified position.
     *
     * @param position the position of the piece
     * @return the liste of admissible positions.
     */
    public List<Position> getPossibleMoves(Position position);

    /**
     *
     * @return The state of the game at all times.
     */
    public GameState getState();

    /**
     * This is the only way to check that the movement of a part from the
     * position This is the same as the one used in the previous example.
     *
     * @param oldPos The position of the part in question.
     * @param newPos The position from which you want to move the part.
     * @return True if the movement is possible and false otherwise.
     */
    public boolean isValidMove(Position oldPos, Position newPos);

}
