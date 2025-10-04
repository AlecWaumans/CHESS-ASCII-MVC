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
public class Pawn extends Piece {

    public Pawn(Color color) {
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
        // here we create two variables which are numbers corresponding to 6 if it is black and 1 if it is white. 
        int ColorInitialBlack = board.getInitialPawnRow(Color.BLACK);
        int colorInitialWhite = board.getInitialPawnRow(Color.WHITE);

        Position positionS = position.next(Direction.S);
        Position positionSS = positionS.next(Direction.S);
        Position sw = position.next(Direction.SW);
        Position se = position.next(Direction.SE);
        Position positionN = position.next(Direction.N);
        Position positionNN = positionN.next(Direction.N);
        Position ne = position.next(Direction.NE);
        Position nw = position.next(Direction.NW);

        // if the Piece is not null
        if (piece != null) {
            // and if the Piece is black 
            if (pieceColor == Color.BLACK) {
                // and if the south position on the Piece position is free
                if (board.isFree(positionS)) {
                    // add the South position in the list of possible moves.
                    possibleMoves.add(positionS);
                    // and if the Piece is on its initial position and the south position of the Piece is free.
                    if (position.getRow() == ColorInitialBlack
                            && board.isFree(positionSS)) {
                        // add the position South South in the list of possible moves.
                        possibleMoves.add(positionSS);
                    }
                }
                // if the SW position is occupied by a Piece of the opposite player.
                if (board.contains(sw) && !board.isFree(sw)
                        && board.containsOppositeColor(sw, pieceColor)) {
                    //You add the South West position in the list of possible moves.
                    possibleMoves.add(sw);
                }
                // if the SE position is occupied by a piece of the opposite player.
                if (board.contains(se) && !board.isFree(se)
                        && board.containsOppositeColor(se, pieceColor)) {
                    //you add the South is position in the list of possible moves.
                    possibleMoves.add(se);
                }

            } else { // and if the Piece is white
                // and if the north position on the Piece position is free
                if (board.isFree(positionN)) {
                    //You add the north position in the list of possible movements.
                    possibleMoves.add(positionN);
                    // and if the Piece is on its initial position and the North position of the Piece is free.
                    if (position.getRow() == colorInitialWhite && board.isFree(positionNN)) {
                        //you add the north north position in the list of possible moves.
                        possibleMoves.add(positionNN);
                    }
                }
                // if the NE position is occupied by a piece of the opposite player.
                if (board.contains(ne) && !board.isFree(ne)
                        && board.containsOppositeColor(ne, pieceColor)) {
                    //you add the north east position in the list of possible movements.
                    possibleMoves.add(ne);
                }
                // if the NW position is occupied by a piece of the opposite player.
                if (board.contains(nw) && !board.isFree(nw)
                        && board.containsOppositeColor(nw, pieceColor)) {
                    //You add the north west position in the list of possible movements.
                    possibleMoves.add(nw);
                }
            }

        }

        return possibleMoves;
    }

    /**
     * @param position of the pawn you want to choose.
     * @param board The chessboard
     * @return returns a list of positions where the counter can eat another
     * pawn.
     */
    @Override
    public List<Position> getCapturePositions(Position position, Board board) {
        // If the position in parameter is not on the chessboard it throws an exception.
        if (!board.contains(position)) {
            throw new IllegalArgumentException("The position is outside the chessboard." + position);
        }
        List<Position> possibleCapturePositions = new ArrayList();

        // create a Piece variable that gets the Piece of the position on the board.
        Piece piece = board.getPiece(position);
        // we get its color to make it a Color variable. 
        Color pieceColor = piece.getColor();

        Position sw = position.next(Direction.SW);
        Position se = position.next(Direction.SE);

        Position ne = position.next(Direction.NE);
        Position nw = position.next(Direction.NW);

        // if the Piece is not null
        if (piece != null) {
            // and if the Piece is black 
            if (pieceColor == Color.BLACK) {
                if (board.contains(sw) && !board.isFree(sw)
                        && board.containsOppositeColor(sw, pieceColor)) {
                    //You add the South West position in the list of possible moves.
                    possibleCapturePositions.add(sw);
                }
                // if the SE position is occupied by a piece of the opposite player.
                if (board.contains(se) && !board.isFree(se)
                        && board.containsOppositeColor(se, pieceColor)) {
                    //you add the South is position in the list of possible moves.
                    possibleCapturePositions.add(se);
                }
            } else {
                // if the NE position is occupied by a piece of the opposite player.
                if (board.contains(ne) && !board.isFree(ne)
                        && board.containsOppositeColor(ne, pieceColor)) {
                    //you add the north east position in the list of possible movements.
                    possibleCapturePositions.add(ne);
                }
                // if the NW position is occupied by a piece of the opposite player.
                if (board.contains(nw) && !board.isFree(nw)
                        && board.containsOppositeColor(nw, pieceColor)) {
                    //You add the north west position in the list of possible movements.
                    possibleCapturePositions.add(nw);
                }
            }
        }

        return possibleCapturePositions;
    }

    @Override
    public String toString() {
        return (getColor() == Color.BLACK) ? "  PawnB  " : "  PawnW  ";
    }
}
