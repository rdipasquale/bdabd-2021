package ar.edu.uca.bases2.mongodomain.entities;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class MateriaEspecifica extends Materia{
	public MateriaEspecifica() {
		super();
	}
    public MateriaEspecifica(String idMateria, int cargaHoraria, int cantHoras, String nombre) {
    	super(idMateria,cargaHoraria,cantHoras,nombre);
    }


}
