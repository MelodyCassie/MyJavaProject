package DiaryApp.exceptions;

public class EmptyInputError extends RuntimeException{
    public EmptyInputError(String emptyInputErrorMessage){
        super(emptyInputErrorMessage);
    }
}
