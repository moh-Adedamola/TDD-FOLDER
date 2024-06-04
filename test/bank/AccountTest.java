package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



class AccountTest {
    Account access;

    @BeforeEach
    void setUp() {
        access = new Account();
    }

    @Test
    public void testDeposit(){
        //GIVEN
//        Account access = new Account();
        //WHEN
        access.deposit(1_000);
        //CHECK OR ASSERT
        assertEquals(1_000, access.getBalance());
    }

    @Test
    public void testDoubleDeposit(){
        //GIVEN
//        Account access = new Account();
        //WHEN
        access.deposit(1_000);
        assertEquals(1_000, access.getBalance());
        access.deposit(1_000);
        //CHECK OR ASSERT
        assertEquals(2_000, access.getBalance());
    }

    @Test
    public void testCannotDepositNegativeAmount(){

//        Account access = new Account();

        access.deposit(-1_000);
        assertEquals(0, access.getBalance());
    }

    @Test
    public void testWithdrawal(){
        access.deposit(3_000);
        assertEquals(3_000, access.getBalance());

        access.withdraw(2_000);

    }

    @Test
    public void testDoubleWithdrawal(){
        access.deposit(2_000);
        assertEquals(2_000, access.getBalance());
        access.withdraw(1_000);
        assertEquals(1_000, access.getBalance());
        access.withdraw(1_000);
        assertEquals(0, access.getBalance());
    }
    @Test
    public void testCannotWithdrawNegativeAmount(){
        access.deposit(1_000);
        assertEquals(1_000, access.getBalance());
        access.withdraw(-1_000);
        assertEquals(1_000, access.getBalance());


    }




}