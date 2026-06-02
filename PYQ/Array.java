// package PYQ;
/*
   Write a function in Java to remove duplicates from a sorted array in-place, and return the new length of
the array.
 */

import java.util.Arrays;
// import java.util.Scanner;

public class Array {
    // public static int removeDuplicate(int[] arr) {
    //     if (arr.length == 0)
    //         return 0;

    //     int j = 0; // index for the next unique element
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         if (arr[i] != arr[i + 1]) {
    //             arr[j++] = arr[i];

    //         }
    //     }
    //     arr[j++] = arr[arr.length - 1];
    //     return j;
    // }
    public static int removeDuplicate(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                arr[++j] = arr[i];
            }
        }
        return j + 1;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 5 };
        int newLength = removeDuplicate(arr);
        System.out.println("New length of the array: " + newLength);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, newLength)));
    }
}
