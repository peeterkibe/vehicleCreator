package entity;

public class Bike extends Vehicle{
    private int topSpeed;

    public Bike(String brand, String model, double price, int topSpeed) {
        super(brand, model, price);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
