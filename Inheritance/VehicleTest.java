// Base class
class Vehicle {
    private int speed;
    private double fuelLevel;

    public Vehicle(int speed, double fuelLevel) {
        this.speed = speed;
        this.fuelLevel = fuelLevel;
    }

    public void start() {
        System.out.println("Vehicle Start");
    }

    public void stop() {
        System.out.println("Vehicle Stop");
    }

    public int getSpeed() {
        return speed;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }
}

// Subclass: Car
class Car extends Vehicle {
    public Car(int speed, double fuelLevel) {
        super(speed, fuelLevel);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Car is starting with speed: " + getSpeed() + " km/h and fuel: " + getFuelLevel() + " L");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped.");
    }

    public void openTrunk() {
        System.out.println("Trunk opened.");
    }
}

// Subclass: Bike
class Bike extends Vehicle {
    public Bike(int speed, double fuelLevel) {
        super(speed, fuelLevel);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Bike is starting with speed: " + getSpeed() + " km/h and fuel: " + getFuelLevel() + " L");
    }

    @Override
    public void stop() {
        System.out.println("Bike has stopped.");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Car(80, 10.5);
        Vehicle v2 = new Bike(60, 5.0);

        v1.start();
        v1.stop();

        v2.start();
        v2.stop();

        // downcasting
        if (v1 instanceof Car) {
            ((Car) v1).openTrunk();
        }
    }
}

