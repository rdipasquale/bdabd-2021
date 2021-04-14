package ar.edu.uca.oltp.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cursada {
	
	
	@Id
	private int idCursada;
	private Date anio;
	private int cuatrimestre;
	private List<Docente> docentes;
	private Aula aula;
	private Comision comision;
	private Cronograma cronograma;
	
	
	public Cursada() {
		super();
	}


	public int getIdCursada() {
		return idCursada;
	}


	public void setIdCursada(int idCursada) {
		this.idCursada = idCursada;
	}


	public Date getAnio() {
		return anio;
	}


	public void setAnio(Date anio) {
		this.anio = anio;
	}


	public int getCuatrimestre() {
		return cuatrimestre;
	}


	public void setCuatrimestre(int cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}


	public List<Docente> getDocentes() {
		return docentes;
	}


	public void setDocentes(List<Docente> docentes) {
		this.docentes = docentes;
	}


	public Aula getAula() {
		return aula;
	}


	public void setAula(Aula aula) {
		this.aula = aula;
	}


	public Comision getComision() {
		return comision;
	}


	public void setComision(Comision comision) {
		this.comision = comision;
	}


	public Cronograma getCronograma() {
		return cronograma;
	}


	public void setCronograma(Cronograma cronograma) {
		this.cronograma = cronograma;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anio == null) ? 0 : anio.hashCode());
		result = prime * result + ((comision == null) ? 0 : comision.hashCode());
		result = prime * result + ((cronograma == null) ? 0 : cronograma.hashCode());
		result = prime * result + cuatrimestre;
		result = prime * result + idCursada;
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
		Cursada other = (Cursada) obj;
		if (anio == null) {
			if (other.anio != null)
				return false;
		} else if (!anio.equals(other.anio))
			return false;
		if (comision == null) {
			if (other.comision != null)
				return false;
		} else if (!comision.equals(other.comision))
			return false;
		if (cronograma == null) {
			if (other.cronograma != null)
				return false;
		} else if (!cronograma.equals(other.cronograma))
			return false;
		if (cuatrimestre != other.cuatrimestre)
			return false;
		if (idCursada != other.idCursada)
			return false;
		return true;
	}
	
	
	
	
}
