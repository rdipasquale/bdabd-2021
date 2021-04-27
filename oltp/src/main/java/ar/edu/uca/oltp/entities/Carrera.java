package ar.edu.uca.oltp.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Inheritance
@Table(name = "CARRERA")
@DiscriminatorColumn(name = "TIPO_CARRERA")
abstract public class Carrera {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="CARRERA_SEQ")
    @Column(updatable = false, nullable = false)
    private int id_carrera;
    private String nombre;
    private Plan plan;

    public Carrera(int id_carrera, String nombre, Plan plan, String tipoCarrera) {
        this.id_carrera = id_carrera;
        this.nombre = nombre;
        this.plan = plan;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
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
        return Objects.hash(getId_carrera(), getNombre(), getPlan());
    }
}
