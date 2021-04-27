package ar.edu.uca.oltp.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
//**//
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alumno == null) ? 0 : alumno.hashCode());
		result = prime * result + calificacion;
		result = prime * result + ((corrector == null) ? 0 : corrector.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + id;
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
		Nota other = (Nota) obj;
		if (alumno == null) {
			if (other.alumno != null)
				return false;
		} else if (!alumno.equals(other.alumno))
			return false;
		if (calificacion != other.calificacion)
			return false;
		if (corrector == null) {
			if (other.corrector != null)
				return false;
		} else if (!corrector.equals(other.corrector))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
