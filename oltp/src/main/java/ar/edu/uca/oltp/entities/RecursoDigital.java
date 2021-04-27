package ar.edu.uca.oltp.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("RD")
public class RecursoDigital extends RecursoDeBiblioteca{
	public RecursoDigital(int id , String nombre , Biblioteca biblioteca) {
		super(id,nombre,biblioteca);
	}
}
