package ar.edu.uca.oltp.entities;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;

import ar.edu.uca.oltp.valueObjects.EstadoTramite;
@Entity
@Table(name="InscripcionMateria")
public class InscripcionMateria extends Tramite{
	public InscripcionMateria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InscripcionMateria(EstadoTramite estado, Date fechaInicio, Date fechaCierre) {
		super(estado, fechaInicio, fechaCierre);
		// TODO Auto-generated constructor stub
	}
	public InscripcionMateria(EstadoTramite estado, Date fechaInicio) {
		super(estado,fechaInicio);
	}
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name="ALUMNO_ID", nullable = false)
	private Alumno alumno;
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name="MATERIA", nullable = false)
	private Materia materia;
	@ManyToOne(cascade = CascadeType.REMOVE)
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
