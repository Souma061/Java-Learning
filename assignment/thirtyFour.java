//Write a program in Java to implement Single Inheritance

public class thirtyFour {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }

}
