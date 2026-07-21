
//Write a program in Java to show number of days in a given month
import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year:");
        int year = sc.nextInt();

        System.out.println("Enter month number (1-12):");
        int month = sc.nextInt();

        int[] daysInMonth = { 31, (isLeapYear(year) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month < 1 || month > 12) {
            System.out.println("Invalid month number. Please enter a value between 1 and 12.");
        } else {
            System.out.println("Number of days in month " + month + " of year " + year + ": " + daysInMonth[month - 1]);
        }
        sc.close();

    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
