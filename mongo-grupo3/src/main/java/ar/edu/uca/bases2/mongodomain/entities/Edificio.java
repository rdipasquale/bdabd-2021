package ar.edu.uca.bases2.mongodomain.entities;

import java.util.List;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Edificio{
	@Id
	private int id;
	private String nombre;
	private String direccion;
	private List<Instituto> institutos;
	
	@Override
	public String toString() {
		return "Edificio [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", instituto=" + institutos
				+ "]";
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Instituto> getInstituto() {
		return institutos;
	}
	public void setInstituto(List<Instituto> institutos) {
		this.institutos = institutos;
	}
	public void addInstituto(Instituto instituto) {

		this.institutos.add(instituto);
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