package web.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Gaz extends Car{

    public Gaz(@Value("${car.gaz}") String name,
               @Value("${car.age}") int age,
               @Value("${car.price}") int price) {
        super(name, age, price);
    }
}
