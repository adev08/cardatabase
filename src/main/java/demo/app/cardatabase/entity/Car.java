package demo.app.cardatabase.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@Entity
@Table(name = "car")
@EqualsAndHashCode(callSuper = true)
public class Car extends BaseEntity {
	
	private static final long serialVersionUID = -7742475933205612429L;
	
	private String brand;
	private String model;
	private String color;
	private String registrationNumber;
	private int modelYear;
	private int price;
	
	//TODO: relationships

}
