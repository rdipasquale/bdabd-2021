package ar.edu.uca.oltp.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="InscripcionFinal")
public class InscripcionFinal {
	public InscripcionFinal(Alumno alumno, MesaDeFinal mesaDeFinal) {
		super();
		this.alumno = alumno;
		this.mesaDeFinal = mesaDeFinal;
	}
	//Agregar mappeo
	private Alumno alumno;
	private MesaDeFinal mesaDeFinal;
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public MesaDeFinal getMesaDeFinal() {
		return mesaDeFinal;
	}
	public void setMesaDeFinal(MesaDeFinal mesaDeFinal) {
		this.mesaDeFinal = mesaDeFinal;
	}
}
