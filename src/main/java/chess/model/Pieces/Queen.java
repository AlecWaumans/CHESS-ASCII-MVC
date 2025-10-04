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
public class Queen extends Piece {

    /**
     * Allows you to instantiate a piece of Queen type.
     *
     * @param color with a given colour.
     */
    public Queen(Color color) {
        super(color);
    }

    /**
     * See piece for the javadoc of this method.
     */
    @Override
    public List<Position> getPossibleMoves(Position position, Board board) {
        return super.getPossibleMovesLongueDistance(position, board, getDirectionGetPossibleMovesQueen());
    }

    /**
     *
     * @return The list of directions the Queen can take.
     */
    private List<Direction> getDirectionGetPossibleMovesQueen() {
        List<Direction> oriantation = new ArrayList();
        oriantation.add(Direction.N);
        oriantation.add(Direction.S);
        oriantation.add(Direction.E);
        oriantation.add(Direction.W);
        oriantation.add(Direction.NE);
        oriantation.add(Direction.NW);
        oriantation.add(Direction.SW);
        oriantation.add(Direction.SE);
        return oriantation;
    }

    @Override
    public String toString() {
        return (getColor() == Color.BLACK) ? " QueenB  " : " QueenW  ";
    }

}
