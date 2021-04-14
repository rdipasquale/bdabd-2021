package ar.edu.uca.oltp.entities;

public class DepartamentoIngreso extends Instituto {
	private Director director;
	
	public DepartamentoIngreso {
		
	}
	
	public DepartamentoIngreso(int id, String nombre, Set<Edificio> edificio, Set<Personal> personal, Director director) {
		super(id, nombre, edificio, personal);
		this.director = director;
	}
	
	
	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DepartamentoIngreso other = (DepartamentoIngreso) obj;
		if (this.getId() != other.getId())
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Departamento de Ingreso [id=" + this.getId() + ", nombre=" + this.getNombre() + "]";
	}
}
