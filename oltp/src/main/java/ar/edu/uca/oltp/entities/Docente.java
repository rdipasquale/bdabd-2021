package ar.edu.uca.oltp.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@DiscriminatorValue("DOCENTE")
public class Docente extends Personal{

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="DOCENTE_SEQ")
    private int id;
    private String nombre;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="CARGO_ID", nullable = false)
    private CargoDocente cargo;

    public Docente(CargoDocente cargo) {
        this.cargo = cargo;
    }

    public CargoDocente getCargo() {
        return cargo;
    }

    public void setCargo(CargoDocente cargo) {
        this.cargo = cargo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), getNombre(), getCargo());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Docente)) return false;
        Docente docente = (Docente) o;
        return getCargo() == docente.getCargo();
    }


    @Override
    public String toString() {
        return "Docente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cargo=" + cargo +
                '}';
    }
}