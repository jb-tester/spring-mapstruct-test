package com.mytests.spring.springmapstructtest.mappers;

import com.mytests.spring.springmapstructtest.model.Car;
import com.mytests.spring.springmapstructtest.model.CarView;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CarMapper
{
    CarView carViewFromEntity(Car car);
    Car carFromView(CarView carView);
}
