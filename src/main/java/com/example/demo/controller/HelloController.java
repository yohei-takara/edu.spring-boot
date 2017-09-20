package com.example.demo.controller;

import com.example.demo.model.CarManufacturers;
import com.example.demo.repository.CarManufacturersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloController {

    @Autowired
    private CarManufacturersRepository car;

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        CarManufacturers carManufacturers = car.fetch();
        return "Hello " + carManufacturers.getName() ;
    }

}
