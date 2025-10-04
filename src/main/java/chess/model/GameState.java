package chess.model;

/**
 * This class will allow us to create the state of the game so that we know what
 * to to do afterwards.
 *
 * @author alecw
 */
public enum GameState {
    PLAY,
    CHECK,
    CHECK_MATE,
    STALE_MATE;
}
