package ar.edu.uca.oltp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.uca.oltp.entities.Alumno;
import ar.edu.uca.oltp.entities.InscripcionMateria;
import ar.edu.uca.oltp.repositories.InscripcionMateriaRepository;

@Component
@Transactional
public class InscripcionMateriaService {

	  @Autowired
	  private InscripcionMateriaRepository imRepository;
	  
	  public InscripcionMateriaService() {
		// TODO Auto-generated constructor stub
	  }
	  
	  public List<Alumno> findAllInscriptos(Integer materia_id)
	  {
		  return (List<Alumno>)imRepository.findAllInscriptos(materia_id);
	  }
	  

}
