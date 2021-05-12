package ar.edu.uca.oltp.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import ar.edu.uca.oltp.entities.Alumno;

@Transactional
public interface AlumnoRepository extends CrudRepository<Alumno, Integer>{
	public Alumno findByNombre(String nombre);
}
