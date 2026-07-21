// Write a program in Java to check a number is Armstrong Number or not
import java.util.Scanner;
public class seventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's an Armstrong Number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int digits = 0;
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }
        int sum = 0;
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        if(sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong Number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong Number.");
        }
        sc.close();
    }
}
