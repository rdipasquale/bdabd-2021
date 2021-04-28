package ar.edu.uca.oltp.entities;

import javax.persistence.JoinColumn;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="PrestamoBiblioteca")
public class PrestamoBiblioteca extends Tramite{
	
	public PrestamoBiblioteca(int id, int estado, Date fechaInicio, Date fechaCierre) {
		super(id, estado, fechaInicio, fechaCierre);
		// TODO Auto-generated constructor stub
	}
	@JoinColumn(name="ALUMNO_ID", nullable = false)
	private Alumno alumno;
	@JoinColumn(name="RECURSOS_DE_BIBLIOTECA", nullable = false)
	private RecursoDeBiblioteca recurso;
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public RecursoDeBiblioteca getRecurso() {
		return recurso;
	}
	public void setRecurso(RecursoDeBiblioteca recurso) {
		this.recurso = recurso;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alumno == null) ? 0 : alumno.hashCode());
		result = prime * result + ((recurso == null) ? 0 : recurso.hashCode());
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
		PrestamoBiblioteca other = (PrestamoBiblioteca) obj;
		if (alumno == null) {
			if (other.alumno != null)
				return false;
		} else if (!alumno.equals(other.alumno))
			return false;
		if (recurso == null) {
			if (other.recurso != null)
				return false;
		} else if (!recurso.equals(other.recurso))
			return false;
		return true;
	}
}
