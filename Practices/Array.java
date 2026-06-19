public class Array {
    public static void main(String[] args) {
        String[][] array2d = {
                { "A", "B", "C" },
                { "D", "E", "F" },
                { "G", "H", "I" }
        };
        array2d[1][1] = "X"; // Modifying the element at row 1, column 1
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }
    }

}
