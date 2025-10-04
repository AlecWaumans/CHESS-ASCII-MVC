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
public class Knight extends Piece {

    /**
     * Allows you to instantiate a piece of rider type.
     *
     * @param color with a given colour.
     */
    public Knight(Color color) {
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

        List<Position> oriantation = new ArrayList();

        Position posS = position.next(Direction.S);
        Position SSW = posS.next(Direction.SW);
        Position SSE = posS.next(Direction.SE);
        oriantation.add(SSW);
        oriantation.add(SSE);

        Position posE = position.next(Direction.E);
        Position ESE = posE.next(Direction.SE);
        Position ENE = posE.next(Direction.NE);
        oriantation.add(ESE);
        oriantation.add(ENE);

        Position posN = position.next(Direction.N);
        Position NNE = posN.next(Direction.NE);
        Position NNW = posN.next(Direction.NW);
        oriantation.add(NNE);
        oriantation.add(NNW);

        Position posW = position.next(Direction.W);
        Position WSW = posW.next(Direction.SW);
        Position WNW = posW.next(Direction.NW);
        oriantation.add(WSW);
        oriantation.add(WNW);

        for (Position pos : oriantation) {
            if (piece != null) {

                if (board.contains(pos)) {
                    if (!board.isFree(pos)) {
                        if (board.containsOppositeColor(pos, pieceColor)) {
                            possibleMoves.add(pos);
                        }
                    } else {
                        possibleMoves.add(pos);
                    }
                }
            }
        }
        return possibleMoves;

    }

    @Override
    public String toString() {
        return (getColor() == Color.BLACK) ? " KnightB " : " KnightW ";
    }
}
