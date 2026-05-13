import java.util.Scanner;

public class searchArray {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            int target;
            System.out.println("Enter the number to search: ");
            target = scanner.nextInt();

            for (int i = 0; i < num.length; i++) {
                if (num[i] == target) {
                    System.out.println("Element found at index: " + i);
                    return;
                }

            }
            System.out.println("Element not found");

        }
        


    }

}
