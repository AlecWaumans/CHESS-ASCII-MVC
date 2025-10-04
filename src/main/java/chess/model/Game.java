package chess.model;

import chess.model.Pieces.Bishop;
import chess.model.Pieces.King;
import chess.model.Pieces.Knight;
import chess.model.Pieces.Pawn;
import chess.model.Pieces.Piece;
import chess.model.Pieces.Queen;
import chess.model.Pieces.Rook;
import java.util.ArrayList;
import java.util.List;

/**
 * It is thanks to this class that we will create the key methods and implement
 * thanks to a model interface the course of the game.
 *
 * @author alecw
 */
public class Game implements Model {

    private Board board;
    private Player white;
    private Player black;
    private Player currentPlayer;
    private King whiteKing;
    private King blackKing;
    private GameState state;

    /**
     * Here the constructor will initialize the white and black player and will
     * create an empty board.
     */
    public Game() {
        this.white = new Player(Color.WHITE);
        this.black = new Player(Color.BLACK);
        this.board = new Board();

    }

    /**
     * Get the piece of the board located on a given position
     *
     * @param pos the position
     * @return the piece located at P
     * @throws IllegalArgumentException pos is not located on the board.
     */
    @Override
    public Piece getPiece(Position pos) {
        if (!board.contains(pos)) {
            throw new IllegalArgumentException("The position is outside the chessboard.");
        }
        return board.getPiece(pos);
    }

    /**
     * Getter for the current player. Getter pour le joueur actuel.
     *
     * @return the current player.
     */
    @Override
    public Player getCurrentPlayer() {
        return this.currentPlayer;
    }

    /**
     * Getter for the current player. Getter pour le joueur actuel.
     *
     * @return the current player.
     */
    @Override
    public Player getOppositePlayer() {
        return (currentPlayer.getColor().opposite() == Color.BLACK) ? black : white;

    }

    /**
     *
     * @return The state of the game at all times.
     */
    @Override
    public GameState getState() {
        return this.state;
    }

    /**
     * Get the possible moves for the piece located at the specified position.
     *
     * @param position the position of the piece
     * @return the liste of admissible positions.
     */
    @Override
    public List<Position> getPossibleMoves(Position position) {
        if (board.isFree(position)) {
            throw new IllegalArgumentException("They are no pawn on this position" + position);
        }
        return board.getPiece(position).getPossibleMoves(position, board);
    }

    /**
     * Start the game: create the pieces and put them on the board, initialize
     * the current player to 'WHITE'.
     *
     */
    @Override
    public void start() {
        this.currentPlayer = this.white;
        this.whiteKing = new King(Color.WHITE);
        this.blackKing = new King(Color.BLACK);
        this.state = GameState.PLAY;

        for (int i = 0; i < Board.BOARD_SIZE; i++) {
            Pawn pawnBlack = new Pawn(Color.BLACK);
            Position posPawnBlack = new Position(6, i);
            board.setPiece(pawnBlack, posPawnBlack);

            Pawn pawnWhite = new Pawn(Color.WHITE);
            Position posPawnWhite = new Position(1, i);
            board.setPiece(pawnWhite, posPawnWhite);

        }
        Knight knightBlack = new Knight(Color.BLACK);
        Position posKnightBlack = new Position(7, 1);
        board.setPiece(knightBlack, posKnightBlack);

        Knight knightBlack2 = new Knight(Color.BLACK);
        Position posKnightBlack2 = new Position(7, 6);
        board.setPiece(knightBlack2, posKnightBlack2);

        Knight knightWhite = new Knight(Color.WHITE);
        Position posKnightWhite = new Position(0, 1);
        board.setPiece(knightWhite, posKnightWhite);

        Knight knightWhite2 = new Knight(Color.WHITE);
        Position posKnightnWhite2 = new Position(0, 6);
        board.setPiece(knightWhite2, posKnightnWhite2);

        King KingBlack = new King(Color.BLACK);
        Position posKingBlack = new Position(7, 4);
        board.setPiece(KingBlack, posKingBlack);

        King KingWhite = new King(Color.WHITE);
        Position posKingWhite = new Position(0, 4);
        board.setPiece(KingWhite, posKingWhite);

        Queen queenBlack = new Queen(Color.BLACK);
        Position posQueenBlack = new Position(7, 3);
        board.setPiece(queenBlack, posQueenBlack);

        Queen queenWhite = new Queen(Color.WHITE);
        Position posQueenWhite = new Position(0, 3);
        board.setPiece(queenWhite, posQueenWhite);

        Rook rookBlack = new Rook(Color.BLACK);
        Position posRookBlack = new Position(7, 0);
        board.setPiece(rookBlack, posRookBlack);

        Rook rookBlack2 = new Rook(Color.BLACK);
        Position posRookBlack2 = new Position(7, 7);
        board.setPiece(rookBlack2, posRookBlack2);

        Rook rookWhite = new Rook(Color.WHITE);
        Position posRookWhite = new Position(0, 0);
        board.setPiece(rookWhite, posRookWhite);

        Rook rookWhite2 = new Rook(Color.WHITE);
        Position posRookWhite2 = new Position(0, 7);
        board.setPiece(rookWhite2, posRookWhite2);

        Bishop bishopBlack = new Bishop(Color.BLACK);
        Position posBishopBlack = new Position(7, 2);
        board.setPiece(bishopBlack, posBishopBlack);

        Bishop bishopBlack2 = new Bishop(Color.BLACK);
        Position posBishopBlack2 = new Position(7, 5);
        board.setPiece(bishopBlack2, posBishopBlack2);

        Bishop bishopWhite = new Bishop(Color.WHITE);
        Position posBishopWhite = new Position(0, 2);
        board.setPiece(bishopWhite, posBishopWhite);

        Bishop bishopWhite2 = new Bishop(Color.WHITE);
        Position posBishopWhite2 = new Position(0, 5);
        board.setPiece(bishopWhite2, posBishopWhite2);

    }

