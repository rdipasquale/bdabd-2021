package ar.edu.uca.oltp.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comision {
	
	@Id
	private int idComision;
	private List<Docente> docentes;
	
	
	public Comision() {
		super();
	}


	public int getIdComision() {
		return idComision;
	}


	public void setIdComision(int idComision) {
		this.idComision = idComision;
	}


	public List<Docente> getDocentes() {
		return docentes;
	}


	public void setDocentes(List<Docente> docentes) {
		this.docentes = docentes;
	}


	@Override
	public String toString() {
		return "Comision [idComision=" + idComision + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idComision;
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
		if (idComision != other.idComision)
			return false;
		return true;
	}


	
	
	
}
