package BankPackage;

public class AccountNotFoundError extends RuntimeException{
    public AccountNotFoundError(String errorMessage){
        super(errorMessage);

    }
}
