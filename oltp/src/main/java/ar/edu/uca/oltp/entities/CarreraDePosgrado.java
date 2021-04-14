package ar.edu.uca.oltp.entities;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class CarreraDePosgrado extends Carrera{

    public CarreraDePosgrado(int id_carrera, String nombre, List<Materia> materias) {
        super(id_carrera, nombre, materias);
    }

}
