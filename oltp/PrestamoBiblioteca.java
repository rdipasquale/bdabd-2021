package ar.edu.uca.oltp.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="PrestamoBiblioteca")
public class PrestamoBiblioteca {
	public PrestamoBiblioteca(Alumno alumno, RecursoDeBiblioteca recurso) {
		super();
		this.alumno = alumno;
		this.recurso = recurso;
	}
	//Agregar mappeo
	private Alumno alumno;
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
