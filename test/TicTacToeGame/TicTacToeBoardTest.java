package TicTacToeGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeBoardTest {
    @Test
    public void testBoardIsEmptyInitially(){
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        TicTacToeBoard.BoardState[][] initialBoard = ticTacToeBoard.getBoardStates();
        for(int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j++){
                assertEquals(TicTacToeBoard.BoardState.EMPTY,initialBoard[i][j]);
            }
        }
    }

}