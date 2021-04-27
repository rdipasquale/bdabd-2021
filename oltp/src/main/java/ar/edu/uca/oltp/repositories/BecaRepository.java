package ar.edu.uca.oltp.repositories;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;

import ar.edu.uca.oltp.entities.Beca;

@Transactional
public interface BecaRepository extends CrudRepository<Beca, Integer>{
	
	@Cacheable("basicCache")
	public List<Beca> findByFechaVencimientoBefore(Date fechaVencimiento) ;

}
