package ar.edu.uca.oltp.repositories;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import ar.edu.uca.oltp.entities.PrestamoBiblioteca;
import ar.edu.uca.oltp.entities.RecursoDeBiblioteca;

@Transactional
public interface RecursoDeBibliotecaRepository extends CrudRepository<RecursoDeBiblioteca, Integer>{
	
	public List <RecursoDeBiblioteca> findByPrestamoBiblioteca(PrestamoBiblioteca pdb);
	public List <RecursoDeBiblioteca> findByNombre(String nombre);
	
	public List <RecursoDeBiblioteca> findRecursoMasPrestado();
	public boolean validateRecursosNoPrestado(List <RecursoDeBiblioteca> recursos);
}
