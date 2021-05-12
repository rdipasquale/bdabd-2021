package ar.edu.uca.bases2.mongodomain.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ar.edu.uca.bases2.mongodomain.entities.Beca;

@Repository
public interface BecaRepository extends MongoRepository<Beca, String>{
	
}
