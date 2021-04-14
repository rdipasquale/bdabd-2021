package ar.edu.uca.oltp.entities;

public class DepartamentoInvestig extends Instituto {
	private Director director;
	private Set<Proyecto> proyectos;

	public DepartamentoInvestig() {
		
	}
	
	public DepartamentoInvestig(int id, String nombre, Set<Edificio> edificio, Set<Personal> personal, Director director, Set<Proyecto> proyectos) {
		super(id, nombre, edificio, personal);
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
