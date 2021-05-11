package ar.edu.uca.oltp.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import ar.edu.uca.oltp.entities.Alumno;
import ar.edu.uca.oltp.entities.PrestamoBiblioteca;
import ar.edu.uca.oltp.valueObjects.EstadoTramite;
@Transactional
public interface PrestamoBibliotecaRepository extends CrudRepository<PrestamoBiblioteca, Integer>{
	List<PrestamoBiblioteca> findByAlumno(Alumno alumno);
	PrestamoBiblioteca findByAlumnoAndEstado(Alumno alumno , EstadoTramite estado);
}
