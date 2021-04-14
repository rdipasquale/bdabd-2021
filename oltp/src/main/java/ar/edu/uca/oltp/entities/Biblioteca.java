package ar.edu.uca.oltp.entities;

import javax.persistence.Entity;

@Entity
public class Biblioteca {
	private String nombre;
	private Edificio edificio;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Edificio getEdificio() {
		return edificio;
	}
	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}
}
