package ar.edu.uca.oltp.exceptions;

import ar.edu.uca.oltp.entities.Comision;
import ar.edu.uca.oltp.entities.Materia;

public class YaEstaInscriptoException extends RuntimeException {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public YaEstaInscriptoException(Materia materia, Comision comision) {
		super("Usted ya esta inscripto en "+materia.getNombre()+" y comision "+comision.getId());
	}
}
