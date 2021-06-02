package ar.edu.uca.batch.entities;


import java.util.Objects;


import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn( name = "M_TYPE")
public abstract class Materia {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MATERIA_SEQ")

    private int idMateria;
    private int cargaHoraria;
    private int cantHoras;
    private String nombre;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(columnDefinition = "PLAN_ID")
    private Plan plan;

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
    
    public Plan getPlan() {
    	return plan;
    }
    
    public void setPlan(Plan plan) {
    	this.plan = plan;
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


