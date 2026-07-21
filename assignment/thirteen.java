
//Write a program in Java to accept marks of a student and display pass or fail
import java.util.Scanner;

public class thirteen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of the student: ");
        int marks = sc.nextInt();
        if (marks >= 0 && marks <= 35) {
            System.out.println("Fail");
        } else if (marks > 35 && marks <= 100) {
            System.out.println("Pass");
        } else {
            System.out.println("Invalid marks entered.");
        }
        sc.close();

    }
}
