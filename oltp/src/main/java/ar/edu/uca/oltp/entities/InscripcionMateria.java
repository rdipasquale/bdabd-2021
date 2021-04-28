package ar.edu.uca.oltp.entities;

import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="InscripcionMateria")
public class InscripcionMateria extends Tramite{
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alumno == null) ? 0 : alumno.hashCode());
		result = prime * result + ((comision == null) ? 0 : comision.hashCode());
		result = prime * result + ((materia == null) ? 0 : materia.hashCode());
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
		InscripcionMateria other = (InscripcionMateria) obj;
		if (alumno == null) {
			if (other.alumno != null)
				return false;
		} else if (!alumno.equals(other.alumno))
			return false;
		if (comision == null) {
			if (other.comision != null)
				return false;
		} else if (!comision.equals(other.comision))
			return false;
		if (materia == null) {
			if (other.materia != null)
				return false;
		} else if (!materia.equals(other.materia))
			return false;
		return true;
	}
}
