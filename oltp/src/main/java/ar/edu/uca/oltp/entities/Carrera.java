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
    private Facultad facultad;

    public Carrera() {
		// TODO Auto-generated constructor stub
	}
    
    public Carrera(int id_carrera, String nombre, Plan plan, Facultad facultad, String tipoCarrera) {
        this.id_carrera = id_carrera;
        this.nombre = nombre;
        this.plan = plan;
        this.facultad = facultad;
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
    
    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
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
        return Objects.hash(getId_carrera(), getNombre(), getPlan(), getFacultad());
    }
}
