package demo.app.cardatabase.model;


import java.io.Serializable;

import demo.app.cardatabase.entity.CarOwner;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarDto implements Serializable {
	
	private static final long serialVersionUID = -127775114819011194L;
	
	private Long id;
	private String brand; 
	private String model;
	private String color;
	private String registrationNumber;
	private int modelYear;
	private int price;

	private Long carOwnerId;
	private Long ownerId;
    private String ownerFirstName;
    private String ownerLastName;

}
