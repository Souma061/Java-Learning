/*
 * Build a Java program to manage student grades. Enable users to input student
 * information, assign grades,
 * and calculate average grades. Implement a class structure for students, and
 * create a menu system for
 * tasks like adding students, assigning grades, and displaying average grades.
 */

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private ArrayList<Double> grades;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void addGrade(double grade) {
        this.grades.add(grade);
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);

        if (grades.isEmpty()) {
            System.out.println("No grade assigned");
        } else {
            System.out.println("Grades: " + grades);
        }
    }

}

public class Students {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addStudent() {
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        students.add(new Student(id, name));
    }

    public static void assignGrade() {
        System.out.println("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Enter grade: ");
                double grade = sc.nextDouble();
                sc.nextLine();
                s.addGrade(grade);

                System.out.println("Grade assigned successfully.");
                return;
            }
        }
        System.err.println("Student not found.");
    }

    public static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                s.display();
            }
        }
    }

    public static void calculateAverage() {
        double total = 0;
        int count = 0;

        for (Student s : students) {
            for (double g : s.getGrades()) {
                total += g;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No grades added");
        } else {
            double average = total / count;
            System.out.println("Average Grade: " + average);
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Add Student");
            System.out.println("2. Assign Grade");
            System.out.println("3. Display Students");
            System.out.println("4. Calculate Average Grade");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            try {
                choice = Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    assignGrade();
                    break;
                case 3:
                    displayStudents();
                    break;
                case 4:
                    calculateAverage();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.err.println("Invalid choice. Please try again.");

            }
        } while (choice != 5);
        sc.close();
    }

}
