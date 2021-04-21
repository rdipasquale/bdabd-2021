package ar.edu.uca.oltp.entities;

import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapKeyJoinColumn;

@Entity
public class Comision {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COMISION_SEQ")
	private int id;
	@ManyToMany
	@MapKeyJoinColumn(name = "idCargoDocente")
	@JoinTable(
			name = "CargoDocente_Docente_Comision",
			joinColumns = @JoinColumn(name = "idComision"),
			inverseJoinColumns = @JoinColumn(name = "idDocente")
		)
	private HashMap<CargoDocente, Docente> docentes;
	
	
	public Comision() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public HashMap<CargoDocente, Docente> getDocentes() {
		return docentes;
	}


	public void setDocentes(HashMap<CargoDocente, Docente> docentes) {
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
