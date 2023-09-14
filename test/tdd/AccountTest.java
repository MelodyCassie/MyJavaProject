package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void depositTest(){
        //given that have an account
        Account yukoAccount = new Account();
        //when i deposit 5k
        yukoAccount.deposit(5000);
        //check that balance is 5k
        assertEquals(5000, yukoAccount.checkBalance());
    }

    @Test
    public void depositTwiceTest(){
        Account yukoAccount = new Account();
        yukoAccount.deposit(2000);
        yukoAccount.deposit(5000);
        assertEquals(7000, yukoAccount.checkBalance());
    }
    @Test
    public void withdrawTest(){
        Account yukoAccount = new Account();
        yukoAccount.deposit(2500);
        yukoAccount.withdraw(1000);
        assertEquals(1500, yukoAccount.checkBalance());
    }

@Test
public void withdrawTestTwo(){
        Account yukoAccount = new Account();
        yukoAccount.deposit(2500);
        yukoAccount.withdraw(3500);



}

}