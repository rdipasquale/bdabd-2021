package ar.edu.uca.oltp.entities;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class Edificio {
	private String nombre;
	private Direccion direccion;
	private ArrayList<Aula> aula;
	private ArrayList<Instituto> instituto;
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
	public ArrayList<Aula> getAula() {
		return aula;
	}
	public void setAula(ArrayList<Aula> aula) {
		this.aula = aula;
	}
	public ArrayList<Instituto> getInstituto() {
		return instituto;
	}
	public void setInstituto(ArrayList<Instituto> instituto) {
		this.instituto = instituto;
	}
	
}
