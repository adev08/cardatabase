package demo.app.cardatabase.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@Entity
@Table(name = "car_owner")
@EqualsAndHashCode(callSuper = true)
public class CarOwner extends BaseEntity  {

	private static final long serialVersionUID = 1L;
	
	@OneToOne
    @JoinColumn(name = "ownerId")
    private Owner owner;

	@JsonIgnore
	@OneToOne(mappedBy = "carOwner")
	private Car car;

}
