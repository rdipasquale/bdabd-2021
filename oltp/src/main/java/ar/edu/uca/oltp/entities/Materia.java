package ar.edu.uca.oltp.entities;

import java.util.Date;
import java.util.Objects;


import javax.persistence.Id;
import javax.persistence.Entity;

@Entity

public class Materia {
@Id
    private int id_materia;
    private int cargaHoraria;
    private Date cantHoras;
    private String nombre;

    public Materia() {

    }

    public Materia(int id_materia, int cargaHoraria, Date cantHoras, String nombre) {
        this.id_materia = id_materia;
        this.cargaHoraria = cargaHoraria;
        this.cantHoras = cantHoras;
        this.nombre = nombre;
    }

    public int getId_materia() {
        return id_materia;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Date getCantHoras() {
        return cantHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setCantHoras(Date cantHoras) {
        this.cantHoras = cantHoras;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Materia materia = (Materia) o;
        return id_materia == materia.id_materia;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_materia);
    }

    @Override
    public String toString() {
        return "Materia{" +
                "id_materia=" + id_materia +
                ", cargaHoraria=" + cargaHoraria +
                ", cantHoras=" + cantHoras +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}


