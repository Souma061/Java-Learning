import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (1 for Celsius to Fahrenheit, 2 for Fahrenheit to Celsius): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheitInput = scanner.nextDouble();
                double celsiusOutput = (fahrenheitInput - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + celsiusOutput);
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }
        scanner.close();
    }
}
