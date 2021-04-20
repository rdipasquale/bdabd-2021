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

	
	
}
