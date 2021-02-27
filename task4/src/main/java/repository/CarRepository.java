package repository;

import entity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICar{
    private static List<Car> carsList;
    private static CarRepository instance;

    public static CarRepository getInstance(){
        if (null == instance){
            instance = new CarRepository();
        }
        return instance;
    }
    private CarRepository() {
        carsList = new ArrayList<>();

    }

    @Override
    public void addNewCar(Car car) {
        carsList.add(car);
    }

    @Override
    public void countCars() {
        System.out.printf("Number of cars: %d\n", carsList.size());
    }
}
