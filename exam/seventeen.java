//Write a Java program that reads a list of integers from the user and throws an exception if any numbers
// are duplicates.
import java.util.*;

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}
public class seventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " integers: ");
        try {
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        throw new DuplicateNumberException("Duplicate number found: " + arr[i]);
                    }
                }
            }
        } catch (DuplicateNumberException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }

    }
}
