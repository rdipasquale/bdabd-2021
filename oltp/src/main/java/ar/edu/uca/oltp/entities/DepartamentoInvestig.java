package ar.edu.uca.oltp.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
@DiscriminatorValue("DEPT_INV")
public class DepartamentoInvestig extends Instituto {
	
	@OneToOne(fetch = FetchType.EAGER)
	private Director director;
	
	@OneToMany(
	        mappedBy = "ID_DEPT_INV",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	)
	private Set<Proyecto> proyectos;

	public DepartamentoInvestig() {
		
	}
	
	public DepartamentoInvestig(int id, String nombre, Set<Edificio> edificio, Set<Personal> personal, Director director, Set<Proyecto> proyectos) {
		this.setId(id);
		this.setNombre(nombre);
		this.setEdificios(edificio);
		this.setPersonal(personal);
		this.director = director;
		this.proyectos = proyectos;
	}
	
	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public Set<Proyecto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(Set<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DepartamentoInvestig other = (DepartamentoInvestig) obj;
		if (this.getId() != other.getId())
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Departamento de Investigacion [id=" + this.getId() + ", nombre=" + this.getNombre() + "]";
	}
}
