package ar.edu.uca.oltp.entities;

import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("DEPT_ALU")
public class DepartamentoAlumnos extends Instituto {

	private Director director;
	
	public DepartamentoAlumnos() {
		
	}
	
	public DepartamentoAlumnos(int id, String nombre, Set<Edificio> edificio, Director director) {
		this.setId(id);
		this.setNombre(nombre);
		this.setEdificios(edificio);
		this.director = director;
	}
	
	
	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DepartamentoAlumnos other = (DepartamentoAlumnos) obj;
		if (this.getId() != other.getId())
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Departamento de Alumnos [id=" + this.getId() + ", nombre=" + this.getNombre() + "]";
	}
}
