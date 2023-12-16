package BankPackage;
import java.util.ArrayList;
import java.util.List;
public class Bank {
    private String name;
    private List<Account> accounts;
    private int count;

    public Bank(String name){
        this.name = name;
        accounts = new ArrayList<>();
    }
    public void createAccount(String firstName, String lastName, String pin) {
       count++;
        String customersFullName = getCustomersFullName(firstName , lastName);
        Account account = new Account(customersFullName,pin,generateAccountNumber());
        accounts.add(account);
    }
    public String getCustomersFullName(String firstName , String lastName){
        return firstName + " " + lastName ;

    }
    public int generateAccountNumber(){
        return count;
    }

    public int getNumberOfAccountCreated() {
        return accounts.size();
    }



    public void deposit(int accountNumber,int amount) {
        Account account = findAccountNumber(accountNumber);
        account.deposit(amount);


    }

    public int checkBalance(int accountNumber, String pin) {
        Account account = findAccountNumber(accountNumber);
       return account.checkBalance(pin);

    }

    public Account findAccountNumber(int number){
        for(Account acct : accounts ){
            if (acct.getNumber() == number){
                return acct;
            }
        }
        throw new AccountNotFoundError("Account Not Found!");
    }
    public void withdraw(int accountNumber, int amount){
        Account account = findAccountNumber(accountNumber);
        account.withdraw(amount,"Pin");

    }
    public void removeAccount(int accountNumber, String pin){
        Account account = findAccountNumber(accountNumber);
        account.validatePin(pin);
        accounts.remove(account);

    }

    public void transfer(int senderAccountNumber, int receiverAccountNumber, String pin, int amount) {
        Account senderAcctNumberFound = findAccountNumber(senderAccountNumber);
        Account receiverAcctNumberFound = findAccountNumber(receiverAccountNumber);
        senderAcctNumberFound.withdraw(amount,pin);
        receiverAcctNumberFound.deposit(amount);
    }
}
