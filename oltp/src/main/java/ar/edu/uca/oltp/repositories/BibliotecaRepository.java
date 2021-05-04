package ar.edu.uca.oltp.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import ar.edu.uca.oltp.entities.Biblioteca;

@Transactional
public interface BibliotecaRepository extends CrudRepository<Biblioteca, Integer>{

}

