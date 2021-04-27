package ar.edu.uca.oltp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("LIB")
public class Libro extends RecursoDeBiblioteca{
	public Libro(int id , String nombre , Biblioteca biblioteca) {
		super(id,nombre,biblioteca);
	}
}
