// Create a Java
// class named
// MyPoint to
// represent a
// point in 2D
// space with
// x and
// y coordinates.The

// class should
// include the following:
// Two instance variables:
// x and y,
// both of type int..A default
// constructor that
// initializes the
// point to

// the origin (0, 0).
// . A method

// setXY(int x, int y) to update both coordinates.
// . A method getXY() that returns the x and y values as a two-element integer array.
// .

// A toString() method that returns the point in the format "(x, y)".
// . A method

// distance(int x, int y) that calculates and returns the distance from the current point to
// another point with the given coordinates.
// Also, write a test class named TestMyPoint to create instances of MyPoint and test all its public
// methods.

class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        return new int[] { x, y };
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
public class one {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        p1.setXY(3, 4);
        System.out.println("Point: " + p1.toString());
        System.out.println("Distance from origin: " + p1.distance(0, 0));
        
    }
}
