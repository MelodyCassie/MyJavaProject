package TicTacToeGame;

public class TicTacToeBoard {
    enum BoardState{
        EMPTY,X,O
    }
    private BoardState[][] boardStates ;
    private BoardState currentPlayer;

    public TicTacToeBoard(){
        boardStates = new BoardState[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boardStates[i][j] = BoardState.EMPTY;
            }
        }
        currentPlayer = BoardState.X;
    }
    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(boardStates[i][j] + " ");
            }
            System.out.println();
        }
    }



    public void makeMove(int row, int column) {
        if(boardStates[row][column] == BoardState.EMPTY){
            boardStates[row][column] = currentPlayer;
            checkGameStatus();
            currentPlayer = (currentPlayer == BoardState.X) ? BoardState.O : BoardState.X;
        }else{
            System.out.println("Invalid move! \n Try again.");
        }
    }

    private void checkGameStatus() {

        for (int i = 0; i < 3; i++) {
            if (boardStates[i][0] == boardStates[i][1] && boardStates[i][1] == boardStates[i][2] && boardStates[i][0] != BoardState.EMPTY) {
                System.out.println("Player " + currentPlayer + " wins!");
                return;

            }
            if (boardStates[0][i] == boardStates[1][i] && boardStates[1][i] == boardStates[2][i] && boardStates[0][i] != BoardState.EMPTY) {
                System.out.println("Player " + currentPlayer + " wins!");
                return;
            }
        }
        if ((boardStates[0][0] == boardStates[1][1] && boardStates[1][1] == boardStates[2][2] && boardStates[0][0] != BoardState.EMPTY) ||
                (boardStates[0][2] == boardStates[1][1] && boardStates[1][1] == boardStates[2][0] && boardStates[0][2] != BoardState.EMPTY)) {
            System.out.println("Player " + currentPlayer + " wins!");
            return;
        }
    }
    private void checkForDraw() {
        boolean isDraw = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (boardStates[i][j] == BoardState.EMPTY) {
                    isDraw = false;
                    break;
                }
            }
        }
        if (isDraw) {
            System.out.println("It's a draw!");
        }
    }

    private boolean isValidMove(int row, int column) {
        return row >= 0 && row < 3 && column >= 0 && column < 3;
    }
    public BoardState[][] getBoardStates(){
        return boardStates;
    }

}
