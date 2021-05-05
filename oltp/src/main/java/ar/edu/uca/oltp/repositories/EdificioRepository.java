package ar.edu.uca.oltp.repositories;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import ar.edu.uca.oltp.entities.Edificio;


@Transactional
public interface EdificioRepository extends CrudRepository<Edificio, Integer>{
	
	public Edificio findByNombre(String nombre) ;


}
