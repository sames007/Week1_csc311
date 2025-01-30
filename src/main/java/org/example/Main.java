package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Creating a Vehicle object
        Vehicle vehicle = new Vehicle(4, "Blue", 3.5f, "Gasoline");
        System.out.println("Vehicle Info:");
        System.out.println("Number of Wheels: " + vehicle.getNumberOfWheels());
        System.out.println("Color: " + vehicle.getColor());
        System.out.println("Engine Size: " + vehicle.getEngineSize());
        System.out.println("Fuel Type: " + vehicle.getFuelType());
        System.out.println();

        // Creating a Car object
        Car myCar = new Car(4, "Green", 4.6f, "Gasoline", "Honda");
        myCar.displayInfo();
        myCar.honk();

    }
}