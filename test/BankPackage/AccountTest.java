package BankPackage;

import BankPackage.exceptions.InvalidAmountError;
import BankPackage.exceptions.PinError;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    BankPackage.Account account ;

    @BeforeEach
    void setUp(){
        account = new BankPackage.Account("Name","Pin", 1);

    }
    @Test
    public void testThatAccountCanDeposit(){
        account.deposit(1000);
        assertEquals(1000,account.getBalance());
    }

    @Test
    public void testThatAccountCannotDepositAmountLessThanZero(){
        assertThrows(InvalidAmountError.class,()->account.deposit(-1000));
    }

    @Test
    public void tetThatAccountCanWithdraw(){
        account.deposit(5000);
        account.withdraw(2000,"Pin");
        assertEquals(3000,account.getBalance());
    }
    @Test
    public void testThatAccountCannotWithdrawAmountLessThanZero(){
        account.deposit(5000);

        assertThrows(InvalidAmountError.class, ()->account.withdraw(-2000, "Pin"));
    }

    @Test
    public void testThatAccountPinWillThrowErrorIfItsNotCorrect(){
        account.deposit(5000);
        assertThrows(PinError.class, ()->account.withdraw(2000, "1"));
    }



}