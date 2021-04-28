package ar.edu.uca.oltp.repositories;


import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import ar.edu.uca.oltp.entities.RecursoDeBiblioteca;
import ar.edu.uca.oltp.entities.Alumno;
import ar.edu.uca.oltp.entities.PrestamoBiblioteca;
import java.util.List;

@Transactional
public interface RecursoDeBibliotecaRepository extends CrudRepository<RecursoDeBiblioteca, Integer>{
	
	public List <RecursoDeBiblioteca> findByPrestamoBiblioteca(PrestamoBiblioteca pdb);
}
