package ar.edu.uca.oltp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ar.edu.uca.oltp.entities.Materia;

@Repository
public interface MateriaRepository extends MongoRepository<Materia, String> {

}
