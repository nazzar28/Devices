package org.example;

public class Smartphone extends Device {
    private double screenSize;
    private double cameraResolution;

    public Smartphone(String name, double price, double weight, double screenSize, double cameraResolution) {
        super(DeviceType.SMARTPHONE, name, price, weight);
        this.screenSize = screenSize;
        this.cameraResolution = cameraResolution;
    }

    // Getters and setters

    @Override
    public String toString() {
        return super.toString() + ", Screen Size: " + screenSize + "\", Camera: " + cameraResolution + "MP";
    }
}

