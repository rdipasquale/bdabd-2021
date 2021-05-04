package ar.edu.uca.oltp.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class StockRecursoDeBiblioteca {
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE , generator = "StockRDB_SEQ")
	private int id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinTable(
			name = "STOCK_RECURSO", 
			joinColumns = @JoinColumn(name="ID_RDB"),
			inverseJoinColumns = @JoinColumn(name="ID_STOCK_RDB",nullable=false))
	private RecursoDeBiblioteca recurso;
	
	private int cantidad;
	
	public StockRecursoDeBiblioteca() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public RecursoDeBiblioteca getRecurso() {
		return recurso;
	}
	public void setRecurso(RecursoDeBiblioteca recurso) {
		this.recurso = recurso;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
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
		StockRecursoDeBiblioteca other = (StockRecursoDeBiblioteca) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
