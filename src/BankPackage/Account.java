package BankPackage;

import BankPackage.exceptions.InvalidAmountError;
import BankPackage.exceptions.PinError;

public class Account {
    private String name;
    private int balance;
    private String pin;
    private int number;

    public Account(String name, String pin, int number) {
        this.name = name;
        this.pin = pin;
        this.number = number;

    }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new InvalidAmountError("Amount should be greater than 0");
        }
        this.balance += amount;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int checkBalance(String pin){
        validatePin(pin);
        return getBalance();
    }

    public void withdraw(int amount, String pin) {
        validatePin(pin);
        validateAmountGreaterThanZero(amount);
        validateAmountGreaterThanBalance(amount);
        this.balance -= amount;
    }

    public void validatePin(String pin){
        if(!pin.equals(this.pin)){
            throw new PinError("Incorrect pin or whatever");
        }
    }
    public void validateAmountGreaterThanZero(int amount){
        if(amount <= 0){
            throw new InvalidAmountError("Amount must be greater than 0");
        }
    }
    public void validateAmountGreaterThanBalance(int amount){
        if(this.balance < amount){
            throw new InvalidAmountError("Insufficient Fund");

        }
    }
}