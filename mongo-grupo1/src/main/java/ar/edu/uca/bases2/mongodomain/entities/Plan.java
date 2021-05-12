package ar.edu.uca.bases2.mongodomain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Document
public class Plan {

    @Id
    private int idPlan;
    private Date fechaDeCreacion;
    @DBRef
    public List<Materia> materias;

    public int getIdPlan() {
        return idPlan;
    }

    public Plan() {

    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Plan plan = (Plan) object;
        return idPlan == plan.idPlan;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPlan);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Plan{" +
                "idPlan=" + idPlan +
                ", fechaDeCreacion=" + fechaDeCreacion +
                ", materias=" + materias +
                '}';
    }
}