package repository;

import entity.Bike;
import entity.Car;

public interface IVehicle {
    void addNewCar(Car car);
    void addNewBike(Bike bike);
    void countTotalVehicles();
    void countAllBikes();
    void countAllCars();

}
