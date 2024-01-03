package TicTacToeGame.exceptions;

public class InvalidMoveException extends RuntimeException{
    public InvalidMoveException(String invalidMoveExceptionMessage){
        super(invalidMoveExceptionMessage);
    }
}
