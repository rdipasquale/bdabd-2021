package ar.edu.uca.oltp.repositories;

import ar.edu.uca.oltp.entities.Nota;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;


@Transactional
public interface NotaRepository extends CrudRepository<Nota, Integer>{

}
