package com.example.cars.controller;

import com.example.cars.model.Car;
import com.example.cars.service.CarService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@AllArgsConstructor
@RestController
@RequestMapping("/")
public class CarController {

    //Car car = new Car("VW",4,true);
    private final static CarService carService = new CarService();

    @PostMapping
    public void takeACar(@RequestBody Car newCar){
        carService.addCar(newCar);
    }

    @GetMapping("/zeigAuto")
    public List<Car> giveMeAllZeCars(){
        return carService.getCars();
    }

}
