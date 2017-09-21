package com.example.demo.controller;

import com.example.demo.model.CarManufacturers;
import com.example.demo.repository.CarManufacturersRepository;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@EnableAutoConfiguration
@RequestMapping("/")
public class HelloController {

    private final CarManufacturersRepository carManufacturersRepository;

    // Repository を インジェクションする
    public HelloController(CarManufacturersRepository carManufacturersRepository) {
        this.carManufacturersRepository = carManufacturersRepository;
    }

    @RequestMapping("/car")
    @ResponseBody
    public String car() {
        List<CarManufacturers> carManufacturers = new ArrayList<>();
        carManufacturers = carManufacturersRepository.fetchAll();


        String result = "";
        for (CarManufacturers carManufacturer : carManufacturers) {
            result += carManufacturer.getName() + "<br>";
        }

        return result;
    }



    @RequestMapping("/hello")
    @ResponseBody
    public String home() {
        return "Hello World.";
    }

}
