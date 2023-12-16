package BankPackage.exceptions;

public class PinError extends RuntimeException {
    public PinError(String pinErrorMessage){
        super(pinErrorMessage);

    }
}
