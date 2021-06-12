package ar.edu.uca.bases2.mongodomain.exceptions;

import ar.edu.uca.bases2.mongodomain.entities.Comision;
import ar.edu.uca.bases2.mongodomain.entities.Materia;

public class YaEstaInscriptoException extends RuntimeException {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public YaEstaInscriptoException(Materia materia, Comision comision) {
		super("Usted ya esta inscripto en "+materia.getNombre()+" y comision "+comision.getId());
	}
}
