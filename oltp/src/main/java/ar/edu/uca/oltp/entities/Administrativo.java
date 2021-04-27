package ar.edu.uca.oltp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ADMINISTRATIVO")
public class Administrativo extends Personal {

	public Administrativo(String nombre) {
		this.nombre = nombre;
	}

}
