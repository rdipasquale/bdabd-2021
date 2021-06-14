package ar.edu.uca.bases2.mongodomain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CargoDocente {
	public CargoDocente(String id, int categoria) {
		super();
		this.id = id;
		this.categoria = categoria;
	}
	@Id
	private String id;
    private int categoria;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
    
}