    /**
     * Check if the square at the given position is occupied by a piece of the
     * current player.
     *
     * @param pos the postion
     * @return true if the position is occupied by a piece of the current
     * player, false otherwise.
     * @throws IllegalArgumentException if the position is not located on the
     * board.
     */
    @Override
    public boolean isCurrentPlayerPosition(Position pos) {
        if (!board.contains(pos)) {
            throw new IllegalArgumentException("The position is outside the chessboard. " + pos);
        }
        if (board.getPiece(pos) == null) {
            return false;
        } else {
            return currentPlayer.getColor() == board.getPiece(pos).getColor();
        }

    }

    /**
     * Moves a piece from one position of the chess board to another one. If the
     * game is not over, change the current player.
     *
     * @param oldPos the current position
     * @param newPos the new position of the board where to put the piece
     * @throws IllegalArgumentException if 1) oldPos or newPos are not located
     * on the board, or 2) oldPos does not contain a piece, or 3) the piece does
     * not belong to the current player, or 4) the move is not valid for the
     * piece located at position oldPos
     *
     */
    @Override
    public void movePiecePosition(Position oldPos, Position newPos) {
        if (!board.contains(oldPos)) {
            throw new IllegalArgumentException("The position is outside the chessboard. " + oldPos);
        }
        if (!board.contains(newPos)) {
            throw new IllegalArgumentException("The position is outside the chessboard. " + newPos);
        }
        if (board.getPiece(oldPos) == null) {
            throw new IllegalArgumentException("There is no Piece here " + oldPos);
        }
        if (currentPlayer.getColor() != board.getPiece(oldPos).getColor()) {
            throw new IllegalArgumentException("This Piece belongs to the opponent. " + board.getPiece(oldPos));
        }
        if (!board.getPiece(oldPos).getPossibleMoves(oldPos, board).contains(newPos)) {
            throw new IllegalArgumentException("This movement is impossible. " + oldPos + newPos);
        }
        /**
         * Here the running player makes his move.
         */
        Piece actualPiece = board.getPiece(oldPos);
        Piece futurPiece = board.getPiece(newPos);
        if (isValidMove(oldPos, newPos)) {
            board.setPiece(actualPiece, newPos);
            board.dropPiece(oldPos);
        }
        /**
         * here we check if the player is in check or not by moving.
         */
        if (this.currentPlayer.getColor() == Color.WHITE) {
            if (getCapturePositions(getOppositePlayer()).contains(board.getPiecePosition(whiteKing))) {
                this.state = GameState.CHECK;
            } else {
                this.state = GameState.PLAY;
            }
        } else {
            if (getCapturePositions(getOppositePlayer()).contains(board.getPiecePosition(blackKing))) {
                this.state = GameState.CHECK;
            } else {
                this.state = GameState.PLAY;
            }
        }
        /**
         * If so the move is cancelled and must be replayed.
         */
        if (GameState.CHECK == this.state) {
            board.dropPiece(newPos);
            board.setPiece(futurPiece, newPos);
            board.setPiece(actualPiece, oldPos);
        } else {
            /**
             * if the current player is not in check, then it is up to the
             * opposing player opponent
             */
            this.currentPlayer = getOppositePlayer();
            /**
             * here we check if the opponent has no more moves if yes the game
             * ends in a null match.
             */
            List<Position> posGetPossibleMove = new ArrayList(); // create a list.
            List<Position> listeOccupedBy = board.getPositionOccupiedBy(this.currentPlayer);

            for (Position position : listeOccupedBy) {
                posGetPossibleMove.addAll(board.getPiece(position).getPossibleMoves(position, board));
            }
            if (posGetPossibleMove.isEmpty()) {
                this.state = GameState.STALE_MATE;
                this.currentPlayer = null;
            }
            /**
             * and check if the opponent after the move is in check or if it is
             * checkmate.
             */
            if (this.currentPlayer.getColor() == Color.WHITE) {
                /**
                 * If he still has possible moves he is only in check
                 */
                if (getCapturePositions(getOppositePlayer()).contains(board.getPiecePosition(whiteKing))) {
                    this.state = GameState.CHECK;
                    /**
                     * If he can't move his king is in checkmate and the game is
                     * over
                     */
                    if (getCapturePositions(getOppositePlayer()).containsAll(getPossibleMoves(board.getPiecePosition(blackKing)))) {
                        this.state = GameState.CHECK_MATE;
                        this.currentPlayer = getOppositePlayer();
                    }
                } else {
                    this.state = GameState.PLAY;
                }
            } else {
                if (getCapturePositions(getOppositePlayer()).contains(board.getPiecePosition(blackKing))) {
                    this.state = GameState.CHECK;
                    if (getCapturePositions(getOppositePlayer()).containsAll(getPossibleMoves(board.getPiecePosition(blackKing)))) {
                        this.state = GameState.CHECK_MATE;
                        this.currentPlayer = getOppositePlayer();
                    }
                } else {
                    this.state = GameState.PLAY;
                }

            }

        }
    }

