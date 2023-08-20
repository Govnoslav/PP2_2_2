package web.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Objects;

public abstract class Car {
    private String name;
    private int age;
    private int price;

    private String parent = "Car";

    public Car(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return age == car.age && price == car.price && Objects.equals(name, car.name) && Objects.equals(parent, car.parent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, price, parent);
    }
}
