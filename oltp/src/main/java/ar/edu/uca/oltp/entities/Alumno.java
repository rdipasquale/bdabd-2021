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
public class Alumno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ALUMNO_SEQ")
	private int id;
	private String nombre;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_NOTA",nullable=false)
	private List<Nota> notas;
	
	public Alumno() {
		
	}

	
	
	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + "]";
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
	

	public List<Nota> getNotas() {
		return notas;
	}



	public void setNotas(List<Nota> notas) {
		this.notas = notas;
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
		Alumno other = (Alumno) obj;
		if (id != other.id)
			return false;
		return true;
	}

	

	
	
}
