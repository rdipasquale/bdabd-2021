package ar.edu.uca.oltp.services;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.uca.oltp.entities.Alumno;
import ar.edu.uca.oltp.entities.PrestamoBiblioteca;
import ar.edu.uca.oltp.entities.RecursoDeBiblioteca;
import ar.edu.uca.oltp.repositories.PrestamoBibliotecaRepository;
import ar.edu.uca.oltp.repositories.RecursoDeBibliotecaRepository;

@Component
@Transactional
public class BibliotecaService {
	
	@Autowired
	private RecursoDeBibliotecaRepository recursoDeBibliotecaRepository;
	
	@Autowired
	private PrestamoBibliotecaRepository prestamoBibliotecaRepository;

	public BibliotecaService() {
		
	}
	
	public List<RecursoDeBiblioteca> findAllRecursos(){
		return (List<RecursoDeBiblioteca>) recursoDeBibliotecaRepository.findAll();
	}
	
	public List<RecursoDeBiblioteca> findRecursoByNombre(String nombre){
		return (List<RecursoDeBiblioteca>) recursoDeBibliotecaRepository.findByNombre(nombre);
	}
	
	public List<PrestamoBiblioteca> findPrestamoByAlumno(Alumno alumno){
		return (List<PrestamoBiblioteca>) prestamoBibliotecaRepository.findByAlumno(alumno);
	}
	
	public PrestamoBiblioteca registerPrestamo(Alumno alumno, List<RecursoDeBiblioteca> recursos) {
		//HAY QUE ARREGLAR ESTE METODO Y VALIDAR LOS RECURSOS
		recursoDeBibliotecaRepository.validateRecursosNoPrestado(recursos);
		PrestamoBiblioteca prestamo = new PrestamoBiblioteca();
		return prestamo;
	}
}
