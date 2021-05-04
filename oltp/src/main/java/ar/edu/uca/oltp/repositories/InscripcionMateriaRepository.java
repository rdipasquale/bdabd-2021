package ar.edu.uca.oltp.repositories;

import java.util.List;

import javax.transaction.Transactional;

import ar.edu.uca.oltp.entities.InscripcionMateria;
import ar.edu.uca.oltp.entities.Materia;
import ar.edu.uca.oltp.entities.Alumno;
import ar.edu.uca.oltp.entities.Comision;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface InscripcionMateriaRepository extends CrudRepository<InscripcionMateria, Integer> {	

	InscripcionMateria crearInscripcion(Alumno alumno, Materia materia, Comision comision);

	void borrarInscripcion(InscripcionMateria inscripcion);

	List<Alumno> buscarTodosLosInscriptosPorMateriaId(Integer materia_id);
	
	List<InscripcionMateria> buscarTodasLasInscripcionesPorAlumnoId(Integer alumnoId);
}