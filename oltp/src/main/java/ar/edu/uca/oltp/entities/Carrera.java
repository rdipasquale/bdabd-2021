package ar.edu.uca.oltp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.Objects;

@Entity
abstract public class Carrera {

    @Id
    private int id_carrera;
    public List<Materia> materias;
    private String nombre;

    public Carrera(int id_carrera, String nombre, List<Materia> materias) {
        this.id_carrera = id_carrera;
        this.nombre = nombre;
        this.materias = materias;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_carrera() {
        return id_carrera;
    }

    public void setId_carrera(int id_carrera) {
        this.id_carrera = id_carrera;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carrera carrera = (Carrera) o;
        return getId_carrera() == carrera.getId_carrera();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId_carrera(), getMaterias(), getNombre());
    }
}
