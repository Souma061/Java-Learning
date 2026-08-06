/*
Write a program in Java to create a base class 'Square' having instance variable 'side : double'. Initiate
variable using constructor, a method 'getVolume() : double' that calculates volume and print it.
Create a derived class 'Cylinder' having instance variable 'height : double'. Initiate variables of
both classes through constructor, override method 'getVolume() : double' to calculate volume of
cylinder taking 'side' variable of base class as 'radius' and print it.
 */
import java.util.Scanner;

class Square {
    double side;

    Square(double side) {
        this.side = side;
    }

    double getVolume() {
        return side * side * side;
    }
}

class Cylinder extends Square {
    double height;

    Cylinder(double side, double height) {
        super(side);
        this.height = height;
    }
    @Override
    double getVolume() {
        return Math.PI * side * side * height;
    }
}

public class thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        double side = sc.nextDouble();
        Square square = new Square(side);
        System.out.println("Volume of the square: " + square.getVolume());
        System.out.println("Enter the height of the cylinder: ");
        double height = sc.nextDouble();
        Cylinder cylinder = new Cylinder(side, height);
        System.out.println("Volume of the cylinder: " + cylinder.getVolume());
        sc.close();
    }
}
