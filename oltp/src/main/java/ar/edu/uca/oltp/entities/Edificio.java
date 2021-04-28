package ar.edu.uca.oltp.entities;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Edificio {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EDIFICIO_SEQ")
	private int id;
	
	private String nombre;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="DIRECCION")
	private Direccion direccion;
	
	@OneToMany(mappedBy="edificio", fetch=FetchType.LAZY)
	private List<Instituto> instituto;
	
	@Override
	public String toString() {
		return "Edificio [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", instituto=" + instituto
				+ "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Instituto> getInstituto() {
		return instituto;
	}
	public void setInstituto(List<Instituto> instituto) {
		this.instituto = instituto;
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
		Edificio other = (Edificio) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public Edificio() {
		// TODO Auto-generated constructor stub
	}
	
	
}
