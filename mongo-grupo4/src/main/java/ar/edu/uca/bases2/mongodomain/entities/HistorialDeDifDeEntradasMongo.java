package ar.edu.uca.bases2.mongodomain.entities;

import java.util.List;

public class HistorialDeDifDeEntradasMongo {
	
    private String id;

    private String objectId;

    private Object originalObject;

    private List<HistorialDeDifDeCambioMongo> diferencias;

    private boolean eliminado;

    
	public HistorialDeDifDeEntradasMongo() {
	}
	

	public String getId() {
		return id;
	}

	
	public void setId(String id) {
		this.id = id;
	}

	
	public String getObjectId() {
		return objectId;
	}

	
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	
	public Object getOriginalObject() {
		return originalObject;
	}

	
	public void setOriginalObject(Object originalObject) {
		this.originalObject = originalObject;
	}

	
	public List<HistorialDeDifDeCambioMongo> getDiferencias() {
		return diferencias;
	}

	
	public void setDiferencias(List<HistorialDeDifDeCambioMongo> diferencias) {
		this.diferencias = diferencias;
	}

	
	public boolean isEliminado() {
		return eliminado;
	}

	
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diferencias == null) ? 0 : diferencias.hashCode());
		result = prime * result + (eliminado ? 1231 : 1237);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((objectId == null) ? 0 : objectId.hashCode());
		result = prime * result + ((originalObject == null) ? 0 : originalObject.hashCode());
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
		HistorialDeDifDeEntradasMongo other = (HistorialDeDifDeEntradasMongo) obj;
		if (diferencias == null) {
			if (other.diferencias != null)
				return false;
		} else if (!diferencias.equals(other.diferencias))
			return false;
		if (eliminado != other.eliminado)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (objectId == null) {
			if (other.objectId != null)
				return false;
		} else if (!objectId.equals(other.objectId))
			return false;
		if (originalObject == null) {
			if (other.originalObject != null)
				return false;
		} else if (!originalObject.equals(other.originalObject))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "HistorialDeDifDeEntradasMongo [id=" + id + ", objectId=" + objectId + ", originalObject="
				+ originalObject + ", diferencias=" + diferencias + ", eliminado=" + eliminado + "]";
	}
}
