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
	
	Proyecto findById(int id);
	
	long count();
	
	long countByDirector(Director director);
	
	void delete(Proyecto proyecto);
	
	void deleteById(int id);
	
	void deleteAll();
	
	List<Proyecto> removeByDirector(Director director);
	
	boolean existsById(int id);
	
	List<Proyecto> findAll();
	
	List<Proyecto> findAllByOrderByIdAsc();
	
}
