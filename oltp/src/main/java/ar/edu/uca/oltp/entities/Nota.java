package ar.edu.uca.oltp.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Nota {
	
	@Id
	private int id;
	private Date fecha;
	private int calificacion;
	private Alumno alumno;
	private Docente corrector;
	
	public Nota() {	
	}
	@Override
	public String toString() {
		return "Nota [id=" + id + ", calificacion=" + calificacion + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public Docente getCorrector() {
		return corrector;
	}
	public void setCorrector(Docente corrector) {
		this.corrector = corrector;
	}
	
	
}
