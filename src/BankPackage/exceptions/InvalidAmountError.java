package BankPackage.exceptions;

public class InvalidAmountError extends RuntimeException {
    public InvalidAmountError(String errorMessage){
        super(errorMessage);

    }

}
