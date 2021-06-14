package ar.edu.uca.bases2.mongodomain.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class AlumnoV2 extends Alumno{
	private String mail;
	private int schema_version;
	
	public AlumnoV2() {
		super();
	}
	public AlumnoV2(String nombre, String mail ) {
		super(nombre);
		this.setMail(mail);
		this.schema_version = 2;
	}
	public int getSchema_version() {
		return schema_version;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
}
