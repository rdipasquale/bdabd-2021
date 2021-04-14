package ar.edu.uca.oltp.entities;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class MesaDeFinal {
@Id
    private int id_mesa;
    private Materia materia;
    private Date fecha;
    //private Nota nota;


    public MesaDeFinal() {
    }

    public MesaDeFinal(int id_mesa, Materia materia, Date fecha) {
        this.id_mesa = id_mesa;
        this.materia = materia;
        this.fecha = fecha;
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MesaDeFinal that = (MesaDeFinal) o;
        return id_mesa == that.id_mesa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_mesa);
    }

    @Override
    public String toString() {
        return "MesaDeFinal{" +
                "id_mesa=" + id_mesa +
                ", materia=" + materia +
                ", fecha=" + fecha +
                '}';
    }
}