    /**
     * This is the only way to check that the movement of a part from the
     * position This is the same as the one used in the previous example.
     *
     * @param oldPos The position of the part in question.
     * @param newPos The position from which you want to move the part.
     * @return True if the movement is possible and false otherwise.
     */
    @Override
    public boolean isValidMove(Position oldPos, Position newPos) {
        boolean isValidMove = true;
        if (board.isFree(oldPos)) {
            throw new IllegalArgumentException("They are nothing here " + oldPos);
        }

        List<Position> possibleMoves = board.getPiece(oldPos).getPossibleMoves(oldPos, board);
        //check that the movement is possible.
        if (!possibleMoves.contains(newPos)) {
            throw new IllegalArgumentException("The new position chosen is not correct");
        }
        //check that the movement is valid. 
        // we'll make the move 
        Piece actualPiece = board.getPiece(oldPos);
        Piece futurPiece = board.getPiece(newPos);
        board.setPiece(actualPiece, newPos);
        board.dropPiece(oldPos);

        List<Position> posUnvalidMovesKing = getCapturePositions(getOppositePlayer());
        Position actualKing = null;
        //The current position of the king is taken according to its colour.
        if (this.currentPlayer.getColor() == Color.BLACK) {
            actualKing = board.getPiecePosition(blackKing);
        } else {
            actualKing = board.getPiecePosition(whiteKing);
        }
        //the movement is cancelled 
        board.dropPiece(newPos);
        board.setPiece(futurPiece, newPos);
        board.setPiece(actualPiece, oldPos);
        // we check if the king after the move is in check or not. 
        if (posUnvalidMovesKing.contains(actualKing)) {
            isValidMove = false;
        }
        if (posUnvalidMovesKing.contains(actualKing)) {
            isValidMove = false;
        }

        return isValidMove;
    }

    /**
     * to determine all positions in which a player can capture another piece.
     *
     * @param player whose capture positions we want to know.
     * @return List of positions that the player can capture the piece.
     */
    private List<Position> getCapturePositions(Player player) {
        if (player == null) {
            throw new IllegalArgumentException("they are nothing player here");
        }
        List<Position> posCapturePiece = new ArrayList();
        List<Position> posGetPossibleMove = new ArrayList(); // create a list.
        List<Position> listeOccupedBy = board.getPositionOccupiedBy(player);

        for (Position position : listeOccupedBy) {
            posGetPossibleMove.addAll(board.getPiece(position).getCapturePositions(position, board));
        }
        for (Position pos : posGetPossibleMove) {
            if (board.getPiece(pos).getColor() == getOppositePlayer().getColor()) {
                posCapturePiece.add(pos);
            }
        }
        return posCapturePiece;

    }
}
