package com.miu.TestDriven.controller;

import com.miu.TestDriven.TestDrivenApplication;
import com.miu.TestDriven.domain.Car;
import com.miu.TestDriven.exception.CarNotFoundException;
import com.miu.TestDriven.service.CarService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = CarController.class)
public class CarControllerTest {

    @Autowired
    MockMvc mockMvc;
    @MockBean
    CarService carService;


    @Test
    public void getCarDetailsTest() throws Exception {

        given(carService.getCarDetails(Mockito.anyString())).willReturn(new Car("scala","sedan"));

        mockMvc.perform(MockMvcRequestBuilders.get("/cars/tesla"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isMap())
                .andExpect(jsonPath("name").value("scala"))
                .andExpect(jsonPath("type").value("sedan"));

    }

    @Test
    public void getCarNotFoundExceptionTest() throws Exception {

        given(carService.getCarDetails("tesla")).willThrow(new CarNotFoundException());

        mockMvc.perform(MockMvcRequestBuilders.get("/cars/tesla"))
                .andExpect(status().isNotFound());
    }
}
