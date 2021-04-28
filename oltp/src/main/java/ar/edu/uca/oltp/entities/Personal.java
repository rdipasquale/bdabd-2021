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
@DiscriminatorColumn( name = "PERSONAL_TYPE")
public abstract class Personal {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERSONAL_SEQ")
	protected int id;
	
	protected String nombre;

	@OneToMany(
	        mappedBy = "personal",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	)
	protected Set<ReciboDeSueldo> recibos;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set<ReciboDeSueldo> getRecibos() {
		return recibos;
	}
	public void setRecibos(Set<ReciboDeSueldo> recibos) {
		this.recibos = recibos;
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
		Personal other = (Personal) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
