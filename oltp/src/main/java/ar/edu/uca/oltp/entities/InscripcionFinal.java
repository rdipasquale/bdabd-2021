package ar.edu.uca.oltp.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ar.edu.uca.oltp.valueObjects.EstadoTramite;
@Entity
@Table(name="InscripcionFinal")
public class InscripcionFinal extends Tramite {
	public InscripcionFinal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InscripcionFinal(EstadoTramite estado, Date fechaInicio, Date fechaCierre) {
		super(estado, fechaInicio, fechaCierre);
		// TODO Auto-generated constructor stub
	}
	@ManyToOne
	@JoinColumn(name="ALUMNO_ID", nullable = false)
	private Alumno alumno;

	@ManyToOne
	@JoinColumn(name="MESA_DE_FINAL", nullable = false)
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
