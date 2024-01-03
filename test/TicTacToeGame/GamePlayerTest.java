package TicTacToeGame;

import TicTacToeGame.exceptions.InvalidMoveException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static TicTacToeGame.BoardState.X;
import static TicTacToeGame.BoardState.O;

import static org.junit.jupiter.api.Assertions.*;

class GamePlayerTest {
    private GamePlayer gamePlayerOne;
    private GamePlayer gamePlayerTwo;
    private TicTacToeBoard ticTacToeBoard;
    @BeforeEach
    void setUp(){
        gamePlayerOne = new GamePlayer(X, "Melody");
        gamePlayerTwo = new GamePlayer(O,"Michael");
        ticTacToeBoard = new TicTacToeBoard();
    }
    @Test
    void testGetPlayerState(){
        assertEquals(X,gamePlayerOne.getBoardStates());
        assertEquals(O,gamePlayerTwo.getBoardStates());
    }
    @Test
    void testThatTicTacToeBoardExist(){
        assertNotNull(ticTacToeBoard);
    }
    @Test
    void testThatTicTacToeBoardIsEmpty(){
        ticTacToeBoard.displayBoardSurface();
    }
    @Test
    void testThatPlayerOneCanPlay(){
        gamePlayerOne.playGame(2, ticTacToeBoard);
        BoardState[][] boardSurface = ticTacToeBoard.getBoardSurface();
        assertEquals(X, boardSurface[0][1]);
    }
    @Test
    void testThatPlayerTwoCanPlay(){
        gamePlayerTwo.playGame(3,ticTacToeBoard);
        BoardState[][] boardSurface = ticTacToeBoard.getBoardSurface();
        assertEquals(O, boardSurface[0][2]);
    }
    @Test
    void testThatBothPlayerOneAndTwoCanPlay(){
        gamePlayerOne.playGame(5,ticTacToeBoard);
        gamePlayerTwo.playGame(3,ticTacToeBoard);
        BoardState[][] boardSurface = ticTacToeBoard.getBoardSurface();
        assertEquals(X,boardSurface[1][1]);
        assertEquals(O,boardSurface[0][2]);
    }
    @Test
    void testThatExceptionIsThrownIfPlayerEntersAPositionNotOnBoard(){
        assertThrows(ArrayIndexOutOfBoundsException.class,()-> gamePlayerOne.playGame(11,ticTacToeBoard));
        assertThrows(ArrayIndexOutOfBoundsException.class,()-> gamePlayerOne.playGame(0,ticTacToeBoard));
        assertThrows(ArrayIndexOutOfBoundsException.class,()-> gamePlayerOne.playGame(-5,ticTacToeBoard));
    }
    @Test
    void testThatExceptionIsThrownIfPlayersTryToPlayOnAPositionThatIsNotEmpty(){
        BoardState [][] boardSurface = ticTacToeBoard.getBoardSurface();
        gamePlayerOne.playGame(5, ticTacToeBoard);
        assertThrows(InvalidMoveException.class, ()-> gamePlayerTwo.playGame(5,ticTacToeBoard));
        assertEquals(X, boardSurface[1][1]);
    }
    @Test
    void testThatTrueIsReturnedIfThereIsWinnerOnRowZero(){
        gamePlayerOne.playGame(1, ticTacToeBoard);
        gamePlayerTwo.playGame(9, ticTacToeBoard);
        gamePlayerOne.playGame(2, ticTacToeBoard);
        gamePlayerTwo.playGame(6, ticTacToeBoard);
        gamePlayerOne.playGame(3, ticTacToeBoard);
        assertTrue(ticTacToeBoard.isWinner());
    }
    @Test
    void testTrueIsReturnedIfThereIsWinnerOnRowOne(){
        gamePlayerOne.playGame(9, ticTacToeBoard);
        gamePlayerTwo.playGame(4, ticTacToeBoard);
        gamePlayerOne.playGame(7, ticTacToeBoard);
        gamePlayerTwo.playGame(5, ticTacToeBoard);
        gamePlayerOne.playGame(1, ticTacToeBoard);
        gamePlayerTwo.playGame(6, ticTacToeBoard);
        assertTrue(ticTacToeBoard.isWinner());
    }
    @Test
    void testThatTrueIsReturnedIfThereIsWinnerOnRowTwo(){
        gamePlayerOne.playGame(7, ticTacToeBoard);
        gamePlayerTwo.playGame(2, ticTacToeBoard);
        gamePlayerOne.playGame(8, ticTacToeBoard);
        gamePlayerTwo.playGame(6, ticTacToeBoard);
        gamePlayerOne.playGame(9, ticTacToeBoard);
        assertTrue(ticTacToeBoard.isWinner());
    }
    @Test
    void testThatTrueIsReturnedIfThereIsWinnerOnColumnZero(){
        gamePlayerOne.playGame(9,ticTacToeBoard);
        gamePlayerTwo.playGame(1,ticTacToeBoard);
        gamePlayerOne.playGame(5,ticTacToeBoard);
        gamePlayerTwo.playGame(4,ticTacToeBoard);
        gamePlayerOne.playGame(3,ticTacToeBoard);
        gamePlayerTwo.playGame(7,ticTacToeBoard);
        assertTrue(ticTacToeBoard.isWinner());
    }

