package ar.edu.uca.oltp.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Tramite")
public class Tramite {
	public Tramite(int id, int estado, Date fechaInicio, Date fechaCierre) {
		super();
		this.id = id;
		this.estado = estado;
		this.fechaInicio = fechaInicio;
		this.fechaCierre = fechaCierre;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRAMITE_SEQ")
	private int id; //es el numeroDeTramite
	private int estado;
	@Column(name="FECHA_INICIO")
	private Date fechaInicio;
	@Column(name="FECHA_CIERRE")
	private Date fechaCierre;
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaCierre() {
		return fechaCierre;
	}
	public void setFechaCierre(Date fechaCierre) {
		this.fechaCierre = fechaCierre;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + estado;
		result = prime * result + ((fechaCierre == null) ? 0 : fechaCierre.hashCode());
		result = prime * result + ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
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
		Tramite other = (Tramite) obj;
		if (estado != other.estado)
			return false;
		if (fechaCierre == null) {
			if (other.fechaCierre != null)
				return false;
		} else if (!fechaCierre.equals(other.fechaCierre))
			return false;
		if (fechaInicio == null) {
			if (other.fechaInicio != null)
				return false;
		} else if (!fechaInicio.equals(other.fechaInicio))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
}
