package ar.edu.uca.oltp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.uca.oltp.entities.Alumno;
import ar.edu.uca.oltp.entities.Comision;
import ar.edu.uca.oltp.entities.InscripcionMateria;
import ar.edu.uca.oltp.entities.Materia;
import ar.edu.uca.oltp.repositories.InscripcionMateriaRepository;

@Component
@Transactional
public class InscripcionMateriaService {

	  @Autowired
	  private InscripcionMateriaRepository imRepository;
	  
	  public InscripcionMateriaService() {
	  }
	  
	  public InscripcionMateria crearInscripcion(Alumno alumno, Materia materia, Comision comision) {
		  return imRepository. crearInscripcion(alumno, materia, comision);
	  }
	  
	  public void borrarInscripcion(InscripcionMateria inscripcion) {
		  imRepository.borrarInscripcion(inscripcion);
	  }
	  
	  public List<Alumno> buscarTodosLosInscriptosPorMateriaId(Integer materiaId)
	  {
		  return imRepository.buscarTodosLosInscriptosPorMateriaId(materiaId);
	  }

	  public List<InscripcionMateria> buscarTodasLasInscripcionesPorAlumnoId(Integer alumnoId) {
		  return imRepository.buscarTodasLasInscripcionesPorAlumnoId(alumnoId);
	  }
}
