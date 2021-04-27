package ar.edu.uca.oltp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("DIRECTOR")
public class Director extends Personal {

	public Director(String nombre) {
		this.nombre = nombre;
	}
}
