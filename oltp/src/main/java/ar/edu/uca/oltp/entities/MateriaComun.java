package ar.edu.uca.oltp.entities;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class MateriaComun extends Materia{


    public MateriaComun(int id_materia, int cargaHoraria, Date cantHoras, String nombre) {
        super(id_materia, cargaHoraria, cantHoras, nombre);
    }
}
