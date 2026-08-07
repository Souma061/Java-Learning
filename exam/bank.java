
/*
    Write a Java program that create a class Bank with the following menu :
(a) Display all account details
(b) Search by account number
(c) Deposit the amount
(d) Withdraw the amount
(e) Exit.
 */
import java.util.Scanner;

class Bank {
    private String accountNumber;
    private String accountHoldersName;
    private double balance;

    public Bank(String accountNumber, String accountHoldersName, double balance) {
        this.accountHoldersName = accountHoldersName;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHoldersName() {
        return accountHoldersName;
    }

    public double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder's Name: " + accountHoldersName);
        System.out.println("Balance: " + balance);
    }
}

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank[] accouns = new Bank[3];
        for (int i = 0; i < accouns.length; i++) {
            System.out.println("Enter account number for account " + (i + 1) + ": ");
            String accountNumber = sc.nextLine();
            System.out.println("Enter account holder's name for account " + (i + 1) + ": ");
            String accountHoldersName = sc.nextLine();
            System.out.println("Enter initial balance for account " + (i + 1) + ": ");
            double balance = sc.nextDouble();
            sc.nextLine(); // Consume newline
            accouns[i] = new Bank(accountNumber, accountHoldersName, balance);
        }
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display all account details");
            System.out.println("2. Search by account number");
            System.out.println("3. Deposit the amount");
            System.out.println("4. Withdraw the amount");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    for (Bank account : accouns) {
                        account.displayAccountDetails();
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Enter account number to search: ");
                    String searchAccountNumber = sc.nextLine();
                    boolean found = false;
                    for (Bank account : accouns) {
                        if (account.getAccountNumber().equals(searchAccountNumber)) {
                            account.displayAccountDetails();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number to deposit: ");
                    String depositAccountNumber = sc.nextLine();
                    found = false;
                    for (Bank account : accouns) {
                        if (account.getAccountNumber().equals(depositAccountNumber)) {
                            System.out.print("Enter amount to deposit: ");
                            double depositAmount = sc.nextDouble();
                            sc.nextLine(); // Consume newline
                            account.deposit(depositAmount);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number to withdraw: ");
                    String withdrawAccountNumber = sc.nextLine();
                    found = false;
                    for (Bank account : accouns) {
                        if (account.getAccountNumber().equals(withdrawAccountNumber)) {
                            System.out.print("Enter amount to withdraw: ");
                            double withdrawAmount = sc.nextDouble();
                            sc.nextLine(); // Consume newline
                            account.withdraw(withdrawAmount);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
