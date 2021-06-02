package ar.edu.uca.batch.entities;

import java.util.Set;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn( name = "INST_TYPE")
abstract public class Instituto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="INSTITUTO_SEQ")
	private int id;
	
	private String nombre;
	
	@ManyToMany
	@JoinTable(name="instituto_edificio",
    joinColumns=@JoinColumn(name="instituto_id", referencedColumnName="id"),
    inverseJoinColumns=@JoinColumn(name="edificio_id", referencedColumnName="id"))
	private Set<Edificio> edificios;
		
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
	
	public Set<Edificio> getEdificios() {
		return edificios;
	}
	
	public void setEdificios(Set<Edificio> edificios) {
		this.edificios = edificios;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
}
