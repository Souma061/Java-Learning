import java.util.Scanner;
public class vowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vowels = { "A", "E", "I", "O", "U", "a", "e", "i", "o", "u" };
        String[] consonants = { "B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W",
                "X", "Y", "Z", "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t",
                "v", "w", "x", "y", "z" };

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        boolean isVowel = false;
        boolean isConsonant = false;
        for (String vowel : vowels) { // it is used to check whether the input character is a vowel or not by comparing it with each element in the vowels array
            if (vowel.charAt(0) == ch) {
                isVowel = true;
                break;
            }
        }
        for (String consonant : consonants) { // same as above vowel checking
            if (consonant.charAt(0) == ch) {
                isConsonant = true;
                break;
            }
        }
        if (isVowel) {
            System.out.println(ch + " is a vowel.");
        } else if (isConsonant) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println(ch + " is not a valid alphabet.");
        }

        sc.close();
    }
}
