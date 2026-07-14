// Write a program in Java to replace all spaces with underscore in a string without using replace() method

//TODO: just iterate through strings and replace each space with underscore.
import java.util.Scanner;
public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with spaces: ");
        String input = sc.nextLine();
        String replaced = "";
        for (char c : input.toCharArray()) {
            if (c == ' ') {
                replaced += '_';
            } else {
                replaced += c;
            }
        }
        System.out.println("String with spaces replaced: " + replaced);
        sc.close();
    }
}
