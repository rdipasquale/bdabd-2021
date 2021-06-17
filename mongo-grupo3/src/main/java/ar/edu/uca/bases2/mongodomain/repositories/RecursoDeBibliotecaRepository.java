package ar.edu.uca.bases2.mongodomain.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ar.edu.uca.bases2.mongodomain.entities.Biblioteca;
import ar.edu.uca.bases2.mongodomain.entities.RecursoDeBiblioteca;

@Repository
public interface RecursoDeBibliotecaRepository extends MongoRepository<RecursoDeBiblioteca, Integer>{
	
	List <RecursoDeBiblioteca> findByBiblioteca(Biblioteca biblioteca);
	
	RecursoDeBiblioteca findById(int id);
	
	RecursoDeBiblioteca findByNombre(String nombre);
	
}
