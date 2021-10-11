package cl.caQuezada.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Destino {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // database H2. 
	private Long id;
	private String ciudad;
	private String pais;
	private String fecha;
	@ManyToOne(cascade = CascadeType.ALL) // insersión a la base de datos de forma separada para generar persistencia
	@JoinColumn(name = "pasajero_id", referencedColumnName = "id")
	private Pasajero pasajero;
}
