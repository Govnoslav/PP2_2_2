package web.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Zaz extends Car{

    public Zaz(@Value("${zaz}") String name,
               @Value("${car.age}") int age,
               @Value("${car.price}") int price) {
        super(name, age, price);
    }
}
