// Write a program in Java to count the digits of a number
import java.util.Scanner;
public class sixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count its digits: ");
        String num = sc.next();
        int cnt = 0;
        for(char c: num.toCharArray()) {
            if(Character.isDigit(c)) {
                cnt++;
            }
        }

        System.out.println("Number of digits: " + cnt);
        sc.close();
    }
}
