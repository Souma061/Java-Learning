
/*
    Write a Java program to find the length of the longest substring without repeating characters, in a given
string.
 */
import java.util.Arrays;

public class Substring {
    public int longetRepetationSubstring(String s) {
        int n = s.length();
        int maxLen = 0;

        // iterate through all starting points of the substring
        for (int i = 0; i < n; i++) {
            int[] hash = new int[256]; // to store the count of characters
            Arrays.fill(hash, 0);
            for (int j = i; j < n; j++) {
                if (hash[s.charAt(j)] == 1) {
                    break;
                }
                hash[s.charAt(j)] = 1; // mark the character as seen

                int len = j - i + 1; // calculate the length of the current substring
                maxLen = Math.max(maxLen, len); // update the maximum length
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Substring obj = new Substring();
        String s = "cadbzabcd";
        int result = obj.longetRepetationSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}
