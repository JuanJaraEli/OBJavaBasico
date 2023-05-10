package com.coches;

import java.util.ArrayList;
import java.util.List;

public class CarsCRUDImpl implements CarsCRUD {

    List<Car> Cars = new ArrayList<>();


    @Override
    public void save(Car car) {
        Cars.add(car);
    }

    @Override
    public List<Car> findAll() {
        return Cars;
    }

    @Override
    public void delete(Car car) {
        Cars.remove(car);
    }
}
