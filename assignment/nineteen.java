// Write a program in Java to display multiplication table of a given number
import java.util.Scanner;

public class nineteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to display its multiplication table: ");
        int num = sc.nextInt();
        System.out.println("Multiplication table of " + num + ":");
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        sc.close();
    }
}
