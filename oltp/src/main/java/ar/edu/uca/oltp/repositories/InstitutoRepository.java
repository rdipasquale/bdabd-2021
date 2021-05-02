package ar.edu.uca.oltp.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import ar.edu.uca.oltp.entities.Instituto;

@Transactional
public interface InstitutoRepository extends CrudRepository<Instituto, Integer>{

}
