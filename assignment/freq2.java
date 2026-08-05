
import java.util.Scanner;

public class freq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        int[] freq = new int[256];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            freq[c]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0 && (char) i != ' ') {
                System.out.println((char) i + ": " + freq[i]);
            }
        }
        sc.close();
    }
}
