package ar.edu.uca.batch.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Aula {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AULA_SEQ")
	private int id;
	private String nombre;
	private Integer capacidad;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EDIFICIO")
	private Edificio edificio;
	
	private Integer piso;
	
	public Aula() {
		
	}
	@Override
	public String toString() {
		return "Aula [id="+id+",nombre="+nombre+",capacidad="+capacidad+",edificio="+edificio+",piso="+piso+"]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
	public Edificio getEdificio() {
		return edificio;
	}
	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}
	public Integer getPiso() {
		return piso;
	}
	public void setPiso(Integer piso) {
		this.piso = piso;
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
		Aula other = (Aula) obj;
		if(id != other.id)
			return false;
		return true;
	}
	
}
