package ar.edu.uca.oltp.repositories;

import java.util.List;

import javax.transaction.Transactional;

import ar.edu.uca.oltp.entities.InscripcionMateria;
import ar.edu.uca.oltp.entities.Alumno;

import org.springframework.data.repository.CrudRepository;



@Transactional
public interface InscripcionMateriaRepository extends CrudRepository<InscripcionMateria, Integer>{

	List<Alumno> findAllInscriptos(Integer materia_id);

	
}