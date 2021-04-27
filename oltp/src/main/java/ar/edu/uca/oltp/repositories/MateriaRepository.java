package ar.edu.uca.oltp.repositories;

import javax.transaction.Transactional;

import ar.edu.uca.oltp.entities.Materia;
import org.springframework.data.repository.CrudRepository;



@Transactional
public interface MateriaRepository extends CrudRepository<Materia, Integer>{

}