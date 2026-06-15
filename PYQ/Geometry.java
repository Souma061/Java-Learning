/*
    Design an interface called shape with methods draw() and getArea(). Further, design two classes
Circle and Rectangle that implements shape to compute area of respective shapes. Write a Java program
for the same.
 */

import java.util.Scanner;

interface Shape {
    void draw();

    double getArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
        System.out.println("  ◯");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with length: " + length + " and width: " + width);
        System.out.println("  ┌───────┐");
        System.out.println("  │       │");
        System.out.println("  │       │");
        System.out.println("  └───────┘");
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

public class Geometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a shape to draw and calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle:");
                double radius = sc.nextDouble();
                Circle circle = new Circle(radius);
                circle.draw();
                System.out.println("Area of the circle: " + circle.getArea());
                break;

            case 2:
                System.out.println("Enter the length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.println("Enter the width of the rectangle: ");
                double width = sc.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                rectangle.draw();
                System.out.println("Area of the rectangle: " + rectangle.getArea());
                break;

            default:
                System.out.println("Invalid choice!");

        }
        sc.close();
    }
}
