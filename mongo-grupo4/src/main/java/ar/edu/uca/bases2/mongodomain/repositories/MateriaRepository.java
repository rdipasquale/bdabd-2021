package ar.edu.uca.bases2.mongodomain.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;

import ar.edu.uca.bases2.mongodomain.entities.Materia;
public interface MateriaRepository extends MongoRepository<Materia, Integer>{
	
}
