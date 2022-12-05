package com.example.cars.repository;

import com.example.cars.model.Car;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CarRepository {
    private List<Car> carList = new ArrayList<>();

    public CarRepository() {
    }

    public void addCar(Car car){
        carList.add(car);
    }

    public List<Car> getCars(){
        return carList;
    }
}
