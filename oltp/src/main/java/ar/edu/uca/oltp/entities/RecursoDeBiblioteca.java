package ar.edu.uca.oltp.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RecursoDeBiblioteca")
@Inheritance(strategy =InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "RDB_TYPE")
public class RecursoDeBiblioteca {
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE , generator = "RECBIBLIO_SEQ")
	private int id;
	
	private String nombre;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_BIBLIOTECA",nullable = false)
	private Biblioteca biblioteca;
	
	public RecursoDeBiblioteca(int id , String nombre , Biblioteca biblioteca) {
		this.id=id;
		this.nombre=nombre;
		this.biblioteca=biblioteca;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RecursoDeBiblioteca other = (RecursoDeBiblioteca) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
