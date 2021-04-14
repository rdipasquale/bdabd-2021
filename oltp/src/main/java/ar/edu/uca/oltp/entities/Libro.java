package ar.edu.uca.oltp.entities;

import javax.persistence.Entity;

@Entity
public class Libro extends RecursoDeBiblioteca{
	public Libro(int id , String nombre , Biblioteca biblioteca) {
		super(id ,  nombre ,  biblioteca);
	}
}
