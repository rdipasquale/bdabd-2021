package ar.edu.uca.oltp.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class MesaDeFinal {
@Id
@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="MESAFINAL_SEQ")
    private int id_mesa;
    private ArrayList<Materia> M = new ArrayList<>();

    private Date fecha;
    //private Nota nota;


    public MesaDeFinal() {
    }

    public MesaDeFinal(int id_mesa, ArrayList<Materia> m, Date fecha) {
        this.id_mesa = id_mesa;
        M = m;
        this.fecha = fecha;
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public ArrayList<Materia> getM() {
        return M;
    }

    public void setM(ArrayList<Materia> m) {
        M = m;
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
                ", M=" + M +
                ", fecha=" + fecha +
                '}';
    }
}
