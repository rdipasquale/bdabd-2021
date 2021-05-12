package ar.edu.uca.oltp.entities;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("ME")
public class MateriaEspecifica extends Materia{
	public MateriaEspecifica() {
		super();
	}
    public MateriaEspecifica(int idMateria, int cargaHoraria, int cantHoras, String nombre) {
    	super(idMateria,cargaHoraria,cantHoras,nombre);
    }


}
