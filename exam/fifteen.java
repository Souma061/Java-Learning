/*
    Create an abstract class Vehicle with properties : vehicleNumber, vehicleName, and fuelType. It should
include an abstract method calculateRange() and a concrete method display() to show basic details.
Create two subclasses : Car and Motorcycle, each with fuelCapacity and mileage. Implement the
calculateRange() method using the formula :
Range=fuelCapacityxmileage
Override the display() method to include all details and the calculated range. Write a test class to
demonstrate the functionality of both classes.
 */

abstract class Vehicle {
    protected String vehicleNumber;
    protected String vehicleName;
    protected String fuelType;

    public Vehicle(String vehicleNumber, String vehicleName, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleName = vehicleName;
        this.fuelType = fuelType;
    }

    public abstract double calculateRange();

    void display() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Fuel Type: " + fuelType);
    }

}

class Car extends Vehicle {
    private double fuelCapacity;
    private double mileage;

    public Car(String vehicleNumber, String vehicleName, String fuelType, double fuelCapacity, double mileage) {
        super(vehicleNumber, vehicleName, fuelType);
        this.fuelCapacity = fuelCapacity;
        this.mileage = mileage;
    }

    @Override
    public double calculateRange() {
        return fuelCapacity * mileage;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Fuel Capacity: " + fuelCapacity);
        System.out.println("Mileage: " + mileage);
        System.out.println("Range: " + calculateRange());
    }
}

class Motorcycle extends Vehicle {
    private double fuelCapacity;
    private double mileage;

    public Motorcycle(String vehicleNumber, String vehicleName, String fuelType, double fuelCapacity, double mileage) {
        super(vehicleNumber, vehicleName, fuelType);
        this.fuelCapacity = fuelCapacity;
        this.mileage = mileage;
    }

    @Override
    public double calculateRange() {
        return fuelCapacity * mileage;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Fuel Capacity: " + fuelCapacity);
        System.out.println("Mileage: " + mileage);
        System.out.println("Range: " + calculateRange());
    }
}

public class fifteen {
    public static void main(String[] args) {
        Car car = new Car("123", "Car", "Petrol", 50, 20);
        Motorcycle motorcycle = new Motorcycle("456", "Motorcycle", "Diesel", 20, 30);

        car.display();
        System.out.println();
        motorcycle.display();
    }
}
