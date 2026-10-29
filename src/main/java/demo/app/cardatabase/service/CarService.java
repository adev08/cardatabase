
package demo.app.cardatabase.service;

import java.util.List;

import org.springframework.stereotype.Service;

import demo.app.cardatabase.entity.Car;
import demo.app.cardatabase.entity.CarOwner;
import demo.app.cardatabase.mapper.CarMapper;
import demo.app.cardatabase.model.CarDto;
import demo.app.cardatabase.repository.CarRepository;
import demo.app.cardatabase.repository.CarOwnerRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;
    private final CarOwnerRepository carOwnerRepository;
    private final CarMapper carMapper;

    public CarDto getCar(Long id) {
        return carRepository.findById(id)
                .map(carMapper::toDto)
                .orElseThrow(() ->
                    new EntityNotFoundException(
                        "Car not found with id: " + id
                    )
                );
    }

    public List<CarDto> retrieveAllCars() {
        return carRepository.findAll()
                .stream()
                .map(carMapper::toDto)
                .toList();
    }

    public CarDto createCar(CarDto carDto) {
        Car car = new Car();

        car.setBrand(carDto.getBrand());
        car.setModel(carDto.getModel());
        car.setColor(carDto.getColor());
        car.setRegistrationNumber(carDto.getRegistrationNumber());
        car.setModelYear(carDto.getModelYear());
        car.setPrice(carDto.getPrice());

        if (carDto.getCarOwnerId() != null) {
            CarOwner carOwner = carOwnerRepository
                    .findById(carDto.getCarOwnerId())
                    .orElseThrow(() ->
                        new EntityNotFoundException(
                            "CarOwner not found with id: "
                            + carDto.getCarOwnerId()
                        )
                    );

            car.setCarOwner(carOwner);
        }

        Car savedCar = carRepository.save(car);

        return carMapper.toDto(savedCar);
    }


public CarDto updateCar(CarDto updateCar, Long carId) {
    Car car = carRepository.findById(carId)
            .orElseThrow(() ->
                new EntityNotFoundException(
                    "Car not found with id: " + carId
                )
            );

    // Update only fields that have new values
    if (updateCar.getBrand() != null) {
        car.setBrand(updateCar.getBrand());
    }

    if (updateCar.getModel() != null) {
        car.setModel(updateCar.getModel());
    }

    if (updateCar.getColor() != null) {
        car.setColor(updateCar.getColor());
    }

    if (updateCar.getRegistrationNumber() != null) {
        car.setRegistrationNumber(
            updateCar.getRegistrationNumber()
        );
    }

    if (updateCar.getModelYear() != null) {
        car.setModelYear(updateCar.getModelYear());
    }

    if (updateCar.getPrice() != null) {
        car.setPrice(updateCar.getPrice());
    }

    if (updateCar.getCarOwnerId() != null) {
        CarOwner carOwner = carOwnerRepository
                .findById(updateCar.getCarOwnerId())
                .orElseThrow(() ->
                    new EntityNotFoundException(
                        "CarOwner not found with id: "
                        + updateCar.getCarOwnerId()
                    )
                );

        car.setCarOwner(carOwner);
    }

    Car updatedCar = carRepository.save(car);

    return carMapper.toDto(updatedCar);
}


    public boolean deleteCar(Long carId) {
        if (!carRepository.existsById(carId)) {
            return false;
        }

        carRepository.deleteById(carId);
        return true;
    }
}
