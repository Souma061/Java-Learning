package com.example;

// CLI bank management system
// 1. Create a new account
// 2. Deposit money
// 3. Withdraw money
// 4. Check balance
// 5. Check complete account details
// 6. Delete account
// 7. Exit
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static void saveAccountsToFile(List<BankAccount> accounts) { // Save accounts to file
        try (PrintWriter writer = new PrintWriter(new FileWriter("accounts.txt"))) { // Try-with-resources to ensure the
                                                                                     // writer is closed
            for (BankAccount account : accounts) {
                writer.println(
                        account.getAccountNumber() + "," + account.getAccountHolderName() + "," + account.getBalance());
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle any IO exceptions that may occur
        }
    }

    private static List<BankAccount> loadAccountsFromFile() { // Load accounts from file
        List<BankAccount> accounts = new ArrayList<>(); // Initialize an empty list to hold the accounts
        File file = new File("accounts.txt"); // Create a File object for the accounts file
        if (!file.exists())
            return accounts;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) { // Try-with-resources to ensure the
                                                                                 // reader is closed
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                accounts.add(new BankAccount(parts[0], parts[1], Double.parseDouble(parts[2])));
            } // Read each line from the file, split it by commas, and create a BankAccount
              // object which is added to the accounts list
        } catch (IOException e) {
            e.printStackTrace(); // Handle any IO exceptions that may occur
        }
        return accounts; // Return the list of accounts loaded from the file
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BankAccount> accounts = loadAccountsFromFile(); // load existing accounts from file at the start of the
                                                             // program

        System.out.println("Welcome to the Bank Management System");
        while (true) {
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check balance");
            System.out.println("5. Check complete account details");
            System.out.println("6. Delete account");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = sc.nextLine();
                    System.out.print("Enter account holder name: ");
                    String accountHolderName = sc.nextLine();
                    System.out.print("Enter initial balance: ");
                    double initialBalance = sc.nextDouble();
                    sc.nextLine();
                    BankAccount newAccount = new BankAccount(accountNumber, accountHolderName, initialBalance);
                    accounts.add(newAccount);
                    saveAccountsToFile(accounts);
                    System.out.println("Account created successfully.");
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    String depositAccountNumber = sc.nextLine();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    sc.nextLine();
                    BankAccount depAcc = findAccount(accounts, depositAccountNumber);

                    if (depAcc != null) {
                        depAcc.deposit(depositAmount);
                        saveAccountsToFile(accounts);
                    } else {
                        System.out.println("Account not found.");
                    }

                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    String withdrawAccountNumber = sc.nextLine();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    sc.nextLine();
                    BankAccount wAcc = findAccount(accounts, withdrawAccountNumber);
                    if (wAcc != null) {
                        wAcc.withdraw(withdrawAmount);
                        saveAccountsToFile(accounts);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    String balanceAccountNumber = sc.nextLine();
                    BankAccount bAcc = findAccount(accounts, balanceAccountNumber);
                    if (bAcc != null)
                        System.out.println("Balance: " + bAcc.getBalance());
                    else
                        System.out.println("Account not found.");
                    break;

                case 5:
                    System.out.println("Check Complete Account Details");
                    System.out.print("Enter account number: ");
                    String detailsAccountNumber = sc.nextLine();
                    BankAccount dAcc = findAccount(accounts, detailsAccountNumber);
                    if (dAcc != null) {
                        System.out.println("Account Number: " + dAcc.getAccountNumber());
                        System.out.println("Account Holder Name: " + dAcc.getAccountHolderName());
                        System.out.println("Balance: " + dAcc.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 6:
                    System.out.print("Enter account number to delete: ");
                    String deleteAccountNumber = sc.nextLine();
                    new App().deleteAccount(accounts, deleteAccountNumber);
                    break;
                case 7:
                    System.out.println("Thank you for using the Bank Management System. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static class BankAccount { // BankAccount class to represent each account
        private String accountNumber;
        private String accountHolderName;
        private double balance;

        public BankAccount(String accountNumber, String accountHolderName, double balance) { // Constructor to
                                                                                             // initialize the account
                                                                                             // details
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }

        public String getAccountNumber() { // Getter for account number
            return accountNumber;
        }

        public String getAccountHolderName() { // Getter for account holder name
            return accountHolderName;
        }

        public double getBalance() { // Getter for balance
            return balance;
        }

        public void deposit(double amount) { // Method to deposit money into the account
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposit successful. New balance: " + balance);
            } else {
                System.out.println("Invalid amount. Deposit failed.");
            }
        }

        public void withdraw(double amount) { // Method to withdraw money from the account
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful. New balance: " + balance);
            } else {
                System.out.println("Invalid amount or insufficient funds. Withdrawal failed.");
            }
        }
    }

    public void deleteAccount(List<BankAccount> accounts, String accountNumber) { // Method to delete an account based
                                                                                  // on account number
        BankAccount accountToDelete = findAccount(accounts, accountNumber);
        if (accountToDelete != null) {
            accounts.remove(accountToDelete);
            saveAccountsToFile(accounts);
            System.out.println("Account deleted successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    private static BankAccount findAccount(List<BankAccount> accounts, String accountNumber) {
        // Helper method to find an account by account number
        for (BankAccount a : accounts) {
            if (a.getAccountNumber().equals(accountNumber))
                return a;
        }
        return null;
    }

}
