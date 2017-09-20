package com.example.demo.repository;

import com.example.demo.model.CarManufacturers;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CarManufacturersRepository {

    @Select("SELECT name from  car_manufacturers;")
    CarManufacturers fetch();
}
