package web.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Maz extends Car{
    public Maz(@Value("${car.maz}") String name,
               @Value("${car.age}")int age,
               @Value("${car.price}")int price) {
        super(name, age, price);
    }
}
