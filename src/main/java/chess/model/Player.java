package chess.model;

import java.util.Objects;

/**
 * This class will allow us to create objects that are neither more nor less
 * than the player.
 *
 * @author alecw
 */
public class Player {

    private Color color; // This attribute defines the colour of the player.

    /**
     * Here the constructor will allow us to initialise the player with the
     * given colour.
     *
     * @param color The colour of the player.
     */
    public Player(Color color) {
        this.color = color;
    }

    /**
     * accessor which will allow us to retrieve the private attribute which
     * happens to be the player's colour.
     *
     * @return The colour of the player.
     */
    public Color getColor() {
        return color;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.color);
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
        final Player other = (Player) obj;
        return this.color == other.color;
    }

    @Override
    public String toString() {
        return (getColor() == Color.BLACK) ? " Player 1 !!  " + "(BLACK)" : " Player 2 !! " + "(WHITE)";
    }
}
