package ar.edu.uca.oltp.repositories;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import ar.edu.uca.oltp.entities.Alumno;
import ar.edu.uca.oltp.entities.Docente;
import ar.edu.uca.oltp.entities.Nota;


@Transactional
public interface NotaRepository extends CrudRepository<Nota, Integer>{

	List<Nota> findByAlumno(Alumno alumno);
	
	List<Nota> findByDocente(Docente docente);
	
	List<Nota> findByFecha(Date fecha);
	
	long countByDocenteAndFecha(Docente docente,Date fecha);
	
	long countByDocenteAndAlumno(Docente docente,Alumno alumno);
	
	void deleteByFecha(Date fecha);
	
	List<Nota> removeByAlumno(Alumno alumno);
	
	boolean existsByAlumnoAndCalificacion(Alumno alumno,int calificacion);
	
	List<Nota> findAllByOrderByIdAsc();
	
}
