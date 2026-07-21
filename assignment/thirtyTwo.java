// Write a program in Java to show the use of Abstract Class

public class thirtyTwo {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        s1.display();
        s2.display();
    }
}

abstract class Shape {
    String color = "Unknown";

    // abstract method - no body, must be implemented by subclasses
    abstract double area();

    // regular (concrete) method - shared by all subclasses
    void display() {
        System.out.println("Shape: " + getClass().getSimpleName());
        System.out.println("Area: " + area());
        System.out.println("-----");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
