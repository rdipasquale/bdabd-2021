package ar.edu.uca.oltp.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Beca {
	
	@Id
	private int id;
	//Agragar mappeo
	private int idAlumno;
	private Date fechaVencimiento;
	
	public Beca() {
		
	}
	

	@Override
	public String toString() {
		return "Beca [id=" + id + ", idAlumno=" + idAlumno + ", fechaVencimiento=" + fechaVencimiento + "]";
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
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
