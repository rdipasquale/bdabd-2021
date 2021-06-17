package ar.edu.uca.bases2.mongodomain.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ar.edu.uca.bases2.mongodomain.entities.Biblioteca;
import ar.edu.uca.bases2.mongodomain.entities.Edificio;

@Repository
public interface BibliotecaRepository extends MongoRepository<Biblioteca, Integer>{

	
	Biblioteca findById(int id);
	
	Biblioteca findByNombre(String nombre);
	
	Biblioteca findByEdificio(Edificio edificio);
}
