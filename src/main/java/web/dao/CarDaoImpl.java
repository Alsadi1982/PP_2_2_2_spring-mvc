package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> cars = new ArrayList<>();

    /**
     * Method CarDaoImpl#initListOfCars() fills the list of cars with values
     */
    private void initListOfCars() {
        Car car1 = new Car("Lada", "black", 123);
        Car car2 = new Car("Volvo", "red", 456);
        Car car3 = new Car("Ford", "white", 789);
        Car car4 = new Car("Ferrari", "yellow", 777);
        Car car5 = new Car("Audy", "green", 999);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }

    @Override
    public List<Car> getListOfCars(int count) {
        initListOfCars();
        return count >= 5 ? cars.subList(0, 5) : cars.subList(0, count);
    }
}
