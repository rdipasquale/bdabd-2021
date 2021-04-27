package ar.edu.uca.oltp.repositories;

import ar.edu.uca.oltp.entities.Proyecto;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;


@Transactional
public interface ProyectoRepository extends CrudRepository<Proyecto, String>{

}
