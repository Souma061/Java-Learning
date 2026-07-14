
//Write a program in Java to check a number integer or not
import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = sc.nextDouble();
        if (num == (int) num) {
            System.out.println(num + " is an integer.");
        } else {
            System.out.println(num + " is not an integer.");
        }
        sc.close();
    }
}
