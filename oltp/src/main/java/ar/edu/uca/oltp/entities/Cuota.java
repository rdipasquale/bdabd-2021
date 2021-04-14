package ar.edu.uca.oltp.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cuota {

	@Id
	private int id;
	//Agregar mappeo
	private Alumno idAlumno;
	private Date fecha;
	private double importe;
	private int estado; //1 = pagada; 0 = falta pagar
	
	public Cuota() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Alumno getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Alumno idAlumno) {
		this.idAlumno = idAlumno;
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
		result = prime * result + estado;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + id;
		result = prime * result + ((idAlumno == null) ? 0 : idAlumno.hashCode());
		long temp;
		temp = Double.doubleToLongBits(importe);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (estado != other.estado)
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id != other.id)
			return false;
		if (idAlumno == null) {
			if (other.idAlumno != null)
				return false;
		} else if (!idAlumno.equals(other.idAlumno))
			return false;
		if (Double.doubleToLongBits(importe) != Double.doubleToLongBits(other.importe))
			return false;
		return true;
	}
	
	
	
}
