
//Write a program in Java to calculate sum of first N Even numbers
import java.util.Scanner;

public class eighteen {
    public static int sumOfEvenNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            //show all even numbers
            System.out.println("Even number " + i + ": " + (2 * i));
            sum += 2 * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number N to calculate the sum of first N even numbers: ");
        int n = sc.nextInt();
        int sum = sumOfEvenNumbers(n);
        System.out.println("Sum of first " + n + " even numbers is: " + sum);
        sc.close();
    }
}
