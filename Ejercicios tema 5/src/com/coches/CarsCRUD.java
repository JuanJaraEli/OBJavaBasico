package com.coches;


import java.util.List;

public interface CarsCRUD {

    void save(Car car);
    List findAll();
    void delete(Car car);

}
