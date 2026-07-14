
//Write a program in Java to accept 3 numbers and display the total
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int total = a + b + c;
        System.out.println("The total is: " + total);
        sc.close();
    }
}
