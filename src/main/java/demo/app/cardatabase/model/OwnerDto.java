package demo.app.cardatabase.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OwnerDto implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	private Long Id;
	private String firstName;
	private String lastName;

}
