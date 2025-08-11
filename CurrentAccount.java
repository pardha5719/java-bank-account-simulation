// CurrentAccount inherits from Account
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountHolder, double initialBalance, double overdraftLimit) {
        super(accountHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount, String accountType) {
        if (getBalance() - amount >= -overdraftLimit) {
            super.withdraw(amount, accountType);
        } else {
            System.out.println("Overdraft limit exceeded for " + accountType + "!");
        }
    }
}