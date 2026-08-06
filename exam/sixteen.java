/*
    Write a Java program to calculate area of Triangle using class TriangleArea with the following methods :
(a) Initialize the base and height of a triangle using constructor
(b) Give method to calculate area() using base and height
(c) Give method to print the triangle details, i.e., its base, height and area.
 */

class TriangularArea {
    private double base;
    private double height;

    public TriangularArea(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }

    public void display() {
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area());
    }
}

public class sixteen {
    public static void main(String[] args) {
        TriangularArea triangle = new TriangularArea(21, 12);
        triangle.display();
    }
}
