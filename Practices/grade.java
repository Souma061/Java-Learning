// // Write a Java program to enter a grade by
// adding 8 to it. Display the corrected
// grade.
import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the grade: ");
        double grade = scanner.nextDouble();
        double correctedGrade = grade + 8; // Adding 8 to the grade
        System.out.println("Original Grade: " + grade);
        System.out.println("Corrected Grade: " + correctedGrade);
        scanner.close();
    }
}
