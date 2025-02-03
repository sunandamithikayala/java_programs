// Base class Vehicle
class Vehicle {
    public void startEngine() {
        System.out.println("The vehicle's engine is starting...");
    }
}

// Derived class Car
class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The car's engine starts with a key ignition or push button.");
    }
}

// Derived class Motorcycle
class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The motorcycle's engine starts with a kick or electric start button.");
    }
}

// Method to demonstrate polymorphism
public class VehicleTest {
    public static void vehicleTestDrive(Vehicle vehicle) {
        vehicle.startEngine();
    }

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        
        System.out.println("Car Test Drive:");
        vehicleTestDrive(car);
        
        System.out.println("\nMotorcycle Test Drive:");
        vehicleTestDrive(motorcycle);
    }
}
