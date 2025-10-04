package chess.model;

/**
 * This enumeration will create a direction by adding or subtracting a certain
 * value to the value to the row and column number in order to change the
 * position.
 *
 * @author alecw
 */
public enum Direction {
    NW(1, -1),
    N(1, 0),
    NE(1, 1),
    W(0, -1),
    E(0, 1),
    SW(-1, -1),
    S(-1, 0),
    SE(-1, 1);

    /**
     * Here we have two attributes which are the row number and the column
     * number. number of the column. so thanks to that, we can so we can modify
     * them thanks to the enumeration which will add or remove a a certain value
     * to the row and column number to be able to create a direction. create a
     * direction.
     */
    private int deltaRow;
    private int deltaColumn;

    /**
     * Here we have defined a constructor that will allow us to initialise a
     * direction. In order to be able to move the pieces of the chessboard.
     *
     *
     * @param deltaR the number of the line where the piece is located.
     * @param deltaC The number of the column where the piece is located.
     */
    private Direction(int deltaR, int deltaC) {
        this.deltaRow = deltaR;
        this.deltaColumn = deltaC;
    }

    /**
     * accessor that will allow us to retrieve the private attribute deltaRow.
     *
     * @return the value of deltaRow.
     */
    public int getDeltaRow() {
        return deltaRow;
    }

    /**
     * accessor that will allow us to retrieve the private attribute
     * deltaColumn.
     *
     * @return the value of deltaRow.
     */
    public int getDeltaColumn() {
        return deltaColumn;
    }

}