    @Test
    void testThatTrueIsReturnedIfThereIsWinnerOnColumnOne(){
        gamePlayerOne.playGame(1,ticTacToeBoard);
        gamePlayerTwo.playGame(2,ticTacToeBoard);
        gamePlayerOne.playGame(3,ticTacToeBoard);
        gamePlayerTwo.playGame(5,ticTacToeBoard);
        gamePlayerOne.playGame(9,ticTacToeBoard);
        gamePlayerTwo.playGame(8,ticTacToeBoard);
        assertTrue(ticTacToeBoard.isWinner());
    }
    @Test
    void testThatTrueIsReturnedIfThereIsWinnerOnColumnTwo(){
        gamePlayerOne.playGame(3,ticTacToeBoard);
        gamePlayerTwo.playGame(2,ticTacToeBoard);
        gamePlayerOne.playGame(6,ticTacToeBoard);
        gamePlayerTwo.playGame(5,ticTacToeBoard);
        gamePlayerOne.playGame(9,ticTacToeBoard);
        gamePlayerTwo.playGame(1,ticTacToeBoard);
        assertTrue(ticTacToeBoard.isWinner());
    }
    @Test
    void testThatTrueIsReturnedIfThereIsWinnerForwardDiagonal(){
        gamePlayerOne.playGame(1,ticTacToeBoard);
        gamePlayerTwo.playGame(2,ticTacToeBoard);
        gamePlayerOne.playGame(5,ticTacToeBoard);
        gamePlayerTwo.playGame(6,ticTacToeBoard);
        gamePlayerOne.playGame(9,ticTacToeBoard);
        gamePlayerTwo.playGame(8,ticTacToeBoard);
        assertTrue(ticTacToeBoard.isWinner());
    }
    @Test
    void trueIsReturnedIfThereIsAWinnerBackWardDiagonal(){
        gamePlayerOne.playGame(3,ticTacToeBoard);
        gamePlayerTwo.playGame(2,ticTacToeBoard);
        gamePlayerOne.playGame(5,ticTacToeBoard);
        gamePlayerTwo.playGame(6,ticTacToeBoard);
        gamePlayerOne.playGame(7,ticTacToeBoard);
        gamePlayerTwo.playGame(8,ticTacToeBoard);
        assertTrue(ticTacToeBoard.isWinner());
    }
    @Test
    void trueIsReturnedWhenThereIsATie(){
        gamePlayerOne.playGame(1,ticTacToeBoard);
        gamePlayerTwo.playGame(2,ticTacToeBoard);
        gamePlayerOne.playGame(3,ticTacToeBoard);
        gamePlayerTwo.playGame(9,ticTacToeBoard);
        gamePlayerOne.playGame(5,ticTacToeBoard);
        gamePlayerTwo.playGame(6,ticTacToeBoard);
        gamePlayerOne.playGame(8,ticTacToeBoard);
        gamePlayerTwo.playGame(7,ticTacToeBoard);
        gamePlayerOne.playGame(4,ticTacToeBoard);
        assertFalse(ticTacToeBoard.isWinner());
        assertTrue(ticTacToeBoard.isATie());
    }
}