package TicTacToeGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

class BoardStateTest {
    private TicTacToeBoard ticTacToeBoard;

    @BeforeEach
    void setUp() {
        ticTacToeBoard = new TicTacToeBoard();
    }
    @Test
    public void initialBoardIsEmptyTest(){
        TicTacToeBoard.BoardState[][] initialBoard = ticTacToeBoard.getBoardStates();
    }

    @Test
    public void boardIsInitializedCorrectlyTest() {
        BoardState[][] boardStates = ticTacToeBoard.getBoardState();
        assertEquals(3, boardStates.length);


    }

    @Test
    public void boardUpdatesCorrectlyTest() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();
        ticTacToeBoard.makeMove(0, 0);


        BoardState[][] updatedBoardState = ticTacToeBoard.getBoardState();
        assertEquals(BoardState.X, updatedBoardState[0][0]);


    }

    @Test
    public void checkForWinHorizontalTest() {
        TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();

        ticTacToeBoard.makeMove(0, 0);
        ticTacToeBoard.makeMove(1, 0);
        ticTacToeBoard.makeMove(0, 1);
        ticTacToeBoard.makeMove(1, 1);
        ticTacToeBoard.makeMove(0, 2);

        assertTrue(ticTacToeBoard.checkForWin());


    }
}