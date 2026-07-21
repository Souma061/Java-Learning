// Write a program in Java to show the greatest number among three using nested if
import java.util.Scanner;

public class twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        if (a >= b) {
            if (a >= c) {
                System.out.println("The greatest number is: " + a);
            } else {
                System.out.println("The greatest number is: " + c);
            }
        } else {
            if (b >= c) {
                System.out.println("The greatest number is: " + b);
            } else {
                System.out.println("The greatest number is: " + c);
            }
        }
        sc.close();
    }
}
