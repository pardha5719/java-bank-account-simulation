// File: BankAccountSimulation.java

import java.util.*;

// Test the functionality
public class BankAccountSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingsAccount savings = new SavingsAccount("Rahul", 10000, 2000);
        CurrentAccount current = new CurrentAccount("Anita", 5000, 5000);

        while (true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit (Savings)");
            System.out.println("2. Withdraw (Savings)");
            System.out.println("3. Deposit (Current)");
            System.out.println("4. Withdraw (Current)");
            System.out.println("5. Show Savings History");
            System.out.println("6. Show Current History");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    savings.deposit(sc.nextDouble(), "Savings Account");
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    savings.withdraw(sc.nextDouble(), "Savings Account");
                    break;
                case 3:
                    System.out.print("Enter amount: ");
                    current.deposit(sc.nextDouble(), "Current Account");
                    break;
                case 4:
                    System.out.print("Enter amount: ");
                    current.withdraw(sc.nextDouble(), "Current Account");
                    break;
                case 5:
                    savings.printTransactionHistory("Savings Account");
                    break;
                case 6:
                    current.printTransactionHistory("Current Account");
                    break;
                case 7:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}