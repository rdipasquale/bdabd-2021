package ar.edu.uca.oltp.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance
@Table(name = "CARRERA")
@DiscriminatorColumn(name = "TIPO_CARRERA")
public class CarreraDePosgrado extends Carrera{

	public CarreraDePosgrado() {
		super();
	}

}
