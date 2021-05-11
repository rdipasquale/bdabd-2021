package ar.edu.uca.oltp.repositories;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import ar.edu.uca.oltp.entities.RecursoDeBiblioteca;

@Transactional
public interface RecursoDeBibliotecaRepository extends CrudRepository<RecursoDeBiblioteca, Integer>{
	
	public List <RecursoDeBiblioteca> findByNombre(String nombre);
	
	@Query(nativeQuery = true,value = "select rb.id as Id,rb.nombre as Nombre,max(count(rb.id)) as Cantidad"
			+ " from PrestamoBiblioteca pb inner join RECURSODEBIBLIOTECA rb on rb.id=pb.RECURSO-ID "
			+ "group by(rb.id,rb.nombre)")
	public List <RecursoDeBiblioteca> findRecursoMasPrestado();
//	public boolean validateRecursosNoPrestado(List <RecursoDeBiblioteca> recursos);
}
