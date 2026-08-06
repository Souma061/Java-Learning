//Write a program in Java to create your own exception as NegativeException whenever negative values are put in an array.
import java.util.Scanner;
class NegativeException extends Exception {
    NegativeException(String message) {
        super(message);
    }
}

public class ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        try {
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] < 0) {
                    throw new NegativeException("Negative values are not allowed: " + arr[i]);
                }
            }
        } catch (NegativeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
