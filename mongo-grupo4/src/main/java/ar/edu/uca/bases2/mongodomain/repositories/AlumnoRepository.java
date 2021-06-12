package ar.edu.uca.bases2.mongodomain.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import ar.edu.uca.bases2.mongodomain.entities.Alumno;

public interface AlumnoRepository extends MongoRepository<Alumno, Integer> {
	public Alumno findByNombre(String nombre);
}
