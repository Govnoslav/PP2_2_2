package web.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(1)
public class Zil extends Car {

public Zil(@Value("${zil}") String name,
           @Value("${car.age}") int age,
           @Value("${car.price}") int price) {
        super(name, age, price);
    }

}
