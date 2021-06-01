package ar.edu.uca.bases2.mongodomain.entities;

import java.util.Date;
import java.util.List;

public class HistorialDeDifDeCambioMongo {
	
	private Date fechaDeHistorial;
	
	private List<HistorialDeDifDeCambioDeElementosMongo> elementos;
	
	
	public HistorialDeDifDeCambioMongo() {
	}
	
	
	public Date getFechaDeHistorial() {
		return fechaDeHistorial;
	}
	
	
	public void setFechaDeHistorial(Date fechaDeHistorial) {
		this.fechaDeHistorial = fechaDeHistorial;
	}
	
	
	public List<HistorialDeDifDeCambioDeElementosMongo> getElementos() {
		return elementos;
	}
	
	
	public void setElementos(List<HistorialDeDifDeCambioDeElementosMongo> elementos) {
		this.elementos = elementos;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((elementos == null) ? 0 : elementos.hashCode());
		result = prime * result + ((fechaDeHistorial == null) ? 0 : fechaDeHistorial.hashCode());
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
		HistorialDeDifDeCambioMongo other = (HistorialDeDifDeCambioMongo) obj;
		if (elementos == null) {
			if (other.elementos != null)
				return false;
		} else if (!elementos.equals(other.elementos))
			return false;
		if (fechaDeHistorial == null) {
			if (other.fechaDeHistorial != null)
				return false;
		} else if (!fechaDeHistorial.equals(other.fechaDeHistorial))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "HistorialDeDifDeCambioMongo [fechaDeHistorial=" + fechaDeHistorial + ", elementos=" + elementos + "]";
	}
}
