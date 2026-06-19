import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // // int[] arr = { 1, 2, 4, 5, 6, 32, 23, 45, 67, 89 };
        // String[] arr = { "Hello", "World", "Java", "Programming" };
        // // for (int i = 0; i < arr.length; i++) {
        // //     System.out.print(arr[i] + " ");
        // // }

        // // Arrays.sort(arr);
        // Arrays.fill(arr, "Filled");
        // for (String element : arr) {
        //     System.out.print(element + " ");
        // }

        String[] arr;
        int size;
        System.out.println("Enter the size of the array: ");
        size = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        arr = new String[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a string: ");
            arr[i] = scanner.nextLine();

        }
        System.out.println("You entered: " + Arrays.toString(arr));
        scanner.close();

    }
}
