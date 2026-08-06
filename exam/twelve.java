// /Write a Java program to find the longest consecutive elements sequence from a given unsorted array
// of integers and display it with its length.
import java.util.*;


public class twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //sort the array
        Arrays.sort(arr);
        int maxLength = 1;
        int currentLength = 1;
        int start = 0;
        int maxStart = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                currentLength++;
            } else if (arr[i] != arr[i - 1]) {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxStart = start;
                }
                currentLength = 1;
                start = i;
            }
        }
        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxStart = start;
        }
        System.out.println("The longest consecutive elements sequence is: ");
        for (int i = maxStart; i < maxStart + maxLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nLength of the longest consecutive elements sequence is: " + maxLength);
        sc.close();
    }
}
/*
 * dry run:
 * Input: [1,67,34,2,3,4,5,76,6,78]
 * Output: The longest consecutive elements sequence is: 1 2 3 4 5 6
 * Length of the longest consecutive elements sequence is: 6
 *
 * step 1: The user is prompted to enter the size of the array, which is stored in variable n.
 * step 2: An integer array arr of size n is created to store the elements of the array.
 * step 3: The user is prompted to enter the elements of the array, which are stored in the arr array.
 * step 4: The arr array is sorted in ascending order using the Arrays.sort() method.
 * step 5: The variables maxLength, currentLength, start, and maxStart are initialized to keep track of the longest consecutive elements sequence.
 * step 6: A for loop is used to iterate through the sorted arr array starting from index 1.
 * step 7: Inside the loop, if the current element is equal to the previous element plus 1, the currentLength is incremented.
 * step 8: If the current element is not equal to the previous element, the currentLength is compared with maxLength. If currentLength is greater, maxLength and maxStart are updated. Then, currentLength is reset to 1 and start is updated to the current index.
 * step 9: After the loop, a final check is performed to see if the last sequence is the longest. If so, maxLength and maxStart are updated accordingly.
 * step 10: The longest consecutive elements sequence is printed by iterating from maxStart to maxStart + maxLength and printing each element.
 * step 11: The length of the longest consecutive elements sequence is printed.
 * step 12: The scanner is closed to prevent resource leaks.

 */
