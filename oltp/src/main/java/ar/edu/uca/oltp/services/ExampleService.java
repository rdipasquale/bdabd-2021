package ar.edu.uca.oltp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.uca.oltp.entities.Alumno;
import ar.edu.uca.oltp.repositories.AlumnoRepository;


@Component
@Transactional
public class ExampleService {

	  @Autowired
	  private AlumnoRepository alumnoRepository;
	  
	  public ExampleService() {
		// TODO Auto-generated constructor stub
	  }
	  
	  public List<Alumno> findAllAlumnos()
	  {
		  return (List<Alumno>)alumnoRepository.findAll();
	  }
	  

}
