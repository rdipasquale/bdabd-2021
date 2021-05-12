package ar.edu.uca.oltp.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import ar.edu.uca.oltp.valueObjects.EstadoTramite;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name="Tramite")
public abstract class Tramite {
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
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRAMITE_SEQ")
	private int id; //es el numeroDeTramite
	protected EstadoTramite estado;
	@Column(name="FECHA_INICIO")
	private Date fechaInicio;
	@Column(name="FECHA_CIERRE")
	protected Date fechaCierre;
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	
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
	public int alumnosPorComision(Comision comision) { //HACER METODO
		return 1;
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
