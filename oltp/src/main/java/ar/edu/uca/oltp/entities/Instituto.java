package ar.edu.uca.oltp.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn( name = "INST_TYPE")
abstract public class Instituto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="INSTITUTO_SEQ")
	private int id;
	
	private String nombre;
	
	@OneToMany(
	        mappedBy = "ID_INSTITUTO",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	)
	private Set<Edificio> edificios;
	
	@OneToMany(
	        mappedBy = "ID_INSTITUTO",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	)
	private Set<Personal> personal;
	
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
	
	public Set<Personal> getPersonal() {
		return personal;
	}
	
	public void setPersonal(Set<Personal> personal) {
		this.personal = personal;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
}
