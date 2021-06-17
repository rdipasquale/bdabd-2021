package ar.edu.uca.bases2.mongodomain.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ar.edu.uca.bases2.mongodomain.entities.Edificio;
import ar.edu.uca.bases2.mongodomain.entities.Instituto;

@Repository
public interface EdificioRepository extends MongoRepository<Edificio, Integer>{

	Edificio findByDireccion(String direccion);
	
	
	Edificio findByNombre(String nombre);
	
	Edificio findByInstituto(Instituto instituto);
}
