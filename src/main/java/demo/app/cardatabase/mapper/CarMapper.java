package demo.app.cardatabase.mapper;

import org.springframework.stereotype.Component;

import demo.app.cardatabase.entity.Car;
import demo.app.cardatabase.model.CarDto;

@Component
public class CarMapper {
	
	public CarDto toDto(Car car) {
		CarDto dto = new CarDto();
		 
		dto.setId(car.getId());
		dto.setBrand(car.getBrand());
		dto.setModel(car.getModel());
		dto.setColor(car.getColor());
		dto.setRegistrationNumber(car.getRegistrationNumber());
		dto.setModelYear(car.getModelYear());
		dto.setPrice(car.getPrice());
		
		return dto;
	}
	
	public Car toEntity(CarDto dto) {
		Car car = new Car();
		 
		car.setBrand(dto.getBrand());
		car.setModel(dto.getModel());
		car.setColor(dto.getColor());
		car.setRegistrationNumber(dto.getRegistrationNumber());
		car.setModelYear(dto.getModelYear());
		car.setPrice(dto.getPrice());
		
		return car;
	}

}
