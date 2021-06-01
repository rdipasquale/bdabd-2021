package ar.edu.uca.bases2.mongodomain.entities;


public class HistorialDeDifDeCambioDeElementosMongo {
	
	private String direccion;

	private Boolean estado;

    private Object base;

    private Object modificado;

    
    public HistorialDeDifDeCambioDeElementosMongo() {
	}

    
    public String getDireccion() {
		return direccion;
	}

    
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	public Boolean getEstado() {
		return estado;
	}
	

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	

	public Object getBase() {
		return base;
	}

	
	public void setBase(Object base) {
		this.base = base;
	}

	
	public Object getModificado() {
		return modificado;
	}

	
	public void setModificado(Object modificado) {
		this.modificado = modificado;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((base == null) ? 0 : base.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((modificado == null) ? 0 : modificado.hashCode());
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
		HistorialDeDifDeCambioDeElementosMongo other = (HistorialDeDifDeCambioDeElementosMongo) obj;
		if (base == null) {
			if (other.base != null)
				return false;
		} else if (!base.equals(other.base))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (modificado == null) {
			if (other.modificado != null)
				return false;
		} else if (!modificado.equals(other.modificado))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "HistorialDeDifDeCambioDeElementosMongo [direccion=" + direccion + ", estado=" + estado + ", base="
				+ base + ", modificado=" + modificado + "]";
	}
}
