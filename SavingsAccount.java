// SavingsAccount inherits from Account and overrides withdraw method
class SavingsAccount extends Account {
    private double minimumBalance;

    public SavingsAccount(String accountHolder, double initialBalance, double minimumBalance) {
        super(accountHolder, initialBalance);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void withdraw(double amount, String accountType) {
        if (getBalance() - amount >= minimumBalance) {
            super.withdraw(amount, accountType);
        } else {
            System.out.println("Withdrawal denied from " + accountType + "! Minimum balance requirement not met.");
        }
    }
}
