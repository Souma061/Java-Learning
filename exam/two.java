abstract class Shape {
    abstract void area();
}


class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}


class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
public class two {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.area(); // Calculate area of Circle

        Shape rectangle = new Rectangle(4, 6);
        rectangle.area(); // Calculate area of Rectangle
    }
}
