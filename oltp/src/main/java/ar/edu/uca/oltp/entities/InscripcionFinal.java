package ar.edu.uca.oltp.entities;

import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="InscripcionFinal")
public class InscripcionFinal {
	public InscripcionFinal(Alumno alumno, MesaDeFinal mesaDeFinal) {
		super();
		this.alumno = alumno;
		this.mesaDeFinal = mesaDeFinal;
	}
	@JoinColumn(name="ALUMNO_ID", nullable = false)
	private Alumno alumno;
	@Column(name="MESA_DE_FINAL")
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
