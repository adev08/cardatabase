
package demo.app.cardatabase.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.app.cardatabase.model.CarDto;
import demo.app.cardatabase.service.CarService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/car")
@RequiredArgsConstructor
@Tag(name = "Car API", description = "Endpoints for managing cars")
public class CarController {

    private final CarService carService;

    @GetMapping("/{id}")
    @Operation(
        summary = "Retrieve a car by ID",
        description = "Fetches car details based on the provided ID."
    )
    public ResponseEntity<CarDto> getCar(
            @PathVariable("id") Long id) {

        return ResponseEntity.ok(carService.getCar(id));
    }

    @PostMapping
    public ResponseEntity<CarDto> createCar(
            @Valid @RequestBody CarDto carDto) {

        CarDto createdCar = carService.createCar(carDto);
        return ResponseEntity.status(201).body(createdCar);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CarDto> updateCar(
            @Valid @RequestBody CarDto updateCar,
            @PathVariable("id") Long carId) {

        return ResponseEntity.ok(
            carService.updateCar(updateCar, carId)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteCarById(
            @PathVariable("id") Long carId) {

        Boolean deleted = carService.deleteCar(carId);

        if (deleted) {
            return ResponseEntity.ok(true);
        }

        return ResponseEntity.notFound().build();
    }
}
