/*
package com.miu.TestDriven.service;

import com.miu.TestDriven.exception.CarNotFoundException;
import com.miu.TestDriven.repository.CarRepository;
import com.miu.TestDriven.domain.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.given;

public class CarServiceTest {

    @Mock
    CarRepository carRepository;

    @InjectMocks
    CarService carService;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void carServiceTest(){
        given(carRepository.getCar()).willReturn(new Car("citra","sedan"));

        Car car = carService.getCarDetails("citra");
        assertNotNull(car);
        Assertions.assertEquals("citra",car.getName());
        Assertions.assertEquals("sedan",car.getType());
    }
    @Test
    public void carNotFoundTest(){
        given(carRepository.getCar()).willThrow(new CarNotFoundException());

        assertThrows(CarNotFoundException.class,() -> carService.getCarDetails("pulse"));

    }
}
*/
