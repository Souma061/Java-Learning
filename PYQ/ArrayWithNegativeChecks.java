import java.util.Scanner;

class NegativeException extends Exception {
    private int negativeValue;
    private int position;

    // constructor with error message
    public NegativeException(String message) {
        super(message);
    }

    public NegativeException(String message, int negativeValue, int position) {
        super(message);
        this.negativeValue = negativeValue;
        this.position = position;
    }

    public int getNegativeValue() {
        return negativeValue;
    }

    public int getPosition() {
        return position;
    }

}

public class ArrayWithNegativeChecks {
    public static void fillArray(int[] arr, int[] values) throws NegativeException {
        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0) {
                throw new NegativeException(
                        "Negative value detected",
                        values[i],
                        i);
            }
            arr[i] = values[i];
        }
    }

    public static void displayArray(int[] arr) {
        System.out.println("Array contents:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", "); // Print comma after each element except the last one
            }
        }
        System.out.println();

    }

    public static int[] createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] values = new int[size];
        System.out.println("Enter " + size + " integers (negative values will cause an exception): ");
        for (int i = 0; i < size; i++) {
            values[i] = sc.nextInt();
        }
        try {
            fillArray(arr, values);
            System.out.println("Array filled successfully.");
            return arr;
        } catch (NegativeException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Negative value: " + e.getNegativeValue() + " at position: " + e.getPosition());
            return null;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Create array with validation");
            System.out.println("2. Test with sample data");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int[] validArray = createArray();
                    if (validArray != null) {
                        displayArray(validArray);
                    }
                    break;
                case 2:
                    int[] sampleValues = { 10, -5, 20, 15 };
                    int[] sampleArray = new int[sampleValues.length];
                    try {
                        fillArray(sampleArray, sampleValues);
                        System.out.println("Sample array filled successfully.");
                        displayArray(sampleArray);
                    } catch (NegativeException e) {
                        System.out.println("Error: " + e.getMessage());
                        System.out.println(
                                "Negative value: " + e.getNegativeValue() + " at position: " + e.getPosition());
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
        sc.close();
    }

}
