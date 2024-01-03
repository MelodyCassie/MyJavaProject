package TicTacToeGame;
import TicTacToeGame.exceptions.InvalidMoveException;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import static TicTacToeGame.BoardState.O;
import static TicTacToeGame.BoardState.X;
import static java.lang.System.exit;

public class GameMain {
    private static final GamePlayer gamePlayerOne = new GamePlayer(X,"PlayerOne");
    private static final GamePlayer gamePlayerTwo = new GamePlayer(O, "PlayerTwo");
    private static final TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();

    static Random random = new Random();
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        startGame();
    }
    public static void startGame(){
        boardSurface();
        display("""
                <><><><><><><><> Tic Tac Toe Game <><><><><><><><>
                Select an option below.
                1- Play with human
                2- Play with computer
                3- Quit
                """);
        System.out.println();
        int notAllowed = 0;
        try {
            notAllowed += input.nextInt();
        }catch (InputMismatchException e){
            display("Select correctly! \n Try Again.");
            input.nextLine();
            startGame();
        }
        switch (notAllowed){
            case 1 -> playWithHuman();
            case 2 -> playWithComputer();
            case 3 -> exit(3);
            default -> startGame();
        }
    }
    private static void playWithHuman() {
        gamePlayerOneMove();
        gamePlayerTwoMove();
        playWithHuman();
    }

    private static void playWithComputer() {
        gamePlayerOneMove();
        computerMove();
        playWithComputer();
    }

    private static void gamePlayerOneMove() {
        display("Player One choose position: ");
        try {
             int playerOnePosition = input.nextInt();
             gamePlayerOne.playGame(playerOnePosition,ticTacToeBoard);
             boardSurface();
             winnerDisplay("Player One Wins! ");
        }
        catch (InvalidMoveException | ArrayIndexOutOfBoundsException | InputMismatchException exception){
                playerOneCatchBlock(exception);
        }
    }
    private static void playerOneCatchBlock(RuntimeException exception) {
        if (exception.getMessage() == null)
            display("Digits Only! ");
        else display("Enter a valid digit ");
        input.nextLine();
        gamePlayerOneMove();
    }
    private static void gamePlayerTwoMove(){
        display("Player Two choose your position: ");
         try {
             int playerTwoPosition = input.nextInt();
             gamePlayerTwo.playGame(playerTwoPosition,ticTacToeBoard);
             boardSurface();
             winnerDisplay("Player Two Wins! ");
        }
         catch (InvalidMoveException | ArrayIndexOutOfBoundsException | InputMismatchException exception){
            playerTwoCatchBlock(exception);
        }
    }
    private static void playerTwoCatchBlock(RuntimeException exception) {
        if(exception.getMessage() == null)
            display("Digits Only! ");
        else display("Enter a valid digit ");
        input.nextLine();
        gamePlayerTwoMove();
    }
    private static void computerMove() {
        display("Computer Position Selected");
        try {
            int computerPosition = (1 + random.nextInt(9));
            gamePlayerTwo.playGame(computerPosition,ticTacToeBoard);
            boardSurface();
            winnerDisplay("Computer Wins! ");
        }
        catch (InvalidMoveException | ArrayIndexOutOfBoundsException exception ){
            computerMoveCatchBlock(exception);
        }
    }
    private static void computerMoveCatchBlock(RuntimeException exception) {
        display(exception.getMessage());
        display("Enter a valid digit ");
        computerMove();
    }
    private static void winnerDisplay(String display) {
        if(ticTacToeBoard.isWinner()) {
            display(display);
            exit(3);
        }
        if(ticTacToeBoard.isATie()) {
            display("Its a tie! ");
            display("Restart ");
            exit(3);
        }
    }
    private static void boardSurface() {
        ticTacToeBoard.displayBoardSurface();
    }

    private static void display(String display) {
        System.out.println(display);
    }
}
