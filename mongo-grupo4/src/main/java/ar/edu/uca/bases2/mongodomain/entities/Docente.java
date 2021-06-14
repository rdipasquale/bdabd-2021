package ar.edu.uca.bases2.mongodomain.entities;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Docente {
	@Id
	private String id;
    private String nombre;
    private CargoDocente cargo;
    
    public Docente(CargoDocente cargo) {
        this.cargo = cargo;
    }

    public CargoDocente getCargo() {
        return cargo;
    }

    public void setCargo(CargoDocente cargo) {
        this.cargo = cargo;
    }
    

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), getNombre(), getCargo());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Docente)) return false;
        Docente docente = (Docente) o;
        return getCargo() == docente.getCargo();
    }


    @Override
    public String toString() {
        return "Docente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cargo=" + cargo +
                '}';
    }
}
