package demo.app.cardatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import demo.app.cardatabase.entity.Car;

public interface CarRepository  extends JpaRepository<Car, Long> {

}
