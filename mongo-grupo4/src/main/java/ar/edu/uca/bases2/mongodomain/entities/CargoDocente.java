package ar.edu.uca.bases2.mongodomain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CargoDocente {
	public CargoDocente(int id, int categoria) {
		super();
		this.id = id;
		this.categoria = categoria;
	}
	@Id
	private int id;
    private int categoria;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
    
}
