package entity;

import enums.Shape;
import enums.Transmission;

public class Car extends Vehicle {
    private int topSpeed;
    private Transmission transmission;
    private Shape shape;

    public Car(String brand, String model, double price, int topSpeed, Transmission transmission, Shape shape) {
        super(brand, model, price);
        this.topSpeed = topSpeed;
        this.transmission = transmission;
        this.shape = shape;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
