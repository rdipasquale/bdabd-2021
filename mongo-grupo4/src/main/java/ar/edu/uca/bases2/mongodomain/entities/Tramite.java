package ar.edu.uca.bases2.mongodomain.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Tramite {
	@Id
	private int id;
	protected EstadoTramite estado;
	private Date fechaInicio;
	protected Date fechaCierre;
	
}
