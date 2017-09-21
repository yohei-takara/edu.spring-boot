package com.example.demo.repository;

import com.example.demo.model.CarManufacturers;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CarManufacturersRepository {

    @Select("SELECT name FROM  car_manufacturees")
    List<CarManufacturers> fetchAll();


    @Select("SELECT name FROM  car_manufacturees WHERE name = #{name};")
    CarManufacturers fetch(String name);
}
