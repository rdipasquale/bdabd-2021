package ar.edu.uca.oltp.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;



@Entity
public class MesaDeFinal {
@Id

@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="MESAFINAL_SEQ")
    private int id_mesa;
    private ArrayList<Materia> materias = new ArrayList<>();

    private Date fecha;
    //private Nota nota;


    public MesaDeFinal() {
    }

    public MesaDeFinal(int id_mesa, ArrayList<Materia> materias, Date fecha) {
        this.id_mesa = id_mesa;
        this.materias = materias;
        this.fecha = fecha;
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public ArrayList<Materia> getmaterias() {
        return materias;
    }

    public void setM(ArrayList<Materia> materias) {
        this.materias = materias;
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
                ", materias=" + materias +
                ", fecha=" + fecha +
                '}';
    }
}
