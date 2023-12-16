package DiaryApp.exceptions;

public class PasswordError  extends  RuntimeException{
    public PasswordError(String passwordErrorMessage){
        super(passwordErrorMessage);
    }
}
