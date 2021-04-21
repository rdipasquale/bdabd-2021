package ar.edu.uca.oltp.entities;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("ME")
public class MateriaEspecifica extends Materia{


    public MateriaEspecifica() {
    }

    public MateriaEspecifica(int id_materia, int cargaHoraria, int cantHoras, String nombre,String M_TYPE) {
        super(id_materia, cargaHoraria, cantHoras, nombre,M_TYPE);
    }
}
