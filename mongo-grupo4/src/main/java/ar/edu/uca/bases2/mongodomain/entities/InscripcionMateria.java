package ar.edu.uca.bases2.mongodomain.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class InscripcionMateria extends Tramite {
	private Alumno alumno;
	private Materia materia;
	private Comision comision;
}
