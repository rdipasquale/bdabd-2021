package ar.edu.uca.bases2.mongodomain.entities;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Materia {
	@Id
    private int idMateria;
    private int cargaHoraria;
    private int cantHoras;
    private String nombre;
    
    public Materia() {

    }

    public Materia(int idMateria, int cargaHoraria, int cantHoras, String nombre) {
        this.idMateria = idMateria;
        this.cargaHoraria = cargaHoraria;
        this.cantHoras = cantHoras;
        this.nombre = nombre;
    }



    public int getIdMateria() {
        return idMateria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setCantHoras(int cantHoras) {
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
        return idMateria == materia.idMateria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMateria);
    }

    @Override
    public String toString() {
        return "Materia{" +
                "id_materia=" + idMateria +
                ", cargaHoraria=" + cargaHoraria +
                ", cantHoras=" + cantHoras +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
