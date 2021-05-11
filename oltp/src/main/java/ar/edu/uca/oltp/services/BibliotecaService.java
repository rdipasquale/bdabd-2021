package ar.edu.uca.oltp.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.uca.oltp.entities.Alumno;
import ar.edu.uca.oltp.entities.PrestamoBiblioteca;
import ar.edu.uca.oltp.entities.RecursoDeBiblioteca;
import ar.edu.uca.oltp.entities.StockRecursoDeBiblioteca;
import ar.edu.uca.oltp.repositories.PrestamoBibliotecaRepository;
import ar.edu.uca.oltp.repositories.RecursoDeBibliotecaRepository;
import ar.edu.uca.oltp.repositories.StockRecursoDeBibliotecaRepository;
import ar.edu.uca.oltp.valueObjects.EstadoTramite;

@Component
@Transactional
public class BibliotecaService {
	
	@Autowired
	private RecursoDeBibliotecaRepository recursoDeBibliotecaRepository;
	
	@Autowired
	private StockRecursoDeBibliotecaRepository stockRecursoDeBibliotecaRepository;
	
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
	
	public void reduceStock(List<RecursoDeBiblioteca> recursos) {
		for (RecursoDeBiblioteca recurso: recursos){
			StockRecursoDeBiblioteca stock=
					stockRecursoDeBibliotecaRepository.findByRecurso(recurso);
			stock.setCantidad(stock.getCantidad()-1);
		}
	}
	public void addStock(List<RecursoDeBiblioteca> recursos) {
		for (RecursoDeBiblioteca recurso: recursos){
			StockRecursoDeBiblioteca stock=
					stockRecursoDeBibliotecaRepository.findByRecurso(recurso);
			stock.setCantidad(stock.getCantidad()+1);
		}
	}
	
	public boolean validateStockRecursos(List<RecursoDeBiblioteca> recursos) {
		for (RecursoDeBiblioteca recurso: recursos){
			StockRecursoDeBiblioteca stock=
					stockRecursoDeBibliotecaRepository.findByRecurso(recurso);
			if(stock.getCantidad()<=0) {
				return false;
			}
		}
	return true;
	}
		
	
	public void registerPrestamo(Alumno alumno, List<RecursoDeBiblioteca> recursos) {
		EstadoTramite estado;
		if(this.validateStockRecursos(recursos)) {
			this.reduceStock(recursos);
			estado= EstadoTramite.EN_CURSO;
		}
		else {
			estado= EstadoTramite.RECHAZADO;
		}
		Date fechaInicio = new Date();
		Date fechaFinal = fechaInicio;
		PrestamoBiblioteca prestamo = new PrestamoBiblioteca(estado, fechaInicio, fechaFinal,alumno,recursos);
		prestamoBibliotecaRepository.save(prestamo);
	}
	
	public void endPrestamo(Alumno alumno) {
		PrestamoBiblioteca prestamo = 
				prestamoBibliotecaRepository.findByAlumnoAndEstado(alumno, EstadoTramite.EN_CURSO);
		prestamo.setEstado(EstadoTramite.FINALIZADO);
		List<RecursoDeBiblioteca> recursos= prestamo.getRecursos();
		this.addStock(recursos);
		prestamoBibliotecaRepository.save(prestamo);
	}
}
