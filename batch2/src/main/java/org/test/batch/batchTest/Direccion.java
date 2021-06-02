package org.test.batch.batchTest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Direccion {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DIRECCION_SEQ")
	private int id;
	private String calle;
	private Integer altura;
	private Integer codigoPostal;
	private Integer piso;
	private String depto;
	
	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", altura=" + altura + ", codigoPostal=" + codigoPostal + ", piso=" + piso
				+ ", depto=" + depto + "]";
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public Integer getAltura() {
		return altura;
	}
	public void setAltura(Integer altura) {
		this.altura = altura;
	}
	public Integer getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public Integer getPiso() {
		return piso;
	}
	public void setPiso(Integer piso) {
		this.piso = piso;
	}
	public String getDepto() {
		return depto;
	}
	public void setDepto(String depto) {
		this.depto = depto;
	}
}
