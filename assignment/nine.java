//Write a program in Java to take a string and display the same with line feed, indentation
import java.util.Scanner;
public class nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Formatted string:");
        System.out.println("\t" + input.replaceAll(" ", "\n\t"));
        scanner.close();
    }
}
