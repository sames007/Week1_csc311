package org.example;

public class Car extends Vehicle {
    // Attribute
    private String brand;

    // Costructor
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        // call the superclass constructor
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    // Getters and Setters for Brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Honk method
    public void honk() {
        System.out.println("Honk, honk!");
    }

    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine Size: " + getEngineSize());
        System.out.println("Fuel Type: " + getFuelType());

    }

}
