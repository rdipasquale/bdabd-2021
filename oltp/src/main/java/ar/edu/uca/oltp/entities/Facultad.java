package ar.edu.uca.oltp.entities;

import java.util.Set;

public class Facultad extends Instituto {
	private Decano decano;
	private Set<Carrera> carreras;

	public Facultad() {
		
	}
	
	public Facultad(int id, String nombre, Set<Edificio> edificio, Set<Personal> personal, Decano decano, Set<Carrera> carreras) {
		this.setId(id);
		this.setNombre(nombre);
		this.setEdificios(edificio);
		this.setPersonal(personal);
		this.decano = decano;
		this.carreras = carreras;
	}
	
	public Decano getDecano() {
		return decano;
	}

	public void setDecano(Decano decano) {
		this.decano = decano;
	}

	public Set<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(Set<Carrera> carreras) {
		this.carreras = carreras;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Facultad other = (Facultad) obj;
		if (this.getId() != other.getId())
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Facultad [id=" + this.getId() + ", nombre=" + this.getNombre() + "]";
	}
}
