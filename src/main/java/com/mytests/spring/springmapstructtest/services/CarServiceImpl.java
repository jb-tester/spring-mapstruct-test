package com.mytests.spring.springmapstructtest.services;

import com.mytests.spring.springmapstructtest.mappers.CarMapper;
import com.mytests.spring.springmapstructtest.model.Car;
import com.mytests.spring.springmapstructtest.model.CarView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarMapper carMapper;



    @Override
    public Car createCar(CarView carView) {
        var car = carMapper.carFromView(carView);
        return car;
    }

    @Override
    public CarView createView(Car car) {
        var carView = carMapper.carViewFromEntity(car);
        return carView;
    }
}
