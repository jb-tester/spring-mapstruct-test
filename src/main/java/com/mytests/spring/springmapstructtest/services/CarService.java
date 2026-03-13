package com.mytests.spring.springmapstructtest.services;


import com.mytests.spring.springmapstructtest.model.Car;
import com.mytests.spring.springmapstructtest.model.CarView;

public interface CarService {
    Car createCar(CarView carView);
    CarView createView(Car car);
}
