package ar.edu.uca.oltp.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import ar.edu.uca.oltp.entities.Cronograma;

@Transactional
public interface CronogramaRepository extends CrudRepository<Cronograma, Integer> {
	
	
	
}
