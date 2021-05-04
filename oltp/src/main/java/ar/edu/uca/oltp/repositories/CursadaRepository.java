package ar.edu.uca.oltp.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import ar.edu.uca.oltp.entities.Cursada;
import ar.edu.uca.oltp.entities.Materia;

@Transactional
public interface CursadaRepository extends CrudRepository<Cursada,Integer> {
	
	//@Cacheable("basicCache")
	public List<Cursada> findByComisionMateria(Materia materia);
}
