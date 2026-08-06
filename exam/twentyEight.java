/*
    Write a Java program to create an abstract class Accounts with the following details :
Data Members :
(a) Balance (b) accountNumber (c) accountHoldersName (d) address
Methods :
(a) Abstract method : withdraw()
(b) Abstract method : deposit()
(c) display() to show the balance of the account number
Create a subclass of this class SavingsAccount and add the following details :
Data Members :
(a) rateOfInterest
Methods :
(a) calculateAmount()
 */
abstract class Accounts {
    protected double balance;
    protected String accountNumber;
    protected String accountHoldersName;
    protected String address;

    Accounts(double balance, String accountNumber, String accountHoldersName, String address) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
    }

    abstract void withdraw(double amunt);

    abstract void deposit(double amount);

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder's Name: " + accountHoldersName);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    private double rateOfInterest;

    SavingsAccount(double balance, String accountNumber, String accountHoldersName, String address,
            double rateOfInterest) {
        super(balance, accountNumber, accountHoldersName, address);
        this.rateOfInterest = rateOfInterest;
    }

    void calculateAmount() {
        double interest = balance * rateOfInterest / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

}

public class twentyEight {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1000, "123456", "John Doe", "123 Main St", 5);
        sa.display();
        sa.deposit(500);
        sa.withdraw(200);
        sa.calculateAmount();
        sa.display();
    }
}
