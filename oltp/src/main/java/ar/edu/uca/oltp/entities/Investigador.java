package ar.edu.uca.oltp.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@DiscriminatorValue("INVESTIGADOR")
public class Investigador extends Personal{
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="INVESTIGADOR_SEQ")
    private int id;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Investigador)) return false;
        if (!super.equals(o)) return false;
        Investigador that = (Investigador) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId());
    }

    public Investigador(String nombre) {
        this.nombre = nombre;
    }

}
