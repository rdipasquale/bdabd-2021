package ar.edu.uca.oltp.repositories;

import org.springframework.data.repository.CrudRepository;

import ar.edu.uca.oltp.entities.RecursoDeBiblioteca;
import ar.edu.uca.oltp.entities.StockRecursoDeBiblioteca;

public interface StockRecursoDeBibliotecaRepository extends CrudRepository<StockRecursoDeBiblioteca, Integer> {
	public StockRecursoDeBiblioteca findByRecurso(RecursoDeBiblioteca recurso);
}
