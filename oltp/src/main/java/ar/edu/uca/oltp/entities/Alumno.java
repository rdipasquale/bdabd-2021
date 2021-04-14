package ar.edu.uca.oltp.entities;

import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alumno {
	
	@Id
	private int id;
	private String nombre;
	//Agregar mappeo
	private HashSet<Carrera> carreras;
	
	public Alumno() {
		
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

	public HashSet<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(HashSet<Carrera> carreras) {
		this.carreras = carreras;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carreras == null) ? 0 : carreras.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Alumno other = (Alumno) obj;
		if (carreras == null) {
			if (other.carreras != null)
				return false;
		} else if (!carreras.equals(other.carreras))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}
