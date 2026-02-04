package demo.app.cardatabase.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import demo.app.cardatabase.entity.Car;
import demo.app.cardatabase.mapper.CarMapper;
import demo.app.cardatabase.model.CarDto;
import demo.app.cardatabase.repository.CarRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class CarService {
	
	private final CarRepository carRepository;
	private final CarMapper carMapper;

	 public CarDto getCarId(Long id) {
	        return carRepository.findById(id)
	        		.map(carMapper::toDto)
	        		.orElseThrow(() -> new EntityNotFoundException("Car not found with id: " + id));
	            
	    }
	 
	 
	 public List<CarDto> retrieveAllCars() {
		 return carRepository.findAll().stream()
				 .map(carMapper::toDto)
				 .collect(Collectors.toList());
	 }
	 
	 //TODO: CRUD operations
}
