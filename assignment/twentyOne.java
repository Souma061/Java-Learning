import java.util.Scanner;

public class twentyOne {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms for Fibonacci series: ");
        double num = sc.nextDouble();
        System.out.println("Fibonacci series up to " + num + " terms:");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }
}
