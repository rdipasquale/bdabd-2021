package ar.edu.uca.oltp.entities;

import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="PrestamoBiblioteca")
public class PrestamoBiblioteca {
	public PrestamoBiblioteca(Alumno alumno, RecursoDeBiblioteca recurso) {
		super();
		this.alumno = alumno;
		this.recurso = recurso;
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
}
