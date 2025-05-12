// Exercise: Create Account Class that will manage the account balances. Must be possible to do withdrawal or deposits.
// Should has two objects: checkingAccount and savingsAccount.

public class Account {
    private double accountBalance;

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void makeWithdrawal(double value) {
        if (value > this.accountBalance) {
            System.out.println("error: could not withdrawal: does not have the requested value");
        } else {
            this.accountBalance -= value;
        }
    }

    public void makeDeposit(double value) {
        this.accountBalance += value;
    }
}