package ar.edu.uca.oltp.entities;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class CarreraDeGrado extends Carrera{

    public CarreraDeGrado(int id_carrera, String nombre, List<Materia> materias) {
        super(id_carrera, nombre, materias);
    }
}
