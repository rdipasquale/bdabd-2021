package ar.edu.uca.bases2.mongodomain.entities;


import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class MateriaComun extends Materia{

	public MateriaComun() {
		super();
	}
    public MateriaComun(String idMateria, int cargaHoraria, int cantHoras, String nombre) {
    	super(idMateria,cargaHoraria,cantHoras,nombre);
    }


}
