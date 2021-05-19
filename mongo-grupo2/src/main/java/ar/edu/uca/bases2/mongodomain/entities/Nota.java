package ar.edu.uca.bases2.mongodomain.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document
public class Nota {
	public Nota(Date fecha, int calificacion,Docente correctordocente) {	
		this.fecha=fecha;
		this.calificacion=calificacion;
		this.corrector=correctordocente;
	}
	public Nota() {
	}
	@Id
	private String id;
	private Date fecha;
	private int calificacion;
	private Docente corrector;
	private MesaDeFinal mesaFinal;
	private Cursada cursada;
	
	@Override
	public String toString() {
		return "Nota [id=" + id + ", calificacion=" + calificacion + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	
	public Docente getCorrector() {
		return corrector;
	}
	public void setCorrector(Docente corrector) {
		this.corrector = corrector;
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
		Nota other = (Nota) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
}
