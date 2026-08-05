// Write a program in Java that accepts a square matrix and check whether the matrix is symmetric matrix
// or not.
// A square symmetric matrix is a square matrix that is equal to its transpose, i.e. A=AT
// Input : 123
//         245
//         356
// Output : Symmetric Matrix.

public class two {
    public static boolean isSymmetric(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        if (isSymmetric(matrix)) {
            System.out.println("Symmetric Matrix.");
        } else {
            System.out.println("Not a Symmetric Matrix.");
        }
    }
}
