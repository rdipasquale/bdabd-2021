package ar.edu.uca.oltp.entities;
import javax.persistence.*;
import java.util.List;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "PLAN")
public class Plan {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="CARRERA_SEQ")
    @Column(updatable = false, nullable = false)
    private int id_plan;

    private Date fechaDeCreacion;

    @OneToMany( mappedBy = "plan",
                cascade = CascadeType.ALL,
                orphanRemoval = true
    )
    public List<Materia> materias;

    public Plan(int id_plan, Date fechaDeCreacion, List<Materia> materias) {
        this.id_plan = id_plan;
        this.fechaDeCreacion = fechaDeCreacion;
        this.materias = materias;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public int getId_plan() {
        return id_plan;
    }

    public void setId_plan(int id_plan) {
        this.id_plan = id_plan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plan plan = (Plan) o;
        return getId_plan() == plan.getId_plan();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId_plan(), getFechaDeCreacion(), getMaterias());
    }
}
