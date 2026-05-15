class Vehicle {
    void start() {
        System.out.println("Starting a generic vehicle...");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car engine started...");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike engine started...");
    }
}

public class DMD {
    public static void main(String[] args) {

        Vehicle v;   // Parent reference eita

        v = new Car();   // Car object  
        v.start();       // Car method run korbe eine

        v = new Bike();  // Bike object
        v.start();       // Bike method run korbe eikhane
    }
}