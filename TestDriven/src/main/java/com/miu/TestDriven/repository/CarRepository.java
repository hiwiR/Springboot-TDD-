package com.miu.TestDriven.repository;

import com.miu.TestDriven.domain.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CarRepository extends CrudRepository<Car,Integer> {

     //Car getCar();
}
