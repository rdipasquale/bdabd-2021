package ar.edu.uca.oltp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Biblioteca {
	@Id
	private int id;
	private String nombre;
	private Edificio edificio;
	
	public Biblioteca () {
		
	}
	@Override
	public String toString() {
		return "Biblioteca [id="+id+",nombre="+nombre+",edificio="+edificio+"]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Edificio getEdificio() {
		return edificio;
	}
	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
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
		Biblioteca other = (Biblioteca) obj;
		if(id != other.id)
			return false;
		return true;
	}
}
