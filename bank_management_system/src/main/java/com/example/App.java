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
    private static void saveAcccountInFile(List<BankAccount> accounts) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("accounts.txt"))) {
            for (BankAccount account : accounts) {
                writer.println(
                        account.getAccountNumber() + "," + account.getAccountHolderName() + "," + account.getBalance());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<BankAccount> loadAccountsFromFile() {
        List<BankAccount> accounts = new ArrayList<>();
        File file = new File("accounts.txt");
        if (!file.exists())
            return accounts;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                accounts.add(new BankAccount(parts[0], parts[1], Double.parseDouble(parts[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BankAccount> accounts = loadAccountsFromFile();

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
                    saveAcccountInFile(accounts);
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
                        saveAcccountInFile(accounts);
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
                        saveAcccountInFile(accounts);
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

    static class BankAccount {
        private String accountNumber;
        private String accountHolderName;
        private double balance;

        public BankAccount(String accountNumber, String accountHolderName, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public String getAccountHolderName() {
            return accountHolderName;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposit successful. New balance: " + balance);
            } else {
                System.out.println("Invalid amount. Deposit failed.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful. New balance: " + balance);
            } else {
                System.out.println("Invalid amount or insufficient funds. Withdrawal failed.");
            }
        }
    }

    public void deleteAccount(List<BankAccount> accounts, String accountNumber) {
        BankAccount accountToDelete = findAccount(accounts, accountNumber);
        if (accountToDelete != null) {
            accounts.remove(accountToDelete);
            saveAcccountInFile(accounts);
            System.out.println("Account deleted successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    private static BankAccount findAccount(List<BankAccount> accounts, String accountNumber) {
        for (BankAccount a : accounts) {
            if (a.getAccountNumber().equals(accountNumber))
                return a;
        }
        return null;
    }



}
