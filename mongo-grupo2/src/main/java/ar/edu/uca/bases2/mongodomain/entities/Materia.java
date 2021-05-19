package ar.edu.uca.bases2.mongodomain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public abstract class Materia {
	@Id
    private String idMateria;
    private int cargaHoraria;
    private int cantHoras;
    private String nombre;
    private Plan plan;

    public Materia() {

    }

    public Materia(String idMateria, int cargaHoraria, int cantHoras, String nombre) {
        this.idMateria = idMateria;
        this.cargaHoraria = cargaHoraria;
        this.cantHoras = cantHoras;
        this.nombre = nombre;
    }



    public String getIdMateria() {
        return idMateria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Plan getPlan() {
    	return plan;
    }
    
    public void setPlan(Plan plan) {
    	this.plan = plan;
    }


    

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMateria == null) ? 0 : idMateria.hashCode());
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
		Materia other = (Materia) obj;
		if (idMateria == null) {
			if (other.idMateria != null)
				return false;
		} else if (!idMateria.equals(other.idMateria))
			return false;
		return true;
	}

	@Override
    public String toString() {
        return "Materia{" +
                "id_materia=" + idMateria +
                ", cargaHoraria=" + cargaHoraria +
                ", cantHoras=" + cantHoras +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

