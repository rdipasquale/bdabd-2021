package ar.edu.uca.bases2.mongodomain.entities;

import java.util.Date;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class Cursada {
	
	
	@Id
	private String id;
	private Date anio;
	private int cuatrimestre;
	
	private Map<CargoDocente, Docente> docentes;
	
	private Aula aula;
	
	
	private Comision comision;
	
	private Cronograma cronograma;
	
	
	public Cursada() {
		super();
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

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Map<CargoDocente, Docente> getDocentes() {
		return docentes;
	}


	public void setDocentes(Map<CargoDocente, Docente> docentes) {
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
	public String toString() {
		return "Cursada [id=" + id + ", anio=" + anio + ", cuatrimestre=" + cuatrimestre + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Cursada other = (Cursada) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	
	
	
	
}
