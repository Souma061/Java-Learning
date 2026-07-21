// Write a program in Java to implement Hierarchical Inheritance

public class thirtySix {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Cow cw = new Cow();

        d.eat();
        d.bark();

        c.eat();
        c.meow();

        cw.eat();
        cw.moo();
    }
}

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Dog, Cat, and Cow all inherit from the SAME superclass Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks: Woof Woof");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows: Meow Meow");
    }
}

class Cow extends Animal {
    void moo() {
        System.out.println("Cow moos: Moo Moo");
    }
}
