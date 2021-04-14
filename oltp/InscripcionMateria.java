package ar.edu.uca.oltp.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="InscripcionMateria")
public class InscripcionMateria {
	public InscripcionMateria(Alumno alumno, Materia materia, Comision comision) {
		super();
		this.alumno = alumno;
		this.materia = materia;
		this.comision = comision;
	}
	//Agregar mappeo
	private Alumno alumno;
	private Materia materia;
	private Comision comision;
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public Comision getComision() {
		return comision;
	}
	public void setComision(Comision comision) {
		this.comision = comision;
	}
}
