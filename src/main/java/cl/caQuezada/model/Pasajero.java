package cl.caQuezada.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pasajero {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // database H2. 
	private Long id;
	private String rut;
	private String nombre;
	private String apellido;
	private String email;
	private Integer edad;
	private String ciudadOrigen;
}
