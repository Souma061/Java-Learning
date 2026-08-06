/*
    . Write a Java program to create a base class called "vehicle" that stores number of wheels and speed.
Create the following derived classes :
"car" that inherits "vehicle" and also stores number of passengers.
"truck" that inherits "vehicle" and also stores the load limit. Write a main function to create objects
of these two derived classes and display all the information about "car" and "truck". Also compare
the speed of these two vehicles - car and truck and display which one is faster.
 */
class Vehicle {
    protected int numberOfWheels;
    protected int speed;

    Vehicle(int numberOfWheels, int speed) {
        this.numberOfWheels = numberOfWheels;
        this.speed = speed;
    }

    void display() {
        System.out.println("Number of Wheels: " + numberOfWheels);
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    private int numberOfPassengers;

    Car(int numberOfWheels, int speed, int numberOfPassengers) {
        super(numberOfWheels, speed);
        this.numberOfPassengers = numberOfPassengers;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Number of Passengers: " + numberOfPassengers);
    }
}

class Truck extends Vehicle {
    private int loadLimit;

    Truck(int numberOfWheels, int speed, int loadLimit) {
        super(numberOfWheels, speed);
        this.loadLimit = loadLimit;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Load Limit: " + loadLimit);
    }
}

public class twentySeven {
    public static void main(String[] args) {
        Car car = new Car(4, 120, 5);
        Truck truck = new Truck(6, 80, 10000);

        System.out.println("Car Information:");
        car.display();

        System.out.println("\nTruck Information:");
        truck.display();

        if (car.speed > truck.speed) {
            System.out.println("\nThe car is faster than the truck.");
        } else if (car.speed < truck.speed) {
            System.out.println("\nThe truck is faster than the car.");
        } else {
            System.out.println("\nBoth vehicles have the same speed.");
        }
    }
}
