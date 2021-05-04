package ar.edu.uca.oltp.repositories;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import ar.edu.uca.oltp.entities.RecursoDeBiblioteca;

@Transactional
public interface RecursoDeBibliotecaRepository extends CrudRepository<RecursoDeBiblioteca, Integer>{
	
	public List <RecursoDeBiblioteca> findByNombre(String nombre);
	
	@Query(nativeQuery = false,value = "select r from RecursoDeBiblioteca r where r.id>1")
	public List <RecursoDeBiblioteca> findRecursoMasPrestado();
//	public boolean validateRecursosNoPrestado(List <RecursoDeBiblioteca> recursos);
}
