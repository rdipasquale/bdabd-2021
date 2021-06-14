package ar.edu.uca.bases2.mongodomain.repositories;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import ar.edu.uca.bases2.mongodomain.entities.InscripcionMateria;
import ar.edu.uca.bases2.mongodomain.entities.Materia;
import ar.edu.uca.bases2.mongodomain.entities.Alumno;
import ar.edu.uca.bases2.mongodomain.entities.Comision;

public interface InscripcionMateriaRepository extends MongoRepository<InscripcionMateria, Integer>{
	List<InscripcionMateria> findByMateria(Materia materia);
	List<InscripcionMateria> findByAlumno(Alumno alumno);
	List<InscripcionMateria> findByComision(Comision comision);
}
