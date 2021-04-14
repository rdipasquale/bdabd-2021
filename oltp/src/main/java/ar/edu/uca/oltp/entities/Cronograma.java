package ar.edu.uca.oltp.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cronograma {
	
	@Id
	private int idCronograma;
	private List<Tema> temas;
	
	
	public Cronograma() {
		super();
	}


	public int getIdCronograma() {
		return idCronograma;
	}


	public void setIdCronograma(int idCronograma) {
		this.idCronograma = idCronograma;
	}


	public List<Tema> getTemas() {
		return temas;
	}


	public void setTemas(List<Tema> temas) {
		this.temas = temas;
	}


	@Override
	public String toString() {
		return "Cronograma [idCronograma=" + idCronograma + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCronograma;
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
		Cronograma other = (Cronograma) obj;
		if (idCronograma != other.idCronograma)
			return false;
		return true;
	}


	
	
	
	
}