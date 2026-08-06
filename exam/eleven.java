// A
// class called Mypoint,
// which models a 2D
// point with
// x and
// y co-ordinates. It contains:(a)
// Two instance

// variables x(int)

// and y(int).
// (b) A default constructor that construct a point at the

// default location of (0, 0).
// (c) A overloaded constructor that construct a point with the given x and y co-ordinates.
// (d) A method getData() to take values of x and y from user.
// (e) A method called linesegment (MyPoint m, MyPoint n) that find out the gradient of the line segment
// and returns it from the function.
// Write the MyPoint class in Java and also write a class Gradient-check to test all the public methods
// defined in the class MyPoint.
import java.util.Scanner;

class MyPoint {
    private int x;
    private int y;

    // default contructor
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        this.x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        this.y = sc.nextInt();
        // sc.close();
    }

    public double linesegment(MyPoint m, MyPoint n) {
        if (m.x == n.x) {
            throw new ArithmeticException("Gradient is undefined for vertical line segments.");
        }
        double gradient = (double) (n.y - m.y) / (n.x - m.x);
        return gradient;
    }

}

public class eleven {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        p1.getData();
        MyPoint p2 = new MyPoint();
        p2.getData();
        double gradient = p1.linesegment(p1, p2);
        System.out.println("Gradient of the line segment: " + gradient);
    }
}
