//Write a program in Java to perform Linear Search
import java.util.Scanner;
public class twentyTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                found = true;
                System.out.println("Element " + target + " found at index: " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }
        sc.close();
    }
}
