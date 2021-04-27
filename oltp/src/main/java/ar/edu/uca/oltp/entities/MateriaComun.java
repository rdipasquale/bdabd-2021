package ar.edu.uca.oltp.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("MC")
public class MateriaComun extends Materia{


    public MateriaComun(int idMateria, int cargaHoraria, int cantHoras, String nombre, String mType) {
        super(idMateria, cargaHoraria, cantHoras, nombre,mType);
    }
}
