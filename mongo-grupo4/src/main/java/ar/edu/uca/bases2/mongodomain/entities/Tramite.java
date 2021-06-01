package ar.edu.uca.bases2.mongodomain.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import ar.edu.uca.bases2.mongodomain.valueObjects.EstadoTramite;


@Document
public class Tramite {
	public Tramite(EstadoTramite estado, Date fechaInicio, Date fechaCierre) {
		super();
		this.estado = estado;
		this.fechaInicio = fechaInicio;
		this.fechaCierre = fechaCierre;
	}
	public Tramite(EstadoTramite estado, Date fechaInicio) {
		super();
		this.estado = estado;
		this.fechaInicio = fechaInicio;
	}
	public Tramite() {
		
	}
	@Id
	private int id;
	protected EstadoTramite estado;
	private Date fechaInicio;
	protected Date fechaCierre;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public EstadoTramite getEstado() {
		return estado;
	}
	public void setEstado(EstadoTramite estado) {
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
		if (id != other.id)
			return false;
		return true;
	}
	
}
