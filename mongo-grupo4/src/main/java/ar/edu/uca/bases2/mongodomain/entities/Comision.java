package ar.edu.uca.bases2.mongodomain.entities;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Comision {
	@Id
	private String id;
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


	public String getId() {
		return id;
	}


	public void setId(String id) {
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
		result = prime * result + ((docentes == null) ? 0 : docentes.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((materia == null) ? 0 : materia.hashCode());
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
		if (docentes == null) {
			if (other.docentes != null)
				return false;
		} else if (!docentes.equals(other.docentes))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (materia == null) {
			if (other.materia != null)
				return false;
		} else if (!materia.equals(other.materia))
			return false;
		return true;
	}
}
