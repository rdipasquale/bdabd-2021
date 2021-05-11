package ar.edu.uca.oltp.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ar.edu.uca.oltp.valueObjects.EstadoTramite;
@Entity
@Table(name="PrestamoBiblioteca")
public class PrestamoBiblioteca extends Tramite{
	public PrestamoBiblioteca() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PrestamoBiblioteca(EstadoTramite estado, Date fechaInicio, Date fechaCierre, Alumno alumno,
			List<RecursoDeBiblioteca> recursos) {
		super(estado, fechaInicio, fechaCierre);
		this.alumno = alumno;
		this.recursos = recursos;
	}

	@ManyToOne
	@JoinColumn(name="ALUMNO_ID", nullable = false)
	private Alumno alumno;
	@ManyToMany
	@JoinTable(name="PRESTAMO_RECURSO",
	joinColumns= @JoinColumn(name="PRESTAMO_ID"),
	inverseJoinColumns= @JoinColumn(name="RECURSO_ID"))
	private List<RecursoDeBiblioteca> recursos;
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public List<RecursoDeBiblioteca> getRecursos() {
		return recursos;
	}
	public void setRecursos(List<RecursoDeBiblioteca> recursos) {
		this.recursos = recursos;
	}
	
	
}
