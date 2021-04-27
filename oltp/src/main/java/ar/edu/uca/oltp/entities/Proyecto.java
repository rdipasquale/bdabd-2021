package ar.edu.uca.oltp.entities;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Proyecto {
	@Id
	private int id;
	private String nombre;
	private Carrera carrera;
	private Director director;
	//Agregar mappeo
	private Set<Alumno> alumnos;
	private Set<Investigador> investigadores;
	
	public Proyecto() {
		
	}
	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", nombre=" + nombre + "]";
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
	public Carrera getCarrera() {
		return carrera;
	}
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public Set<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Set<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	public Set<Investigador> getInvestigador() {
		return investigadores;
	}

	public void setInvestigador(Set<Investigador> investigadores) {
		this.investigadores = investigadores;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alumnos == null) ? 0 : alumnos.hashCode());
		result = prime * result + ((carrera == null) ? 0 : carrera.hashCode());
		result = prime * result + ((director == null) ? 0 : director.hashCode());
		result = prime * result + id;
		result = prime * result + ((investigadores == null) ? 0 : investigadores.hashCode());
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
		Proyecto other = (Proyecto) obj;
		if (alumnos == null) {
			if (other.alumnos != null)
				return false;
		} else if (!alumnos.equals(other.alumnos))
			return false;
		if (carrera == null) {
			if (other.carrera != null)
				return false;
		} else if (!carrera.equals(other.carrera))
			return false;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		if (id != other.id)
			return false;
		if (investigadores == null) {
			if (other.investigadores != null)
				return false;
		} else if (!investigadores.equals(other.investigadores))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	
	
}
