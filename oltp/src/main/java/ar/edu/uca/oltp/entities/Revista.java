package ar.edu.uca.oltp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("REV")
public class Revista extends RecursoDeBiblioteca{
	public Revista(int id , String nombre , Biblioteca biblioteca) {
		super(id,nombre,biblioteca);
	}

}
