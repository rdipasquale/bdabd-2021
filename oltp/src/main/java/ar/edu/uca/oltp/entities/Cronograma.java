package ar.edu.uca.oltp.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Cronograma {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CRONOGRAMA_SEQ")
	private int id;
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="TEMA_ID",nullable=false)
	private List<Tema> temas;
	
	
	public Cronograma() {
		super();
	}


	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public List<Tema> getTemas() {
		return temas;
	}


	public void setTemas(List<Tema> temas) {
		this.temas = temas;
	}


	@Override
	public String toString() {
		return "Cronograma [id=" + id + "]";
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
		Cronograma other = (Cronograma) obj;
		if (id != other.id)
			return false;
		return true;
	}


	
	
	
	
}