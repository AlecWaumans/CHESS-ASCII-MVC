package chess.model.Pieces;

import chess.model.Board;
import chess.model.Color;
import chess.model.Direction;
import chess.model.Position;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This class will allow us to create objects which are the pieces of the
 * chessboard.
 *
 * @author alecw
 */
public abstract class Piece {

    private Color color; // This attribute will define the colour of the room. 

    /**
     * Here the constructor will allow us to initialise the piece with the given
     * given colour.
     *
     * @param color The colour of the piece.
     */
    public Piece(Color color) {
        this.color = color;
    }

    /**
     * accessor that will allow us to retrieve the private attribute color which
     * is the colour of the Piece.
     *
     * @return a color of the piece.
     */
    public Color getColor() {
        return this.color;
    }

    /**
     *
     * @param position of the Piece that we want to know where it can go.
     * @param board of game.
     * @return The list of movements that the piece can make according to the
     * chosen piece.
     */
    public abstract List<Position> getPossibleMoves(Position position, Board board);

    /**
     *
     * @param position of the piece
     * @param board the chessBoard
     * @return a list of opposing Piece positions in which you can capture.
     */
    public List<Position> getCapturePositions(Position position, Board board) {
        if (board.getPiece(position) == null) {
            throw new IllegalArgumentException("They are nothing Piece here " + position);
        }
        List<Position> PosGetPossibleMove = getPossibleMoves(position, board);
        List<Position> PosCapturePiece = new ArrayList();
        for (Position pos : PosGetPossibleMove) {
            if (board.getPiece(pos) != null && board.getPiece(position).getColor() == board.getPiece(pos).getColor().opposite()) {
                PosCapturePiece.add(pos);
            }
        }
        return PosCapturePiece;
    }

    /**
     *
     * @param position of the Piece whose future position we want to know
     * @param board the chess
     * @param oriantation the directions of the Piece it can do.
     * @return A list of the positions of the parts that can move several
     * positions in one direction.
     */
    protected List<Position> getPossibleMovesLongueDistance(Position position, Board board, List<Direction> oriantation) {
        // If the position in parameter is not on the chessboard it throws an exception.
        if (!board.contains(position)) {
            throw new IllegalArgumentException("The position is outside the chessboard." + position);
        }
        // we create a new list that will have all possible moves. 
        List<Position> possibleMoves = new ArrayList();
        Position initialPosition = position;
        for (Direction dir : oriantation) {
            while (board.contains(position.next(dir))
                    && (board.isFree(position.next(dir)))) {
                possibleMoves.add(position.next(dir));
                position = position.next(dir);
            }
            if (board.contains(position.next(dir))
                    && board.containsOppositeColor(position.next(dir), board.getPiece(initialPosition).getColor())) {
                possibleMoves.add(position.next(dir));
                position = position.next(dir);
            }
            position = initialPosition;
        }
        return possibleMoves;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.color);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Piece other = (Piece) obj;
        return this.color == other.color;
    }
}
