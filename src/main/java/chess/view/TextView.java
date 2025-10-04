package chess.view;

import chess.model.Board;
import chess.model.Model;
import chess.model.Position;
import java.util.Scanner;

/**
 *
 * @author alecw
 */
public class TextView implements View {

    private Model model;

    public TextView(Model model) {
        this.model = model;
    }

    /**
     * displays a title and a welcome message to players.
     */
    @Override
    public void displayTitle() {
        System.out.println("                                   ***ENIGMA CHESS***");
        System.out.println("                       Hello and welcome to our enigma chess game!! ");
        System.out.println();
    }

    /**
     * displays the game board.See the important note about this below.
     *
     */
    @Override
    public void displayBoard() {
        System.out.println("   ---------------------------------------------------------------------------------");

        for (int lg = 0; lg < Board.BOARD_SIZE; lg++) {
            System.out.print(8 - lg);
            System.out.print("  |");
            for (int col = 0; col < Board.BOARD_SIZE; col++) {
                Position pos = new Position(lg, col);
                if (model.getPiece(pos) == null) {
                    System.out.print("         |");
                } else {
                    System.out.print("" + model.getPiece(pos) + "|");
                }

                if (col == 7) {
                    System.out.println();
                    System.out.print("   ---------------------------------------------------------------------------------");

                }

            }
            System.out.println();
        }
        System.out.println();
        System.out.print("       ");
        for (int i = 0; i < 8; i++) {
            System.out.print(LettreColonne(i));
            System.out.print("         ");
        }
        System.out.println();
        System.out.println();
    }

    private static String LettreColonne(int col) {
        String LettreColonne = null;
        switch (col) {
            case 0:
                LettreColonne = "A";
                break;
            case 1:
                LettreColonne = "B";
                break;
            case 2:
                LettreColonne = "C";
                break;
            case 3:
                LettreColonne = "D";
                break;
            case 4:
                LettreColonne = "E";
                break;
            case 5:
                LettreColonne = "F";
                break;
            case 6:
                LettreColonne = "G";
                break;
            case 7:
                LettreColonne = "H";
                break;
            default:
        }
        return LettreColonne;
    }

    /**
     * shows the winning player.
     */
    @Override
    public void displayWinner() {
        System.out.println("And the winner is " + model.getCurrentPlayer());
    }

    /**
     * displays a message inviting the current player (white or black) to play,
     */
    @Override
    public void displayPlayer() {
        System.out.println("It's your turn to play " + model.getCurrentPlayer());
    }

    /*
     * Requires a valid position on the game board from the user. See
     * the important note about this below.
     * @return returns a position to ask the user.
     */
    @Override
    public Position askPosition() {
        System.out.println("Which position do you want to choose ?");
        Position position = new Position(askPositionRow(), askPositionColumn());
        return position;
    }

    /**
     * displays the error message passed in parameter.
     *
     * @param message The error message in question which is a sentence.
     */
    @Override
    public void displayError(String message) {
        System.out.println(message);
    }

    /**
     * Requests a valid position on the game board from the user. See the
     * important note about this below.
     *
     * @return a position to ask the user.
     */
    private int askPositionRow() {
        System.out.println(" >>> enter the number of the line (between 1 and 8) : ");
        int row = TrueNumbersLine(getIntFromKeyboard());
        return row;
    }

    private int askPositionColumn() {
        System.out.println(" >>> enter the letter of the column (Between a and h) : ");
        String Lower = getStringFromKeyboard().toLowerCase();
        int column = TrueNumbersColumn(Lower);
        return column;
    }

    /**
     * @return As long as it's not an integer it asks again and will return the
     * integer.
     */
    private int getIntFromKeyboard() {
        Scanner clavier = new Scanner(System.in);
        boolean checkKeyboard = clavier.hasNextInt();

        while (checkKeyboard == false) {
            System.out.println("The number entered is not an integer!!!");
            clavier.next();
            checkKeyboard = clavier.hasNextInt();
        }
        return clavier.nextInt();
    }

    /**
     * @return As long as it's not an String it asks again and will return the
     * String
     */
    private String getStringFromKeyboard() {
        Scanner clavier = new Scanner(System.in);
        boolean checkKeyboard = clavier.hasNextLine();

        while (checkKeyboard == false) {
            System.out.println("The number entered is not a Letter!!!");
            clavier.next();
            checkKeyboard = clavier.hasNextLine();
        }
        return clavier.nextLine();
    }

    private static int TrueNumbersLine(int line) {
        int Trueline = 1;
        switch (line) {
            case 1:
                Trueline = 7;
                break;
            case 2:
                Trueline = 6;
                break;
            case 3:
                Trueline = 5;
                break;
            case 4:
                Trueline = 4;
                break;
            case 5:
                Trueline = 3;
                break;
            case 6:
                Trueline = 2;
                break;
            case 7:
                Trueline = 1;
                break;
            case 8:
                Trueline = 0;
                break;
            default:

        }
        return Trueline;
    }

    private static int TrueNumbersColumn(String col) {
        int TrueColumn = 1;
        switch (col) {
            case "a":
                TrueColumn = 0;
                break;
            case "b":
                TrueColumn = 1;
                break;
            case "c":
                TrueColumn = 2;
                break;
            case "d":
                TrueColumn = 3;
                break;
            case "e":
                TrueColumn = 4;
                break;
            case "f":
                TrueColumn = 5;
                break;
            case "g":
                TrueColumn = 6;
                break;
            case "h":
                TrueColumn = 7;
                break;
            default:

        }
        return TrueColumn;
    }

    /**
     * This message tells the player that he is in check and must move his king.
     */
    @Override
    public void displayCheck() {
        System.out.println("Your king is in check Save it! Enter a new position " + "Player " + model.getCurrentPlayer());
    }

    /**
     * Message that tells the player he is in checkmate
     */
    @Override
    public void displayMat() {
        System.out.println("Unfortunately, I regret to inform you that you have been defeated... " + model.getCurrentPlayer());
    }

    /**
     * Message telling the player that the game ends in a draw.
     */
    @Override
    public void displayStaleMat() {
        System.out.println("Unfortunately this game ended in a draw but the most important thing is to have played! ");

    }

}
