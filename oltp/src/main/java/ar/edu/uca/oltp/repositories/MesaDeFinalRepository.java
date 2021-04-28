package ar.edu.uca.oltp.repositories;
import org.springframework.data.repository.CrudRepository;
import ar.edu.uca.oltp.entities.MesaDeFinal;
import javax.transaction.Transactional;


@Transactional
public interface MesaDeFinalRepository extends CrudRepository<MesaDeFinal, Integer> {

}