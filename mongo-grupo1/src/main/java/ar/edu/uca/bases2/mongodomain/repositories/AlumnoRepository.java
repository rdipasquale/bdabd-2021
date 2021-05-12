package ar.edu.uca.bases2.mongodomain.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ar.edu.uca.bases2.mongodomain.entities.Alumno;

@Repository
public interface AlumnoRepository extends MongoRepository<Alumno, String>{
	
}
