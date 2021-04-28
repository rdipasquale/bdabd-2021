package ar.edu.uca.oltp.repositories;

import javax.transaction.Transactional;
import ar.edu.uca.oltp.entities.Carrera;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface CarreraRepository extends CrudRepository<Carrera, Integer>{


}

