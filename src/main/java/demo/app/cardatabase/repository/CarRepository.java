package demo.app.cardatabase.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import demo.app.cardatabase.entity.Car;

public interface CarRepository  extends JpaRepository<Car, Long> {

	// Fetch car by brand
	List<Car> findByBrand(String brand);
	
	// Fetch card by colors
	List<Car> findByColor(String color);
	
	// Fetch by model year
	List<Car> findByModelYear(String modelYear);
	
	// Fetch cars by brand and model
	List<Car> findByBrandAndModelYear(String brand, String modelYear);
	
	// Fetch cars by brand and color
	List<Car> findByBrandAndColor(String brand, String color);
	
	// Fetch cars by brand and sort by year
	List<Car> findByBrandOrderByModelYearAsc(String brand);
	
	// Fetch car by brand using SQL
	@Query("select c from Car c where c.brand like %?1")
	List<Car> findByBrandEndsWith(String brand);
}
