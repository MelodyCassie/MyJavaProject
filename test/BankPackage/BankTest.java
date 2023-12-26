package BankPackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest{
    Bank myBank;
    @BeforeEach
    void setUp (){
        myBank = new Bank("Gt bank");
    }
    @Test
    public void testThatBankCanCreateAccount(){
        myBank.createAccount("FirstName","LastName","Pin");
        assertEquals(1, myBank.getNumberOfAccountCreated() );
    }

    @Test
    public void testThatBankCanDeposit(){
        myBank.createAccount("FirstName","LastName","Pin");
        myBank.deposit(1,1000);

        assertEquals(1000, myBank.checkBalance(1,"Pin"));

    }
    @Test
    public void testThatBankCanDeposit_Twice(){
        myBank.createAccount("FirstName","LastName","Pin");
        myBank.deposit(1,2000);
        myBank.deposit(1,2000);
        assertEquals(4000,myBank.checkBalance(1,"Pin"));

    }
    @Test
    public void testThatBankCanWithdraw(){
        myBank.createAccount("FirstName", "LastName", "Pin");
        myBank.deposit(1,5000);
        myBank.withdraw(1,2000);
        assertEquals(3000, myBank.checkBalance(1,"Pin"));
    }
    @Test
    public void testThatBankCanRemoveAccount(){
        myBank.createAccount("FirstName", "LastName", "Pin");
        myBank.removeAccount(1,"Pin");
        assertEquals(0,myBank.getNumberOfAccountCreated() );
    }
    @Test
    public void testThatBankCanTransfer(){
        myBank.createAccount("FirstName", "LastName", "Pin");
        myBank.createAccount("FirstName", "LastName", "Pin2");
        myBank.deposit(1,5000);
        myBank.transfer(1,2,"Pin",3000);
        assertEquals(3000,myBank.checkBalance(2,"Pin2"));

    }
}