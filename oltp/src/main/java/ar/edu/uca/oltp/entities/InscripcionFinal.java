package ar.edu.uca.oltp.entities;

import javax.persistence.JoinColumn;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="InscripcionFinal")
public class InscripcionFinal extends Tramite {
	public InscripcionFinal(int id, int estado, Date fechaInicio, Date fechaCierre) {
		super(id, estado, fechaInicio, fechaCierre);
		// TODO Auto-generated constructor stub
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alumno == null) ? 0 : alumno.hashCode());
		result = prime * result + ((mesaDeFinal == null) ? 0 : mesaDeFinal.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InscripcionFinal other = (InscripcionFinal) obj;
		if (alumno == null) {
			if (other.alumno != null)
				return false;
		} else if (!alumno.equals(other.alumno))
			return false;
		if (mesaDeFinal == null) {
			if (other.mesaDeFinal != null)
				return false;
		} else if (!mesaDeFinal.equals(other.mesaDeFinal))
			return false;
		return true;
	}
}
