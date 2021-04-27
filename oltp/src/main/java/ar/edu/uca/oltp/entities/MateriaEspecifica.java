package ar.edu.uca.oltp.entities;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("ME")
public class MateriaEspecifica extends Materia{


    public MateriaEspecifica() {
    }

    public MateriaEspecifica(int idMateria, int cargaHoraria, int cantHoras, String nombre,String mType) {
        super(idMateria, cargaHoraria, cantHoras, nombre,mType);
    }
}
