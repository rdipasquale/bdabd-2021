package ar.edu.uca.oltp.entities;

import java.util.Set;

abstract public class Instituto {
	private int id;
	private String nombre;
	private Set<Edificio> edificios;
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
