package ar.edu.uca.oltp.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Decano extends Personal {

	public Decano(String nombre) {
		this.nombre = nombre;
	}
}
