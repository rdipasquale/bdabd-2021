package ar.edu.uca.oltp.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import ar.edu.uca.oltp.entities.Cuota;

@Transactional
public interface ProyectoRepository extends CrudRepository<Proyecto, String>{

}
