// Write a program in Java to find double spaces in a string
import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter aa string with double spaces: ");
        String input = sc.nextLine();
        if(input.contains("  ")) {
            System.out.println("The string contains double spaces.");
        } else {
            System.out.println("The string does not contain double spaces.");
        }
        sc.close();
    }
}
