package com.miu.TestDriven.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {
    @Id
    public int id;
    public String name;
    public String type;

    public Car(String name,String type){
        this.name = name;
        this.type = type;
    }
}
