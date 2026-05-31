
// package PYQ;
/*
Write a Java program to transpose a matrix. Given an N×M matrix, the transpose of the matrix is
obtained by swapping the rows and columns.
 */
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter rows:");
        int rows = sc.nextInt();
        System.err.println("Enter columns:");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.err.println("Original Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.err.print(matrix[i][j] + " ");
            }
            System.err.println();
        }

        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.err.println("Transposed Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.err.print(transpose[i][j] + " ");
            }
            System.err.println();
        }
        sc.close();
    }

}
