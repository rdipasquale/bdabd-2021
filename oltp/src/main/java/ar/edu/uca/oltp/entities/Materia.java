package ar.edu.uca.oltp.entities;


import java.util.Objects;


import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn( name = "M_TYPE")
public abstract class Materia {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MATERIA_SEQ")
@OneToMany(
        mappedBy = "ID_MATERIA",
        cascade = CascadeType.ALL,
        orphanRemoval = true
)
    private int id_materia;
    private String M_TYPE;
    private int cargaHoraria;
    private int cantHoras;
    private String nombre;

    public Materia() {

    }

    public Materia(int id_materia, int cargaHoraria, int cantHoras, String nombre, String M_TYPE) {
        this.id_materia = id_materia;
        this.cargaHoraria = cargaHoraria;
        this.cantHoras = cantHoras;
        this.nombre = nombre;
        this.M_TYPE = M_TYPE;
    }

    public String getM_TYPE() {
        return M_TYPE;
    }

    public void setM_TYPE(String m_TYPE) {
        M_TYPE = m_TYPE;
    }

    public int getId_materia() {
        return id_materia;
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

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
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
                ", M_TYPE='" + M_TYPE + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", cantHoras=" + cantHoras +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}


