package ar.edu.uca.oltp.entities;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class MateriaEspecifica extends Materia{

    //private int id_materiaEspecifica;


    public MateriaEspecifica() {
    }

    public MateriaEspecifica(int id_materia, int cargaHoraria, int cantHoras, String nombre,String M_TYPE) {
        super(id_materia, cargaHoraria, cantHoras, nombre,M_TYPE);
    }
}
