package ar.edu.uca.bases2.mongodomain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RecursoDeBiblioteca{
	@Id
	private int id;
	private String nombre;
	private Biblioteca biblioteca;
	
	public RecursoDeBiblioteca(){
		super();
		// TODO Auto-generated constructor stub
	}
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