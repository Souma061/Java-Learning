
// Write a program in Java to make a character encrypted and decrypted again
import java.util.Scanner;

public class four {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String input = sc.nextLine();
        String encrypted = "";
        for (char c : input.toCharArray()) {
            encrypted += (char) (c + 3);
        }
        System.out.println("Encrypted character: " + encrypted);
        String decrypted = "";
        for (char c : encrypted.toCharArray()) {
            decrypted += (char) (c - 3);
        }
        System.out.println("Decrypted character: " + decrypted);
        sc.close();
    }

}
