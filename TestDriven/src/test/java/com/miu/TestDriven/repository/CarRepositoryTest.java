package com.miu.TestDriven.repository;

import com.miu.TestDriven.domain.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
@DataJpaTest
public class CarRepositoryTest {

    @Autowired
    CarRepository carRepository;

    @Test
    public void getCarTest(){
       // BDDMockito.given(carRepository.findById(1)).willReturn(Optional.of(new Car("Elentra","Hyundai")));
        Optional<Car> car = carRepository.findById(1);
        Assertions.assertTrue(car.isPresent());
    }
}
