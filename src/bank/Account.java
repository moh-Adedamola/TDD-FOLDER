package bank;

public class Account {

    private int balance;

    public void deposit(int amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (amount > 0) {
            balance -= amount;
        }
    }
}
