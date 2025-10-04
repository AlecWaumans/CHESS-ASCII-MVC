package chess.model;

import chess.model.Direction;
import chess.model.Position;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * We are going to test with all the possible directions the Next method. To see
 * if it corresponds well to what we want.
 *
 * @author alecw
 */
public class PositionTest {

    public PositionTest() {
    }

    /**
     * we test with the new northwest position.
     */
    @Test
    public void testPosNW() {
        System.out.println("getRow and getColumn of the new position with Northwest direction. ");
        Position position1 = new Position(4, 4);
        Position position2 = position1.next(Direction.NW);
        int expResult = 5;
        int result = position2.getRow();
        assertEquals(expResult, result);
        int expResult2 = 3;
        int result2 = position2.getColumn();
        assertEquals(expResult2, result2);

    }

    /**
     * we test with the new north position.
     */
    @Test
    public void testPosN() {
        System.out.println("getRow and getColumn of the new position with North direction. ");
        Position position1 = new Position(4, 4);
        Position position2 = position1.next(Direction.N);
        int expResult = 5;
        int result = position2.getRow();
        assertEquals(expResult, result);
        int expResult2 = 4;
        int result2 = position2.getColumn();
        assertEquals(expResult2, result2);

    }

    /**
     * we test with the new north-eastern position.
     */
    @Test
    public void testPosNE() {
        System.out.println("getRow and getColumn of the new position with North-eastern direction. ");
        Position position1 = new Position(4, 4);
        Position position2 = position1.next(Direction.NE);
        int expResult = 5;
        int result = position2.getRow();
        assertEquals(expResult, result);
        int expResult2 = 5;
        int result2 = position2.getColumn();
        assertEquals(expResult2, result2);

    }

    /**
     * we test with the new western position.
     */
    @Test
    public void testPosW() {
        System.out.println("getRow and getColumn of the new position with western direction. ");
        Position position1 = new Position(4, 4);
        Position position2 = position1.next(Direction.W);
        int expResult = 4;
        int result = position2.getRow();
        assertEquals(expResult, result);
        int expResult2 = 3;
        int result2 = position2.getColumn();
        assertEquals(expResult2, result2);

    }

    /**
     * we test with the new Eastern position.
     */
    @Test
    public void testPosE() {
        System.out.println("getRow and getColumn of the new position with Eastern direction. ");
        Position position1 = new Position(4, 4);
        Position position2 = position1.next(Direction.E);
        int expResult = 4;
        int result = position2.getRow();
        assertEquals(expResult, result);
        int expResult2 = 5;
        int result2 = position2.getColumn();
        assertEquals(expResult2, result2);

    }

    /**
     * we test with the new southwestern position.
     */
    @Test
    public void testPosSW() {
        System.out.println("getRow and getColumn of the new position with southwestern direction. ");
        Position position1 = new Position(4, 4);
        Position position2 = position1.next(Direction.SW);
        int expResult = 3;
        int result = position2.getRow();
        assertEquals(expResult, result);
        int expResult2 = 3;
        int result2 = position2.getColumn();
        assertEquals(expResult2, result2);

    }

    /**
     * we test with the new south position.
     */
    @Test
    public void testPosS() {
        System.out.println("getRow and getColumn of the new position with south direction. ");
        Position position1 = new Position(4, 4);
        Position position2 = position1.next(Direction.S);
        int expResult = 3;
        int result = position2.getRow();
        assertEquals(expResult, result);
        int expResult2 = 4;
        int result2 = position2.getColumn();
        assertEquals(expResult2, result2);

    }

    /**
     * we test with the new south-eastern position.
     */
    @Test
    public void testPosSE() {
        System.out.println("getRow and getColumn of the new position with south-eastern direction. ");
        Position position1 = new Position(4, 4);
        Position position2 = position1.next(Direction.SE);
        int expResult = 3;
        int result = position2.getRow();
        assertEquals(expResult, result);
        int expResult2 = 5;
        int result2 = position2.getColumn();
        assertEquals(expResult2, result2);

    }

}
