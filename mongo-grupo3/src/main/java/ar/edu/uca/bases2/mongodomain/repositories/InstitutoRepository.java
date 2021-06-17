package ar.edu.uca.bases2.mongodomain.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ar.edu.uca.bases2.mongodomain.entities.Edificio;
import ar.edu.uca.bases2.mongodomain.entities.Instituto;

@Repository
public interface InstitutoRepository extends MongoRepository<Instituto, Integer>{
	
	List<Instituto> findByEdificio(Edificio edificio);
	
	Instituto findById(int id);
	
	Instituto findByNombre(String nombre);
}
