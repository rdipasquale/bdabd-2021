package ar.edu.uca.oltp.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import ar.edu.uca.oltp.entities.Tramite;



@Transactional
public interface TramiteRepository extends CrudRepository<Tramite, Integer>{
	
	
}