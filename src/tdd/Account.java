package tdd;

public class Account {
    private int balance;

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount2) {
        if(amount2<balance);
        System.out.println("INSUFFICIENT FUND");
        balance = balance - amount2;
    }
    public int checkBalance() {
    return balance;
    }
}


