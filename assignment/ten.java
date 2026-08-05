// Write a program in Java for a calculator using switch-case
import java.util.Scanner;
public class ten {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double divide(int a, int b) {
        return (double) a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ten calculator = new ten();
        while (true) {
            System.out.println("Select operation: 1. Add 2. Subtract 3. Multiply 4. Divide 5. Exit");
            int choice = sc.nextInt();
            if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }
            System.out.println("Enter first number:");
            int num1 = sc.nextInt();
            System.out.println("Enter second number:");
            int num2 = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Result: " + calculator.add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + calculator.subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + calculator.multiply(num1, num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Result: " + calculator.divide(num1, num2));
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
