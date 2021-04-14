package ar.edu.uca.oltp.entities;

import javax.persistence.Entity;

@Entity
public class Investigador extends Personal{

    public Investigador(String nombre) {
        this.nombre = nombre;
    }

}
