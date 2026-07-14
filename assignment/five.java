// Write a program in Java to convert a string into lowercase without using toLowerCase() method

// TODO: just iterate through strings and convert each character to lowercase by checking if it is uppercase and then adding 32 to its ASCII value.
import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        String lowercase = "";
        for (char c : input.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                lowercase += (char) (c + 32);
            } else {
                lowercase += c;
            }
        }
        System.out.println("Lowercase string: " + lowercase);
        sc.close();
    }
}
