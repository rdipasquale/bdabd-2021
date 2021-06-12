package ar.edu.uca.bases2.mongodomain.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.uca.bases2.mongodomain.entities.Alumno;
import ar.edu.uca.bases2.mongodomain.entities.Comision;
import ar.edu.uca.bases2.mongodomain.entities.InscripcionMateria;
import ar.edu.uca.bases2.mongodomain.entities.Materia;
import ar.edu.uca.bases2.mongodomain.exceptions.YaEstaInscriptoException;
import ar.edu.uca.bases2.mongodomain.repositories.InscripcionMateriaRepository;
import ar.edu.uca.bases2.mongodomain.valueObjects.EstadoTramite;

public class InscripcionMateriaService {
	@Autowired
	  private InscripcionMateriaRepository imRepository;
	  
	  public InscripcionMateriaService() {
	  }
	  
	  public InscripcionMateria crearInscripcion(Alumno alumno, Materia materia, Comision comision) {
		
		List<InscripcionMateria> materiasAlumno = this.buscarTodasLasInscripcionesPorAlumno(alumno);
		
		for (InscripcionMateria im: materiasAlumno ) {
			if(materia.equals(im.getMateria()) && comision.equals(im.getComision())) {
				throw new YaEstaInscriptoException(materia, comision);
			}
		}
		InscripcionMateria im = new InscripcionMateria(EstadoTramite.INICIADO, new Date());
		im.setAlumno(alumno);
		im.setComision(comision);
		im.setMateria(materia);
		imRepository.save(im);
		return im;
	  }
	  
	  public void borrarInscripcion(InscripcionMateria inscripcion) {
		  imRepository.delete(inscripcion);
	  }
	  
	  public List<InscripcionMateria> buscarTodosLosInscriptosPorMateria(Materia materia)
	  {
		  return imRepository.findByMateria(materia);
	  }

	  public List<InscripcionMateria> buscarTodasLasInscripcionesPorAlumno(Alumno alumno) {
		  return imRepository.findByAlumno(alumno);
	  }
	  public List<InscripcionMateria> buscarTodasLasInscripcionesPorComision(Comision comision) {
		  return imRepository.findByComision(comision);
	  }

}
