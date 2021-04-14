package ar.edu.uca.oltp.entities;

import javax.persistence.Entity;

@Entity
public class Administrativo extends Personal {

	public Administrativo(String nombre) {
		this.nombre = nombre;
	}

}
