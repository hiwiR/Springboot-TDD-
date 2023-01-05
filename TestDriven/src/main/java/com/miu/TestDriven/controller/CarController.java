package com.miu.TestDriven.controller;

import com.miu.TestDriven.domain.Car;
import com.miu.TestDriven.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    CarService carService;
        @GetMapping("/{name}")
        public ResponseEntity<?> getCarDetails(@PathVariable String name){
            Car newCar = carService.getCarDetails(name);
            return new ResponseEntity<>(newCar, HttpStatus.OK);
        }

}
