package ar.edu.uca.bases2.mongodomain.entities;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Instituto{
	@Id
	private int id;
	
	private String nombre;
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
	public void addEdificio(Edificio edificioAdicional) {
		this.edificios.add(edificioAdicional);
	}
	
	
	@Override
	public String toString() {
		return "Instituto [id=" + id + ", nombre=" + nombre + ", edificios=" + edificios + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((edificios == null) ? 0 : edificios.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Instituto other = (Instituto) obj;
		if (edificios == null) {
			if (other.edificios != null)
				return false;
		} else if (!edificios.equals(other.edificios))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public Instituto() {
		
	}
	
	
}