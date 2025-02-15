class Vehicle {
    public void startEngine() {
        System.out.println("Starting the vehicle engine.");
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started with a key turn.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with a button press.");
    }
}

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
