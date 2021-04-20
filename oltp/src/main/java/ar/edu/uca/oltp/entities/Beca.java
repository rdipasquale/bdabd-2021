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
public class Beca {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BECA_SEQ")
	private int id;
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "ALUMNO_ID", nullable = false)
	private Alumno alumno;
	private Date fechaVencimiento;
	
	public Beca() {
		
	}
	

	@Override
	public String toString() {
		return "Beca [id=" + id + ", alumno=" + alumno + ", fechaVencimiento=" + fechaVencimiento + "]";
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public Alumno getAlumno() {
		return alumno;
	}


	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}


	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
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
		Beca other = (Beca) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
	

}
