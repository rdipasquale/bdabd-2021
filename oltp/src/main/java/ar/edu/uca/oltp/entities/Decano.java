package ar.edu.uca.oltp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("DECANO")
public class Decano extends Personal {

	public Decano(String nombre) {
		this.nombre = nombre;
	}
}
