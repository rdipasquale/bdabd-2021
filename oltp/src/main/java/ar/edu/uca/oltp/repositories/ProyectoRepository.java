package ar.edu.uca.oltp.repositories;

import ar.edu.uca.oltp.entities.Carrera;
import ar.edu.uca.oltp.entities.Director;
import ar.edu.uca.oltp.entities.Proyecto;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;


@Transactional
public interface ProyectoRepository extends CrudRepository<Proyecto, Integer>{

	List<Proyecto> findByDirector(Director director);
	List<Proyecto> findByCarrera(Carrera carrera);
	
	
	long countByDirector(Director director);
	
	
	List<Proyecto> removeByDirector(Director director);
	
	
	List<Proyecto> findAllByOrderByIdAsc();
	
}
