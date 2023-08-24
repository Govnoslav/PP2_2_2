package web.services;


import org.springframework.stereotype.Service;
import web.entity.Car;

import java.util.List;

@Service
public class CarService {

    private final List<Car> cars;

    public CarService(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> findExactlyNumberOfCars(int count) {
        return cars.subList(0,count);
    }

    public List<Car> findAllCars() {
        return cars;
    }

}
