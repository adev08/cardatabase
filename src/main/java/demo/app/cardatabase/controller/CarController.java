package demo.app.cardatabase.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.app.cardatabase.model.CarDto;
import demo.app.cardatabase.service.CarService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/car")
@RequiredArgsConstructor
@Tag(name = "Car API", description = "Endpoints for managing Car")
public class CarController {
	
	private final CarService carService;
	
	  @GetMapping("/{id}")
	  @Operation(summary = "Retrieve a Car by ID", description = "Fetches car details based on the provided ID.")
	    public ResponseEntity<CarDto> getCard(@PathVariable(value = "id") Long id) {
	        return ResponseEntity.ok().body(carService.getCar(id));
	    }

}
