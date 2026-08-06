// Write a program that:

// Reads an integer from the user.If the number is negative,throw an exception with the message:

import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String msg) {
        super(msg);
    }
}

public class six {

    static int readInteger() throws NegativeNumberException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if (num < 0) {
            throw new NegativeNumberException("Number cannot be negative");
        }
        // sc.close();
        return num;
    }
    public static void main(String[] args) {
        try {
            int num = six.readInteger();
            System.out.println("You entered: " + num);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
