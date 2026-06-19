public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello World";

        // Method 1: Using StringBuilder
        String reversed1 = new StringBuilder(original).reverse().toString();
        System.out.println("Method 1 (StringBuilder): " + reversed1);

        // Method 2: Using char array
        String reversed2 = reverseWithCharArray(original);
        System.out.println("Method 2 (char array): " + reversed2);

        // Method 3: Using recursion
        String reversed3 = reverseWithRecursion(original);
        System.out.println("Method 3 (recursion): " + reversed3);
    }

    // Reverse using char array
    public static String reverseWithCharArray(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }

    // Reverse using recursion
    public static String reverseWithRecursion(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseWithRecursion(str.substring(1)) + str.charAt(0);
    }
}
