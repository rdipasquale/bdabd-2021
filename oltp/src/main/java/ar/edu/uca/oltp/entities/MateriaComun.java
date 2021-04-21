package ar.edu.uca.oltp.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("MC")
public class MateriaComun extends Materia{


    public MateriaComun(int id_materia, int cargaHoraria, int cantHoras, String nombre, String M_TYPE) {
        super(id_materia, cargaHoraria, cantHoras, nombre,M_TYPE);
    }
}
