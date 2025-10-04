package chess.model;

import chess.model.Pieces.Piece;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alecw
 */
public class Board {

    private Square[][] board; //attribute of board which is a two dimensional array.
    public static final int BOARD_SIZE = 8;

    /**
     * The builder initializes a new 8 x 8 square board (containing no pieces).
     * containing no pieces).
     */
    public Board() {
        this.board = new Square[BOARD_SIZE][BOARD_SIZE]; // creation of a two dimensional table with 8 rows and 8 columns. 
        for (int i = 0; i < board.length; i++) { // go through the table line by line.
            for (int j = 0; j < board.length; j++) { // go through the table column by column.
                this.board[i][j] = new Square(null);// and at each square create an Object square containing no Pieces. 
            }
        }
    }

    /**
     *
     * This method will allow us to know if the position is in the chessboard or
     * not.
     *
     * @param pos The position in the tab.
     * @return returns true if the position is on the board and false otherwise
     */
    public boolean contains(Position pos) {
        return !(pos.getColumn() < 0
                || pos.getColumn() >= BOARD_SIZE
                || pos.getRow() < 0
                || pos.getRow() >= BOARD_SIZE);
    }

    /**
     * @param color A color in the game.
     * @return 6 for the color BLACK and 1 for the color WHITE
     */
    public int getInitialPawnRow(Color color) {
        if (color == Color.BLACK) {
            return 6;
        } else {
            return 1;
        }
    }

    /**
     *
     * This method will place the piece passed in parameter on the of the board.
     * Makes an exception if the position in parameter is not on the board.
     *
     * @param piece The piece you want to place on the board.
     * @param position The position in which you want to put the Piece.
     */
    public void setPiece(Piece piece, Position position) {
        if (!contains(position)) {
            throw new IllegalArgumentException("The position is outside the chessboard." + position);
        }
        board[position.getRow()][position.getColumn()].setPiece(piece);
        //here we add the Piece as a parameter to the setpiece method 
        //in the position that we get thanks to the methods getRom and getColumn. 
    }

    /**
     *
     * @param position The position that we want to have the Piece.
     * @return the part located on the square whose position is passed in
     * parameter. Makes an exception if the position in parameter is not on the
     * chessboard.
     */
    public Piece getPiece(Position position) {
        if (!contains(position)) {
            throw new IllegalArgumentException("The position is outside the chessboard." + position);
        }
        return board[position.getRow()][position.getColumn()].getPiece();
        //here thanks to the method getpiece we return the Piece in the position put 
        //in parameter that we get thanks to the methods getRom and getColumn. 
    }

    /**
     * removes the part from the cell whose position is passed in parameter.
     *
     * @param position The position where you want to delete the Piece. Makes an
     * exception if the position in parameter is not on the chessboard.
     */
    public void dropPiece(Position position) {
        if (!contains(position)) {
            throw new IllegalArgumentException("The position is outside the chessboard." + position);

        }
        board[position.getRow()][position.getColumn()].setPiece(null);
        // we delete by replacing it with a new square that does not contain a piece at the 
        // position set in parameter that we get thanks to the methods getRom and getColumn. 
    }

    /**
     * @param position where you want to know if there is a Piece or not;
     * @return true if the given position cell is free and false otherwise.
     * Makes an exception if the position in parameter is not on the chessboard.
     */
    public boolean isFree(Position position) {
        if (!contains(position)) {
            throw new IllegalArgumentException("It's outside of chess : " + position);
        }
        return this.board[position.getRow()][position.getColumn()].isFree();
        // Here thanks to the method isFree of the class Square we can check if there is a Piece or not at 
        //the position set as a parameter that we get thanks to the methods getRom and getColumn. 
    }

    /**
     *
     * This method will thus allow to verify that a square is occupied by an
     * piece.
     *
     * @param position where we want to know if it is occupied by an opponent's
     * piece piece or not.
     * @param color The color of the Piece that is not the opponent's
     * @return true if the cell whose position passed in parameter contains a
     * part of the opposite color to the one passed in parameter, and false
     * otherwise. Makes an exception if the position in parameter is not on the
     * chessboard.
     */
    public boolean containsOppositeColor(Position position, Color color) {
        if (!contains(position)) {
            throw new IllegalArgumentException("The position is outside the chessboard." + position);
        }
        Piece piece = board[position.getRow()][position.getColumn()].getPiece();
        return piece != null
                && board[position.getRow()][position.getColumn()].getPiece().getColor() != color;
        // here the condition is if on the square there is something else than nothing and the color of 
        //the Piece on the square has a color opposite to the color set in parameter. 
    }

    /**
     *
     * @param player : the player we want to know the list of the squares he
     * has.
     * @return the list of all positions occupied by the given player.
     */
    public List<Position> getPositionOccupiedBy(Player player) {
        ArrayList liste = new ArrayList(); // create a list.
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                Piece piece = board[i][j].getPiece();
                if (piece != null
                        && piece.getColor() == player.getColor()) {
                    // if there is something in the square and the color of the piece is equal to the color of the player;
                    Position positionPlayer = new Position(i, j);
                    //then you create the position that corresponds to the position that meets the conditions.
                    liste.add(positionPlayer);
                    // and you add them to the list.
                }
            }
        }
        return liste;
    }

    /**
     * @param piece whose position we want to know.
     * @return The position of the Piece you wish to know.
     */
    public Position getPiecePosition(Piece piece) {
        if (piece == null) {
            throw new IllegalArgumentException("This piece is null");
        }
        Position posPiece = new Position(0, 0);
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (!this.board[i][j].isFree() && this.board[i][j].getPiece().equals(piece)) {
                    posPiece = new Position(i, j);
                }
            }
        }
        return posPiece;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Arrays.deepHashCode(this.board);
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
        final Board other = (Board) obj;
        return Arrays.deepEquals(this.board, other.board);
    }
}
