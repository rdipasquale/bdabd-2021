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
		return null;
		  //Validaciones
		  //crear excepciones
		  // y el armado del objeto
		  //hacemos el save y lo devolves
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
