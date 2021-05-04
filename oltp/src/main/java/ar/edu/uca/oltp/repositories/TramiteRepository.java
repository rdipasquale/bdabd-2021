package ar.edu.uca.oltp.repositories;

import javax.transaction.Transactional;

import ar.edu.uca.oltp.entities.Comision;
import ar.edu.uca.oltp.entities.Tramite;
import org.springframework.data.repository.CrudRepository;



@Transactional
public interface TramiteRepository extends CrudRepository<Tramite, Integer>{
	
	//int alumnosPorComision(Comision comision);
	
}