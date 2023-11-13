package OopTasks;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    // deposit method
    //This method allows depositing a specified amount into the account
    // and prints the updated balance.
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn " + amount + "your current balance is " + balance);
        }
        else {
            System.out.println("Insufficient funds. withdrawal denied");
        }

    }




}
