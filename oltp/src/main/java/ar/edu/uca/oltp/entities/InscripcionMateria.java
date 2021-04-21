package ar.edu.uca.oltp.entities;

import javax.persistence.JoinColumn;
import javax.persistence.Entity;
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
	@JoinColumn(name="ALUMNO_ID", nullable = false)
	private Alumno alumno;
	@JoinColumn(name="MATERIA", nullable = false)
	private Materia materia;
	@JoinColumn(name="COMISION", nullable = false)
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
