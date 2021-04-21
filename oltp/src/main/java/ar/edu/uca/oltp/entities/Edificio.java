package ar.edu.uca.oltp.entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Edificio {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EDIFICIO_SEQ")
	private int id;
	
	
	private String nombre;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="DIRECCION")
	private Direccion direccion;
	
	private ArrayList<Aula> aula;
	
	@OneToMany(mappedBy="edificio", fetch=FetchType.LAZY)
	private ArrayList<Instituto> instituto;
	
	private ArrayList<Biblioteca> biblioteca;
	
	
	@Override
	public String toString() {
		return "Edificio [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", aula=" + aula
				+ ", instituto=" + instituto + ", biblioteca=" + biblioteca + "]";
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
