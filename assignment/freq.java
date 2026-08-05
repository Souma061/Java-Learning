import java.util.Scanner;

public class freq {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        int[] freq = new int[256];
        for (char c : input.toCharArray()) {
            freq[c]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0 && (char) i  != ' ') {
                System.out.println((char) i + ": " + freq[i]);
            }
        }
        sc.close();
    }
}
