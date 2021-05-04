package ar.edu.uca.oltp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ar.edu.uca.oltp.entities.StockRecursoDeBiblioteca;

public interface StockRecursoDeBibliotecaRepository extends CrudRepository<StockRecursoDeBiblioteca, Integer> {
	//public List<StockRecursoDeBiblioteca> findByRecursoDeBiblioteca(){}
}
