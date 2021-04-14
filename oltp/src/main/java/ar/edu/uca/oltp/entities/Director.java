package ar.edu.uca.oltp.entities;

import javax.persistence.Entity;

@Entity
public class Director extends Personal {

	public Director(String nombre) {
		this.nombre = nombre;
	}
}
