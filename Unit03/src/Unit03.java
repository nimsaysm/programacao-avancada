public class Unit03 {
    public static void main(String[] args) {
        System.out.println("Running Bank Account exercise...");

        Account checkingAccount = new Account();
        Account savingsAccount = new Account();

        System.out.println("Using checkingAccount...");
        System.out.println("Balance: $" + checkingAccount.getAccountBalance());

        System.out.println("Depositing $100...");
        checkingAccount.makeDeposit(100);
        System.out.println("Balance: $" + checkingAccount.getAccountBalance());

        System.out.println("Withdrawing $50...");
        checkingAccount.makeWithdrawal(50);
        System.out.println("Balance: $" + checkingAccount.getAccountBalance());


        System.out.println("Using savingsAccount...");
        System.out.println("Balance: $" + savingsAccount.getAccountBalance());

        System.out.println("Depositing $500...");
        savingsAccount.makeDeposit(500);
        System.out.println("Balance: $" + savingsAccount.getAccountBalance());

        System.out.println("Withdrawing $100...");
        savingsAccount.makeWithdrawal(100);
        System.out.println("Balance: $" + savingsAccount.getAccountBalance());
    }
}

