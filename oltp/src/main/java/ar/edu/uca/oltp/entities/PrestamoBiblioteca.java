package ar.edu.uca.oltp.entities;

import javax.persistence.JoinColumn;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import ar.edu.uca.oltp.valueObjects.EstadoTramite;
@Entity
@Table(name="PrestamoBiblioteca")
public class PrestamoBiblioteca extends Tramite{
	public PrestamoBiblioteca() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PrestamoBiblioteca(EstadoTramite estado, Date fechaInicio, Date fechaCierre) {
		super(estado, fechaInicio, fechaCierre);
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
	
}
