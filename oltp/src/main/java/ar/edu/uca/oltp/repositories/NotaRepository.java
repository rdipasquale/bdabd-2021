package ar.edu.uca.oltp.repositories;

import ar.edu.uca.oltp.entities.Alumno;
import ar.edu.uca.oltp.entities.Docente;
import ar.edu.uca.oltp.entities.Nota;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;


@Transactional
public interface NotaRepository extends CrudRepository<Nota, Integer>{

	List<Nota> findByAlumno(Alumno alumno);
	
	List<Nota> findByDocente(Docente docente);
	
	List<Nota> findByFecha(Date fecha);
	
	Nota findById(int id);
	
	long count();
	
	long countByDocenteAndFecha(Docente docente,Date fecha);
	
	long countByDocenteAndAlumno(Docente docente,Alumno alumno);
	
	void delete(Nota nota);
	
	void deleteById(int id);
	
	void deleteAll();
	
	void deleteAllByFecha(Date fecha);
	
	List<Nota> removeByAlumno(Alumno alumno);
	
	boolean existsById(int id);
	
	boolean existsByAlumnoAndCalificacion(Alumno alumno,int calificacion);
	
	List<Nota> findAll();
	
	List<Nota> findAllByOrderByIdAsc();
	
}
