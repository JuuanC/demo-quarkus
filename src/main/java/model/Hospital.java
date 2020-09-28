package model;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.Data;

@Entity
@Data
@Table(name ="hospital")
public class Hospital extends PanacheEntityBase {
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "SEQ_PROD")
    @SequenceGenerator(name="SEQ_PROD", sequenceName = "SEQ_PROD", allocationSize = 1, initialValue = 11)
    private Long id;
	
	@Column(unique=true)
	private String name;
	
	private String street;
	
	private String streetNumber;
	
	private String zipCode;
	
	private String Institution;
}
