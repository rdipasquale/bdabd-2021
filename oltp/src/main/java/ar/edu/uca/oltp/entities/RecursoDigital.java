package ar.edu.uca.oltp.entities;

import javax.persistence.Entity;

@Entity
public class RecursoDigital extends RecursoDeBiblioteca{
	public RecursoDigital(int id , String nombre , Biblioteca biblioteca) {
		super(id,nombre,biblioteca);
	}
}
