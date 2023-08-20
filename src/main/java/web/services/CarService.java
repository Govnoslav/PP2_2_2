package web.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.entity.Car;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private List<Car> cars;


    public List<Car> findExactlyNumberOfCars(int count) {
        return cars.subList(0,count);
    }

    public List<Car> findAllCars() {
        return cars;
    }

}
