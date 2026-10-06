package demo.app.cardatabase.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@Entity
@Table(name = "owner")
@EqualsAndHashCode(callSuper = true)
public class Owner extends BaseEntity  {
	
	private static final long serialVersionUID = 1L;
	
	 @Column(name = "firstName")
	 private String firstName;

	 @Column(name = "lastName")
	 private String lastName;

	 @OneToOne(mappedBy = "owner")
	 @JsonIgnore
	 private CarOwner carOwner;
	

}
