import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element for search: ");
        int val = sc.nextInt();
        int low = 0;
        int high = n - 1;
        int found = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == val) {
                found = mid;
                break;
            } else if (arr[mid] < val) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        if (found != -1) {
            System.out.println("Element found at iondex " + found);
        } else {
            System.out.println("Element not found");
        }


        // System.out.println("Array elements are: ");
        // for (int num : arr) {
        //     System.out.println(num + " ");
        // }
        sc.close();
    }
}
