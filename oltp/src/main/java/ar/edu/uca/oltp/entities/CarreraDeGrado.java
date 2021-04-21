package ar.edu.uca.oltp.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Inheritance
@Table(name = "CARRERA")
@DiscriminatorColumn(name = "TIPO_CARRERA")
public class CarreraDeGrado extends Carrera{

    public CarreraDeGrado(int id_carrera, String nombre, Plan plan, String tipoCarrera) {
        super(id_carrera, nombre, plan, tipoCarrera);
    }
}
