import java.util.Scanner;

public class seven {

    static void NumberPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome number.");
        } else {
            System.out.println(originalNum + " is not a palindrome number.");
        }
    }

    static void StringPalindrome(String str) {
        String originalString = str;
        String reverse = "";
        int n = str.length();
        for (int i = n - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (originalString.equals(reverse)) {
            System.out.println(originalString + " is a palindrome string.");
        } else {
            System.out.println(originalString + " is not a palindrome string.");
    }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();
        // seven.NumberPalindrome(num);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        seven.StringPalindrome(str);
        sc.close();
    }
}
