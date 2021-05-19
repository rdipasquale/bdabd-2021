package ar.edu.uca.oltp.entities;

import java.util.Date;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyJoinColumn;

@Entity
public class Cursada {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CURSADA_SEQ")
	private int id;
	private Date anio;
	private int cuatrimestre;
	@ManyToMany
	@MapKeyJoinColumn(name = "idCargoDocente")
	@JoinTable(
			name = "CargoDocente_Docente_Cursada",
			joinColumns = @JoinColumn(name = "idCursada"),
			inverseJoinColumns = @JoinColumn(name = "idDocente")
		)
	private Map<CargoDocente, Docente> docentes;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="AULA_ID", nullable=false)
	private Aula aula;
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name= "COMISION_ID", nullable=false)
	private Comision comision;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="CRONOGRAMA_ID", nullable=false)
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

	public int getId() {
		return id;
	}


	public void setId(int id) {
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
		Cursada other = (Cursada) obj;
		if (id != other.id)
			return false;
		return true;
	}


	
	
	
	
}
