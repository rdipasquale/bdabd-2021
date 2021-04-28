package ar.edu.uca.oltp.entities;
import java.util.Date;
import java.util.Objects;
import javax.persistence.*;
import javax.persistence.ManyToOne;



@Entity
public class MesaDeFinal {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="MESAFINAL_SEQ")
    private int idMesa;
	
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "idMateria")
	private Materia materia;
    private Date fecha;
    private Nota nota;


    public MesaDeFinal() {
    }

    public MesaDeFinal(int idMesa, Materia materia, Date fecha, Nota nota) {
        this.idMesa = idMesa;
        this.materia = materia;
        this.fecha = fecha;
        this.nota = nota;
    }



    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public Materia getmateria() {
        return materia;
    }

    public void setM(Materia materia) {
        this.materia = materia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MesaDeFinal that = (MesaDeFinal) o;
        return idMesa == that.idMesa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMesa);
    }

    @Override
    public String toString() {
        return "MesaDeFinal{" +
                "idMesa=" + idMesa +
                ", materia=" + materia +
                ", fecha=" + fecha +
                ", nota=" + nota +
                '}';
    }
}
