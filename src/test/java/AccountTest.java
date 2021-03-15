
import static org.junit.jupiter.api.Assertions.*;
/**
 * Student Name: Anas Ali Deeb Banat
 * Student ID: 20172121
 * Software Testing
 * */
import com.anasbanat.Account;
import org.junit.jupiter.api.Test;
public class AccountTest {
    private final Account myAccount = new Account();
    @Test
    void testInitialBalance() {
        assertEquals(0, myAccount.initialBalance);
    }
    @Test
    void testBalanceWhenCreateAccount() {
        assertEquals(0, myAccount.getBalance());
    }
    @Test
    void testBalanceAfterMakeDeposit() {
        myAccount.makeDeposit(250);
        myAccount.makeDeposit(750);
        assertEquals(1000, myAccount.getBalance());
    }
    @Test
    void testBalanceAfterMakeWithdrawals() {
        myAccount.makeDeposit(250);
        myAccount.makeDeposit(200);
        myAccount.makeWithdrawal(50);
        myAccount.makeWithdrawal(100);
        assertEquals(300, myAccount.getBalance());
    }
    @Test
    void testDepositsSize() {
        myAccount.makeDeposit(50);
        myAccount.makeDeposit(100);
        myAccount.makeWithdrawal(50);
        assertEquals(2, myAccount.deposits.size());
    }
    @Test
    void testWithdrawalsSize() {
        myAccount.makeDeposit(50);
        myAccount.makeDeposit(100);
        myAccount.makeWithdrawal(50);
        assertEquals(2, myAccount.deposits.size());
    }
    @Test
    void testBalanceWhenEmpty() {
        myAccount.empty();
        assertEquals(0, myAccount.getBalance());
    }
    @Test
    void testDepositsWhenEmpty() {
        myAccount.empty();
        assertEquals(0, myAccount.deposits.size());
    }
    @Test
    void testWithdrawalsWhenEmpty() {
        myAccount.empty();
        assertEquals(0, myAccount.withdrawals.size());
    }

    /**
     * Student Name: Anas Ali Deeb Banat
     * Student ID: 20172121
     * Software Testing
     * */

}
