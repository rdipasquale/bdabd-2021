package ar.edu.uca.oltp.entities;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorColumn( name = "RECIBO_DE_SUELDO")
public class ReciboDeSueldo {
	
	@Id
	private int id;
	private Date fecha;
	private double remuneracion;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "ID_PERSONAL", nullable = false)
	private Personal personal;
	
	public ReciboDeSueldo(int id, Date fecha, double remuneracion, Personal personal) {
		this.id = id;
		this.fecha = fecha;
		this.remuneracion = remuneracion;
		this.personal = personal;
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
	public double getRemuneracion() {
		return remuneracion;
	}
	public void setRemuneracion(double remuneracion) {
		this.remuneracion = remuneracion;
	}
	public Personal getPersonal() {
		return personal;
	}
	public void setIdPersonal(Personal personal) {
		this.personal = personal;
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
		ReciboDeSueldo other = (ReciboDeSueldo) obj;
		if (id != other.id)
			return false;
		return true;
	}	
}