package TicTacToeGame;

import TicTacToeGame.exceptions.InvalidMoveException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BoardStateTest {
    private TicTacToeBoard ticTacToeBoard;

    @BeforeEach
    void setUp() {
        ticTacToeBoard = new TicTacToeBoard();
    }
    @Test
    public void testInitialBoardIsEmpty(){
        TicTacToeBoard.BoardState[][] initialBoard = ticTacToeBoard.getBoardStates();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Assertions.assertEquals(TicTacToeBoard.BoardState.EMPTY, initialBoard[i][j]);
            }
        }
    }

    @Test
    public void testBoardIsInitializedCorrectly() {
        TicTacToeBoard.BoardState[][] boardStates = ticTacToeBoard.getBoardStates();
        Assertions.assertEquals(3, boardStates.length);


    }

    @Test
    public void testMakeMove() {
        Assertions.assertTrue(ticTacToeBoard.isValidMove(1, 1));
        ticTacToeBoard.makeMove(1, 1);
        Assertions.assertEquals(TicTacToeBoard.BoardState.X, ticTacToeBoard.getBoardStates()[1][1]);
    }
    @Test
    public void testMakeTwoMoves(){
        ticTacToeBoard.makeMove(0,0);
        ticTacToeBoard.makeMove(1,1);
        Assertions.assertEquals(TicTacToeBoard.BoardState.O, ticTacToeBoard.getBoardStates()[1][1]);
    }
    @Test
    public void testInvalidMoveException(){
        ticTacToeBoard.makeMove(1,1);
        Assertions.assertThrows(InvalidMoveException.class, () -> ticTacToeBoard.makeMove(1,1));
    }



    @Test
    public void testPlayerXWinsRow() {

        ticTacToeBoard.makeMove(0, 0);
        ticTacToeBoard.makeMove(1, 0);
        ticTacToeBoard.makeMove(0, 1);
        ticTacToeBoard.makeMove(1, 1);
        ticTacToeBoard.makeMove(0, 2);
        Assertions.assertEquals("Player X wins!", ticTacToeBoard.getGameStatus());
    }
    @Test
    public void testPlayerOWinsColumn() {
        ticTacToeBoard.makeMove(1, 0);
        ticTacToeBoard.makeMove(0, 0);
        ticTacToeBoard.makeMove(1, 1);
        ticTacToeBoard.makeMove(0, 1);
        ticTacToeBoard.makeMove(2, 2);
        ticTacToeBoard.makeMove(0, 2);
        Assertions.assertEquals("Player O wins!", ticTacToeBoard.getGameStatus());
    }


    @Test
    public void testPlayerXWinsDiagonal() {
        ticTacToeBoard.makeMove(0, 0);
        ticTacToeBoard.makeMove(0, 1);
        ticTacToeBoard.makeMove(1, 1);
        ticTacToeBoard.makeMove(0, 2);
        ticTacToeBoard.makeMove(2, 2);
        Assertions.assertEquals("Player X wins!", ticTacToeBoard.getGameStatus());
    }

    @Test
    public void testPlayerODiagonalWins(){
        ticTacToeBoard.makeMove(0, 2);
        ticTacToeBoard.makeMove(0, 0);
        ticTacToeBoard.makeMove(1, 1);
        ticTacToeBoard.makeMove(1, 0);
        ticTacToeBoard.makeMove(2, 0);
        Assertions.assertEquals("Player O wins!", ticTacToeBoard.getGameStatus());

    }


    @Test
    public void testPlayerXVerticalWins(){
        ticTacToeBoard.makeMove(0, 0);
        ticTacToeBoard.makeMove(0, 1);
        ticTacToeBoard.makeMove(1, 0);
        ticTacToeBoard.makeMove(1, 1);
        ticTacToeBoard.makeMove(2, 0);
        Assertions.assertEquals("Player X wins!", ticTacToeBoard.getGameStatus());

    }
    @Test
    public void testPlayerOVerticalWins(){
        ticTacToeBoard.makeMove(0, 1);
        ticTacToeBoard.makeMove(0, 0);
        ticTacToeBoard.makeMove(1, 1);
        ticTacToeBoard.makeMove(1, 0);
        ticTacToeBoard.makeMove(2, 2);
        ticTacToeBoard.makeMove(2, 0);
        Assertions.assertEquals("Player O wins!", ticTacToeBoard.getGameStatus());
    }



    @Test
    public void testGameIsDraw() {
        ticTacToeBoard.makeMove(0, 0);
        ticTacToeBoard.makeMove(1, 1);
        ticTacToeBoard.makeMove(2, 0);
        ticTacToeBoard.makeMove(1, 0);
        ticTacToeBoard.makeMove(0, 1);
        ticTacToeBoard.makeMove(0, 2);
        ticTacToeBoard.makeMove(2, 1);
        ticTacToeBoard.makeMove(1, 2);
        ticTacToeBoard.makeMove(2, 2);
        Assertions.assertEquals("It's a draw!", ticTacToeBoard.getGameStatus());
    }
}