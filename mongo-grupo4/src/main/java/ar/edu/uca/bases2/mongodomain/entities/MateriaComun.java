package ar.edu.uca.bases2.mongodomain.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class MateriaComun extends Materia {
	public MateriaComun() {
		super();
	}
    public MateriaComun(int idMateria, int cargaHoraria, int cantHoras, String nombre) {
    	super(idMateria,cargaHoraria,cantHoras,nombre);
    }
}
