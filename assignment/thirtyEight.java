// Write a program in Java to implement Method Overriding using super keyword

public class thirtyEight {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        super.sound(); // calls Animal's original sound() method first
        System.out.println("Dog barks: Woof Woof");
    }
}
