package TicTacToeGame;

public class GameMain {
    public static void main(String[] args) {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        ticTacToeBoard.displayBoard();

        ticTacToeBoard.makeMove(0,0);
        ticTacToeBoard.displayBoard();
        ticTacToeBoard.makeMove(1,1);
        ticTacToeBoard.displayBoard();
        ticTacToeBoard.makeMove(0,1);
        ticTacToeBoard.displayBoard();
        ticTacToeBoard.makeMove(2,2);
        ticTacToeBoard.displayBoard();
        ticTacToeBoard.makeMove(0,2);
    }
}
