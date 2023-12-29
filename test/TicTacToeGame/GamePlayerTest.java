package TicTacToeGame;

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

}