package ar.edu.uca.oltp.entities;

import ar.edu.uca.oltp.valueObjects.CategoriaDocente;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Docente extends Personal{

    @Id
    private int id;
    private String nombre;
    private CategoriaDocente categoria;

    public Docente(CategoriaDocente categoria) {
        this.categoria = categoria;
    }

    public CategoriaDocente getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDocente categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Docente)) return false;
        Docente docente = (Docente) o;
        return getCategoria() == docente.getCategoria();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCategoria());
    }

    @Override
    public String toString() {
        return "Docente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}