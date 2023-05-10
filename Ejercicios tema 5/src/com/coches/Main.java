package com.coches;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CarsCRUDImpl carsCRUDImpl = new CarsCRUDImpl();

        Car ferrari = new Car("Ferrari", "GT", 2018, 45000);
        Car audi = new Car("Audi", "Q8", 2018, 25000);

        carsCRUDImpl.save(ferrari);
        carsCRUDImpl.save(audi);
        List<Car> cars = carsCRUDImpl.findAll();

        System.out.println(cars);

        carsCRUDImpl.delete(audi);

        System.out.println(cars);
    }
}