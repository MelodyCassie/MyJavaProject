package DiaryApp.exceptions;

public class UsernameAlreadyExistError extends RuntimeException{
    public UsernameAlreadyExistError (String usernameAlreadyExistErrorMessage){
        super(usernameAlreadyExistErrorMessage);
    }
}
