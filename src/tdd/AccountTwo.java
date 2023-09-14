package tdd;

public class AccountTwo {

    private int balance;

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount2){
        balance = balance - amount2;
    }
    public void transfer(int amount3){
        balance = balance + amount3;

    }
    public int getBalance() {
        return balance;
    }

}