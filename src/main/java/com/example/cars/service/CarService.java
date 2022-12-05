package com.example.cars.service;

import com.example.cars.model.Car;
import com.example.cars.repository.CarRepository;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CarService {

    final static CarRepository carRepo = new CarRepository();

    public void addCar(Car car){
        carRepo.addCar(car);
    }

    public List<Car> getCars(){
        return carRepo.getCars();
    }

}
