/*
    Write a Java program to create a class point to represent a point in X-Y plane and add the method to
perform the foliowing tasks:
(a) Set the coordinate of a point using a constructor.
(b) Print the coordinate of a point.
(c) Print the quadrant number in which the point lies.
 */
import java.util.Scanner;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void printCoordinate() {
        System.out.println("Coordinate: (" + x + ", " + y + ")");
    }

    public void printQuadrant() {
        if (x > 0 && y > 0) {
            System.out.println("The point lies in Quadrant I.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point lies in Quadrant II.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point lies in Quadrant III.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point lies in Quadrant IV.");
        } else {
            System.out.println("The point lies on an axis.");
        }
    }
}
public class Coordinate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the x-coordinate: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the y-coordinate: ");
        double y = scanner.nextDouble();

        Point point = new Point(x, y);
        point.printCoordinate();
        point.printQuadrant();

        scanner.close();
    }
}
