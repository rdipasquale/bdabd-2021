package ar.edu.uca.oltp.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cuota {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUOTA_SEQ")
	private int id;
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "ALUMNO_ID", nullable = false)
	private Alumno alumno;
	private Date fecha;
	private double importe;
	private int estado; 
	
	public Cuota() {
		
	}

	@Override
	public String toString() {
		return "Cuota [id=" + id + ", alumno=" + alumno + ", fecha=" + fecha + ", importe=" + importe + ", estado="
				+ estado + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Alumno getIdAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
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
		Cuota other = (Cuota) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
	
	
}
