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
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class CarController {

	private final CarService carService;

	@GetMapping("/{id}")
	public ResponseEntity<CarDto> getCardById(@PathVariable Long id) {
		return ResponseEntity.ok(carService.getCarId(id));
	}

	/*
	 * 
	 * @PutMapping("/{id}") public String updateUser(@PathVariable String
	 * id, @RequestBody String userData) { return "User updated: " + id; }
	 */

	@PostMapping
	public ResponseEntity<CarDto> createCar(@RequestBody CarDto carDTO) {
		CarDto createdCar = carService.saveCar(carDTO);
		return ResponseEntity.ok(createdCar);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCar(@PathVariable Long id) {
		carService.deleteCar(id);
		return ResponseEntity.noContent().build();
	}

}
