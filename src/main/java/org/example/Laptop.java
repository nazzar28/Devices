package org.example;

public class Laptop extends Device {
    private int ramSize;
    private String processorType;

    public Laptop(String name, double price, double weight, int ramSize, String processorType) {
        super(DeviceType.LAPTOP, name, price, weight);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    // Getters, setters, and other methods
}
