//Write a Java method to count all words in a string and reverse every word and display them.

public class nine {
    public static void CountAndReverseWords(String str) {
        String[] words = str.split(" ");
        int wc = words.length;
        System.out.println("Total number of words: " + wc);
        System.out.println("Reversed words:");
        for (int i = 0; i < wc; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            System.out.print(sb.reverse().toString() + " ");
        }
    }
    public static void main(String[] args) {
        String string = "Hello World from Java";
        CountAndReverseWords(string);
    }
}
