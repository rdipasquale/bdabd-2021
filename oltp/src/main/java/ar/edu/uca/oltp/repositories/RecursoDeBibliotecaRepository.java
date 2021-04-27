package ar.edu.uca.oltp.repositories;
import javax.persistence.Cacheable;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import ar.edu.uca.oltp.entities.RecursoDeBiblioteca;

@Transactional
public interface RecursoDeBibliotecaRepository extends CrudRepository<RecursoDeBiblioteca, Integer>{
	
}