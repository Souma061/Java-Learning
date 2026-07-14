
// Write a program in Java to check a number integer or not using hasNextInt()
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println(num + " is an integer.");
        } else {
            System.out.println("The input is not an integer.");
        }
        sc.close();
    }
}
