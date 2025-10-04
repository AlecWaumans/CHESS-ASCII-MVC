package chess.model.Pieces;

import chess.model.Board;
import chess.model.Color;
import chess.model.Direction;
import chess.model.Position;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alecw
 */
public class King extends Piece {

    /**
     * Allows you to instantiate a piece of King type.
     *
     * @param color with a given colour.
     */
    public King(Color color) {
        super(color);
    }

    /**
     * See piece for the javadoc of this method.
     */
    @Override
    public List<Position> getPossibleMoves(Position position, Board board) {
        // we create a new list that will have all possible moves. 
        List<Position> possibleMoves = new ArrayList();
        // If the position in parameter is not on the chessboard it throws an exception.
        if (!board.contains(position)) {
            throw new IllegalArgumentException("The position is outside the chessboard." + position);
        }
        // create a Piece variable that gets the Piece of the position on the board.
        Piece piece = board.getPiece(position);
        // we get its color to make it a Color variable. 
        Color pieceColor = piece.getColor();

        List<Direction> oriantation = new ArrayList();
        oriantation.add(Direction.S);
        oriantation.add(Direction.N);
        oriantation.add(Direction.E);
        oriantation.add(Direction.W);
        oriantation.add(Direction.SE);
        oriantation.add(Direction.SW);
        oriantation.add(Direction.NE);
        oriantation.add(Direction.NW);

        for (Direction dir : oriantation) {
            //If she is on the chess
            if (board.contains(position.next(dir))) {
                //if at this position is not free
                if (!board.isFree(position.next(dir))) {
                    //if the color of the piece at Sud position is opposite to initialpiece
                    if (board.containsOppositeColor(position.next(dir), pieceColor)) {
                        //add this position to list possibleMoves.
                        possibleMoves.add(position.next(dir));
                    }
                    //if at this position is free
                } else {
                    //add this position to list possibleMoves.
                    possibleMoves.add(position.next(dir));
                }
            }
        }

        return possibleMoves;
    }

    @Override
    public String toString() {
        return (getColor() == Color.BLACK) ? "  KingB  " : "  KingW  ";
    }
}
