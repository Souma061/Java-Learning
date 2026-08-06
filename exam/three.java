// interface Animal {
//     void sound();
// }

// class Dog implements Animal {
//     @Override
//     public void sound() {
//         System.out.println("Dog barks");
//     }
// }
// public class three {
//     public static void main(String[] args) {
//         Animal dog = new Dog();
//         dog.sound(); // Output: Dog barks
//     }
// }


// interface is a reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors. They are used to achieve abstraction and multiple inheritance in Java. A class can implement multiple interfaces, allowing for a more flexible design.



interface Resizable {
    void resize(double factor);
}

class Rectangle implements Resizable {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public void resize(double factor) {
        length *= factor;
        width *= factor;
    }

    void display() {
        System.out.println("Length: " + length + ", Width: " + width);
    }
}



public class three {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.display(); // Output: Length: 4.0, Width: 6.0
        rectangle.resize(2); // Resize the rectangle by a factor of 2
        rectangle.display(); // Output: Length: 8.0, Width: 12.0
    }
}
