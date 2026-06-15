
/*
    Write a Java program to create a class 'Matrix' containing constructor that initializes the number of
rows and number of columns of a new Matrix object. Write a member function Sum() that prints the
sum of the elements of the matrix column wise.
 */
import java.util.Scanner;

class Matrix {
    private int rows;
    private int cols;
    private int[][] matrix;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols];
    }

    // input in the matrix
    public void inputMatrix(Scanner sc) {
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    // member function for print the sum of the elements of the matrix column wise
    public void Sum() {
        System.out.println("Sum of elements column wise:");
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }
            System.out.println("Sum of column " + j + ": " + sum);
        }
    }

    // member function for print the sum of the elements of the matrix row wise
    public void RowSum() {
        System.out.println("Sum of the elements row wise: ");
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Sum of row " + i + ": " + sum);
        }
    }


    // display
    public void displayMatrix() {
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class MatrixSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter the number of columns: ");
            int cols = sc.nextInt();

            Matrix m = new Matrix(rows, cols);
            m.inputMatrix(sc);
            m.displayMatrix();
            m.Sum();
            m.RowSum();
        }
    }

}
