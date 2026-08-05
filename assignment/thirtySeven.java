// Write a program in Java to implement Method Overriding using Inheritance

public class thirtySeven {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog(); // upcasting - reference type Animal, object type Dog
        Animal c = new Cat();

        a.sound();
        d.sound();
        c.sound();
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
        System.out.println("Dog barks: Woof Woof");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows: Meow Meow");
    }
}
