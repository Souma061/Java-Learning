
//Write a program in Java to perform Matrix Addition
import java.util.Scanner;

public class twentyThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the matrices: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns for the matrices: ");
        int cols = sc.nextInt();
        int[][] materix1 = new int[rows][cols];
        int[][] materix2 = new int[rows][cols];
        System.out.println("Enter the elements of the first matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                materix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                materix2[i][j] = sc.nextInt();
            }
        }
        int[][] sumMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = materix1[i][j] + materix2[i][j];
            }
        }
        System.out.println("The sum of the two matrices is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
