package ar.edu.uca.bases2.mongodomain.entities;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import ar.edu.uca.bases2.mongodomain.valueObjects.EstadoTramite;


@Document
public class InscripcionMateria extends Tramite {
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
