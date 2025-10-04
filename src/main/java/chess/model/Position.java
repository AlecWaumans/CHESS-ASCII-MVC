package chess.model;

/**
 * This class will allow us to create the pieces of the chessboard according to
 * a well defined model.
 *
 * @author alecw
 */
public class Position {

    private int row; //is the attribute that defines the lines. 
    private int column; //  is the attribute that defines the columns.  

    /**
     * here is the constructor which will allow us to initialise the pieces of
     * the chessboard.
     *
     * @param row corresponds to the row in the table where the room is located.
     * @param column corresponds to the column in the table where the room is
     * located.
     */
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    /**
     * accessor that will allow us to retrieve the private line attribute.
     *
     * @return the value of the row attribute.
     */
    public int getRow() {
        return row;
    }

    /**
     * accessor that will allow us to retrieve the private column attribute.
     *
     * @return value of the column attribute.
     */
    public int getColumn() {
        return column;
    }

    /**
     * This method will create a new position using the direction enumeration.
     * This means that depending on the direction chosen, we will add to the two
     * position attributes the values that correspond to it.
     *
     * @param dir This is the direction chosen with the values pre-entered in
     * the direction enumeration. These values are the values we will add to
     * position.
     * @return The new position of the part.
     */
    public Position next(Direction dir) {
        return new Position(row + dir.getDeltaRow(),
                column + dir.getDeltaColumn());

    }

    @Override
    public String toString() {
        return "Position{" + row + ", " + column + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.row;
        hash = 83 * hash + this.column;
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
        final Position other = (Position) obj;
        if (this.row != other.row) {
            return false;
        }
        return this.column == other.column;
    }

}
