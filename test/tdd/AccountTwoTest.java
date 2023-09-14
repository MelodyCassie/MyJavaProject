package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTwoTest {

    @Test
    public void testThatDepositWorks() {
        AccountTwo myAccount = new AccountTwo();
        myAccount.deposit(100000);
        assertEquals(100000,myAccount.getBalance());
    }

    @Test
    public void testThatWithdrawWorks(){
        AccountTwo myAccount = new AccountTwo();
        myAccount.deposit(10_0_0_0_0);
        myAccount.withdraw(60_0_0_0);
        assertEquals(40_0_0_0,myAccount.getBalance());
    }
    @Test
    public void testThatTransferWorks(){
        AccountTwo myAccount = new AccountTwo();
        myAccount.deposit(500000);
        myAccount.transfer(1000000);
        assertEquals(1500000,myAccount.getBalance());
    }

    @Test
    public void testAllThreeMethodsWorking() {
        AccountTwo myAccount = new AccountTwo();
        myAccount.deposit(200000);
        myAccount.transfer(50000);
        myAccount.withdraw(100000);
        assertEquals(150000,myAccount.getBalance());
    }

}