package ar.edu.uca.batch.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//**//
import javax.persistence.Table;
@Entity
@Table(name="Nota")
public class Nota {
	public Nota(Date fecha, int calificacion, Alumno alumno,Docente correctordocente) {	
		this.fecha=fecha;
		this.calificacion=calificacion;
		this.alumno=alumno;
		this.corrector=correctordocente;
	}
	public Nota() {
	}
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="NOTA_SEQ")
	private int id;
	private Date fecha;
	private int calificacion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_ALUMNO",nullable=false)
	private Alumno alumno;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_CORRECTOR",nullable=false)
	private Docente corrector;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="ID_MESADEFINAL",nullable=true)
	private MesaDeFinal mesaFinal;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="ID_CURSADA",nullable=true)
	private Cursada cursada;
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
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
