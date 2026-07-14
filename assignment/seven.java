
// Write a program in Java to format a string without using format() method
//TODO: iterate through the string and format it by adding spaces or other characters as needed.
import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to format: ");
        String input = sc.nextLine();
        String formatted = "";
        for (char c : input.toCharArray()) {

            formatted += c + " ";
        }
        System.out.println("Formatted string: " + formatted.trim());
        sc.close();
    }

}
