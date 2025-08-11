import java.util.*;

// Base class: Account
class Account {
    private String accountHolder;
    private double balance;
    private List<String> transactionHistory;

    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        addTransaction("Account opened with balance: " + initialBalance);
    }

    public void deposit(double amount, String accountType) {
        if (amount > 0) {
            balance += amount;
            addTransaction(accountType + " - Deposited: " + amount);
            System.out.println("Deposit successful in " + accountType + "! New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive in " + accountType + "!");
        }
    }

    public void withdraw(double amount, String accountType) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            addTransaction(accountType + " - Withdrawn: " + amount);
            System.out.println("Withdrawal successful from " + accountType + "! New Balance: " + balance);
        } else {
            System.out.println("Invalid withdraw amount from " + accountType + "!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactionHistory(String accountType) {
    System.out.println("\nTransaction History for " + accountHolder + " (" + accountType + "):");
    for (String transaction : transactionHistory) {
        System.out.println(transaction);
    }
    // Added line to show actual balance after history
    System.out.println("Current Balance in " + accountType + ": " + balance);
    }

    protected void addTransaction(String detail) {
        transactionHistory.add(detail);
    }
}
