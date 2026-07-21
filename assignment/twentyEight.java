
//Write a program in Java to implement custom classes
import java.util.ArrayList;
import java.util.List;

public class twentyEight {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Soumabrata", "AC101", 123.45);
        BankAccount acc2 = new BankAccount("John Doe", "AC102", 500.00);

        acc1.deposit(1500);
        acc1.withdraw(2000);
        acc2.withdraw(5000);
        acc2.deposit(1000);
        acc1.getAccountHolder();
        System.out.println("Account Holder: " + acc1.getAccountHolder());
        acc2.getBalance();
        System.out.println("Account Balance: " + acc2.getBalance());

    }

    static class BankAccount {
        private String accountHolder;
        private String accountNumber;
        private double balance;

        public BankAccount(String accountHolder, String accountNumber, double balance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Deposit amount must be positive.");
                return;
            }
            balance += amount;
            System.out.println("Deposited: " + amount);
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Withdrawal amount must be positive.");
                return;
            }
            if (amount > balance) {
                System.out.println("Insufficient funds.");
                return;
            }
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }

        public double getBalance() {
            return balance;
        }

        public String getAccountHolder() {
            return accountHolder;
        }

        @Override
        public String toString() {
            return "BankAccount{" +
                    "accountHolder='" + accountHolder + '\'' +
                    ", accountNumber='" + accountNumber + '\'' +
                    ", balance=" + balance +
                    '}';
        }
    }

    static class Bank {
        private String bankName;
        private List<BankAccount> accounts;

        public Bank(String bankName) {
            this.bankName = bankName;
            this.accounts = new ArrayList<>();
        }

        public void addAccount(BankAccount account) {
            accounts.add(account);
            System.out.println("Account added: " + account);
        }

        public void displayAccounts() {
            System.out.println("Accounts in " + bankName + ":");
            for (BankAccount account : accounts) {
                System.out.println(account);
            }
        }

        public void getTotalDeposits() {
            double totalDeposits = 0;
            for (BankAccount account : accounts) {
                totalDeposits += account.getBalance();
            }
            System.out.println("Total deposits in " + bankName + ": " + totalDeposits);
        }
    }
}
