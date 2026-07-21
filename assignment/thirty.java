// Write a program in Java to show the use of Constructor

public class thirty {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.display();

        Person p2 = new Person("Soumabrata", 25);
        p2.display();

        Person p3 = new Person("John");
        p3.display();
    }

}

class Person {
    String name;
    int age;

    // default constructor
    Person() {
        this.name = "Rahul";
        this.age = 0;
    }

    // parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    // overloaded constructor
    Person(String name) {
        this.name = name;
        this.age = 12;
        System.out.println("Overloaded constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
