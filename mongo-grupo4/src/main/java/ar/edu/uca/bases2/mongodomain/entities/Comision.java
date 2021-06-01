package ar.edu.uca.bases2.mongodomain.entities;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Comision {
	@Id
	private int id;
	private Materia materia;
	private Map<CargoDocente, Docente> docentes;
	

	public Comision() {
		super();
	}


	public Materia getMateria() {
		return materia;
	}


	public void setMateria(Materia materia) {
		this.materia = materia;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Map<CargoDocente, Docente> getDocentes() {
		return docentes;
	}


	public void setDocentes(Map<CargoDocente, Docente> docentes) {
		this.docentes = docentes;
	}


	@Override
	public String toString() {
		return "Comision [id=" + id + "]";
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
		Comision other = (Comision) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
