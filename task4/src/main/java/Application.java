import entity.Bike;
import entity.Car;
import enums.Shape;
import enums.Transmission;
import repository.VehicleRepository;

public class Application {
    public static void main(String[] args) {
        VehicleRepository instance = VehicleRepository.getInstance();
        instance.countTotalVehicles();
        Car car = new Car("BMW", "m3", 25000D, 210, Transmission.AUTOMATIC, Shape.SEDAN );
        instance.addNewCar(car);
        instance.countTotalVehicles();
        Bike bike = new Bike("Yamaha", "R1", 19000D, 240);
        instance.addNewBike(bike);
        instance.countAllBikes();
        instance.countAllCars();
        instance.countTotalVehicles();

    }
}
