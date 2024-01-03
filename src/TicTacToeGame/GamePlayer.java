package TicTacToeGame;
import TicTacToeGame.exceptions.InvalidMoveException;
import static TicTacToeGame.BoardState.Empty;

public class GamePlayer {
    private String name;
    private final BoardState boardStates;

    public GamePlayer(BoardState boardStates, String name) {
        this.boardStates = boardStates;
        this.name = name;
    }
    public BoardState getBoardStates(){
        return boardStates;
    }
    public void playGame(int position, TicTacToeBoard ticTacToeBoard){
        int row = 0;
        int column = position - 1;
        if(position <= 0 || position > 9)
            throw new ArrayIndexOutOfBoundsException("Enter a position btw 1-9");
        else {
            var boardSurface = ticTacToeBoard.getBoardSurface();
            if (position > 3){
                row = 1;
                column = position - 4;
            }
            if(position > 6){
                row = 2;
                column = position - 7;
            }
            if(isEmptyPosition(column, boardSurface[row])){
                boardSurface[row][column] = boardStates;
            }
        }
    }
    private boolean isEmptyPosition(int column, BoardState[] boardSurface) {
        if(boardSurface[column] == Empty) return true;
        else throw new InvalidMoveException("Invalid Move.\n You can only move to an empty position..");
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
