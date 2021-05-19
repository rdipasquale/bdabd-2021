package ar.edu.uca.bases2.mongodomain.entities;

import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class MesaDeFinal {
	
	@Id
    private String idMesa;
	private Materia materia;
    private Date fecha;



    public MesaDeFinal() {
    }

    public MesaDeFinal(String idMesa, Materia materia, Date fecha) {
        this.idMesa = idMesa;
        this.materia = materia;
        this.fecha = fecha;

    }



    public String getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(String idMesa) {
        this.idMesa = idMesa;
    }

    public Materia getmateria() {
        return materia;
    }

    public void setM(Materia materia) {
        this.materia = materia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }



   

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMesa == null) ? 0 : idMesa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MesaDeFinal other = (MesaDeFinal) obj;
		if (idMesa == null) {
			if (other.idMesa != null)
				return false;
		} else if (!idMesa.equals(other.idMesa))
			return false;
		return true;
	}

	@Override
    public String toString() {
        return "MesaDeFinal{" +
                "idMesa=" + idMesa +
                ", materia=" + materia +
                ", fecha=" + fecha +
                '}';
    }
}