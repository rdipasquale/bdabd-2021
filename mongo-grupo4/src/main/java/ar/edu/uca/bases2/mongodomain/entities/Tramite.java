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
	private String id;
	protected EstadoTramite estado;
	private Date fechaInicio;
	protected Date fechaCierre;
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((fechaCierre == null) ? 0 : fechaCierre.hashCode());
		result = prime * result + ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
