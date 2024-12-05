package web.Dao;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao {
    private final List<Car> cars;

    public CarDaoImp() {
        cars = new ArrayList<>();
        cars.add(new Car("AMO", "F-15", 1925));
        cars.add(new Car("Teslo", "Meslo", 1988));
        cars.add(new Car("Chevy", "Suburban", 2006));
        cars.add(new Car("Honda", "Ponda", 2010));
        cars.add(new Car("Chevrolet", "Impala", 1968));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> returnCar(int quantity) {
        return cars.subList(0, Math.min(quantity, cars.size()));
    }
}
