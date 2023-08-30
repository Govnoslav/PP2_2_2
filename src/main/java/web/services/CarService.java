package web.services;


import org.springframework.stereotype.Service;
import web.entity.Car;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private final List<Car> cars;

    public CarService(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> findAllCars(int count) {

        List<Car> car = count <= 4 ? cars.subList(0, count): cars;
        return car;
    }

    public List<Car> findAllCars() {
        return cars;
    }

}
