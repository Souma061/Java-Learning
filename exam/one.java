class Animal {
    private int age;
    private String name;

    void eat() {
        System.out.println("Animal is eating");
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Dog extends Animal {

    Dog() {
        super(0, "Dog"); // Call the constructor of the Animal class
    }

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class one {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method from Animal class
        dog.bark(); // Method from Dog class
        // dog.age = 5; // Error: age has private access in Animal
        dog.setAge(5);
        System.out.println("Dog's age: " + dog.getAge());
    }
}
