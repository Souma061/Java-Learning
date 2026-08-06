/*
Design a Java program to simulate a vehicle engine system. The engine should have two attributes :
speed (of type int) and gear (of type int). Define an interface containing the following methods :
· speedUp(int value) - to increase the engine speed
. changeGear(int value) - to change the gear of the vehicle. Also ensure that gear value must be
between 1 to 6.
Create a class that implements the interface and provides proper definitions for both methods. */


interface Engine {
    void speedUp(int value);

    void changeGear(int value);
}

class Vehicle implements Engine {
    private int speed;
    private int gear;

    public Vehicle() {
        this.speed = 0;
        this.gear = 1;
    }
    @Override
    public void speedUp(int value) {
        speed += value;
        System.out.println("Speed increased to: " + speed);
    }
    @Override
    public void changeGear(int value) {
        if (value >= 1 && value <= 6) {
            gear = value;
            System.out.println("Gear changed to: " + gear);
        } else {
            System.out.println("Invalid gear value. Gear must be between 1 and 6.");
        }
    }

    public void display() {
        System.out.println("Current Speed: " + speed);
        System.out.println("Current Gear: " + gear);
    }

}
public class twenty {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.speedUp(30);
        vehicle.changeGear(3);
        vehicle.display();
        vehicle.speedUp(20);
        vehicle.changeGear(5);
        vehicle.display();
        vehicle.changeGear(7); // Invalid gear change
    }
}
