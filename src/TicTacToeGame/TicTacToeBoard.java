package TicTacToeGame;
import static TicTacToeGame.BoardState.*;
public class TicTacToeBoard {
    private final BoardState[][] boardSurface;
    public TicTacToeBoard(){
        boardSurface = new BoardState[][]{{Empty,Empty,Empty}, {Empty,Empty,Empty}, {Empty,Empty,Empty}};
    }
    public void displayBoardSurface(){
        for(BoardState[] boardStates : boardSurface){
            System.out.print(" | ");
            for(int i = 0; i < boardSurface.length; i++){
                System.out.print(boardStates[i]);
                System.out.print(" | ");
            }
            System.out.println();
            System.out.println();
        }
    }
    public BoardState[][] getBoardSurface(){
        return boardSurface;
    }
    public boolean isWinner(){
        if(isWinnerRowZero())
            return true;
        else if (isWinnerRowOne())
            return true;
        else if (isWinnerRowTwo())
            return true;
        else if (isWinnerColumnZero())
            return true;
        else if (isWinnerColumnOne())
            return true;
        else if (isWinnerColumnTwo())
            return true;
        else if (isWinnerForwardDiagonal())
            return true;
        else if (isWinnerBackwardDiagonal())
            return true;
        return false;
    }
    private boolean isWinnerRowZero() {
        boolean isX = boardSurface[0][0] == X && boardSurface[0][1] == X && boardSurface[0][2] == X;
        boolean isO = boardSurface[0][0] == O && boardSurface[0][1] == O && boardSurface[0][2] == O;
        return isX || isO;
    }
    private boolean isWinnerRowOne() {
        boolean isX = boardSurface[1][0] == X && boardSurface[1][1] == X && boardSurface[1][2] == X;
        boolean isO = boardSurface[1][0] == O && boardSurface[1][1] == O && boardSurface[1][2] == O;
        return isX || isO;
    }
    private boolean isWinnerRowTwo() {
        boolean isX = boardSurface[2][0] == X && boardSurface[2][1] == X && boardSurface[2][2] == X;
        boolean isO = boardSurface[2][0] == O && boardSurface[2][1] == O && boardSurface[2][2] == O;
        return isX || isO;
    }
    private boolean isWinnerColumnZero() {
        boolean isX = boardSurface[0][0] == X && boardSurface[1][0] == X && boardSurface[2][0] == X;
        boolean isO = boardSurface[0][0] == O && boardSurface[1][0] == O && boardSurface[2][0] == O;
        return isX || isO;
    }
    private boolean isWinnerColumnOne() {
        boolean isX = boardSurface[0][1] == X && boardSurface[1][1] == X && boardSurface[2][1] == X;
        boolean isO = boardSurface[0][1] == O && boardSurface[1][1] == O && boardSurface[2][1] == O;
        return isX || isO;
    }
    private boolean isWinnerColumnTwo() {
        boolean isX = boardSurface[0][2] == X && boardSurface[1][2] == X && boardSurface[2][2] == X;
        boolean isO = boardSurface[0][2] == O && boardSurface[1][2] == O && boardSurface[2][2] == O;
        return isX || isO;
    }
    private boolean isWinnerForwardDiagonal() {
        boolean isX = boardSurface[0][0] == X && boardSurface[1][1] == X && boardSurface[2][2] == X;
        boolean isO = boardSurface[0][0] == O && boardSurface[1][1] == O && boardSurface[2][2] == O;
        return isX || isO;
    }
    private boolean isWinnerBackwardDiagonal() {
        boolean isX = boardSurface[0][2] == X && boardSurface[1][1] == X && boardSurface[2][0] == X;
        boolean isO = boardSurface[0][2] == O && boardSurface[1][1] == O && boardSurface[2][0] == O;
        return isX || isO;
    }
    public boolean isATie(){
        return !checkIsTie() && !isWinner();
    }
    private boolean checkIsTie() {
        for(BoardState[] boardStates : boardSurface){
            for(int i = 0; i < boardSurface.length; i++){
                if (boardStates[i] == Empty)
                    return true;
            }
        }
        return false;
    }
}
