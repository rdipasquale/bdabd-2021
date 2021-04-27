package ar.edu.uca.oltp.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import ar.edu.uca.oltp.entities.Comision;

@Transactional
public interface ComisionRepository extends CrudRepository<Comision, Integer> {
	
	
	
}
