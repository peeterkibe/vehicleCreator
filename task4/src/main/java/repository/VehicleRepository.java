package repository;

import entity.Bike;
import entity.Car;
import entity.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepository implements IVehicle{
    private static List<Car> carsList;
    private static List<Bike> bikeList;
    private static VehicleRepository instance;

    private VehicleRepository() {
        carsList = new ArrayList<>();
        bikeList = new ArrayList<>();
    }

    public static VehicleRepository getInstance(){
        if (null == instance){
            instance = new VehicleRepository();
        }
        return instance;
    }

    @Override
    public void addNewCar(Car car) {
        carsList.add(car);
    }

    @Override
    public void addNewBike(Bike bike) {
        bikeList.add(bike);
    }

    @Override
    public void countTotalVehicles() {
        System.out.printf("Total number of vehicles: %d\n", bikeList.size() + carsList.size());
    }

    @Override
    public void countAllBikes() {
        System.out.printf("Number of bikes: %d\n", bikeList.size());
    }

    @Override
    public void countAllCars() {
        System.out.printf("Number of cars: %d\n", carsList.size());
    }
}
