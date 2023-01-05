package com.miu.TestDriven.service;

import com.miu.TestDriven.repository.CarRepository;
import com.miu.TestDriven.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;
    public Car getCarDetails(String name) {
        Car car = carRepository.findById(1).get();
        return car;
    }
}
