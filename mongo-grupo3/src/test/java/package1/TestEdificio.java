import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import ar.edu.uca.bases2.mongodomain.entities.*;
import ar.edu.uca.bases2.mongodomain.repositories.*;
import ar.edu.uca.bases2.mongodomain.services.*;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;
@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locatinos="classpath:test.properties")


@Transactional
public class TestEdificio{
	
	
	@Autowired
	private EdificioService edificioService;
	@Autowired
	private InstitutoRepository institutoRepo;
	@Autowired
	private EdificioRepository edificioRepo;
	//@Autowired
	//private BibliotecaRepository BibliotecaRepo;
	
	private Instituto institutoA= new Instituto();
	private Instituto institutoB=new Instituto();
	private Instituto institutoC=new Instituto();
	private Edificio edificioA= new Edificio();
	private Set<Edificio> Edificios= new HashSet<Edificio>();
	private Edificio edificioPrincipal = new Edificio();
	
	//private Biblioteca bibliotecaCentral = new Biblioteca();
	
	@Before
	public void iniciar() throws Exception{
		
		edificioA.setId(2);
		edificioA.setDireccion("San isidro");
		edificioPrincipal.setId(2);
		edificioPrincipal.setDireccion("Puerto Madero");

		//bibliotecaCentral.setId(1);
		//bibliotecaCentral.setNombre("BIBLIOTECA CENTRAL");
		
		Edificios.add(edificioA);
		institutoA.setId(1);
		institutoA.setNombre("INSTI_A");
		institutoA.addEdificio(edificioPrincipal);
		institutoB.setId(2);		
		institutoB.setNombre("INSTI_B");
		institutoB.addEdificio(edificioPrincipal);
		institutoC.setId(3);
		institutoC.setNombre("INSTI_C");
		institutoC.addEdificio(edificioPrincipal);
		
		edificioRepo.save(edificioA);
		edificioRepo.save(edificioPrincipal);

		institutoRepo.save(institutoA);
		institutoRepo.save(institutoB);
		institutoRepo.save(institutoC);
	
		//BibliotecaRepo.save(bibliotecaCentral);
		
	}
	
	@After
	public void removeCreations() throws Exception{
		edificioRepo.deleteAll();
		institutoRepo.deleteAll();
		//BibliotecaRepo.deleteAll();
	}
	
	@Test
	public void testInstitutosEnDeterminadoEdificio() {
		
		edificioService.addInstituto(edificioPrincipal, institutoA);
		edificioService.addInstituto(edificioPrincipal, institutoB);
		edificioService.addInstituto(edificioPrincipal, institutoC);
		
		Set<Instituto> institutosPosibles = new HashSet<Instituto>();
		institutosPosibles.add(institutoA);institutosPosibles.add(institutoB);institutosPosibles.add(institutoC);
		
		Set <Instituto> institutosRepo = (Set<Instituto>)edificioService.institutoDeEsteEdificio(edificioPrincipal);
		assertThat(institutosRepo).isEqualTo(institutosPosibles);
		
	}
	
	@Test
	public void testNuevosInstitutosSeAgreganEdificioA() {
		edificioService.addInstituto(edificioA, institutoA);
		assertTrue(((Set<Instituto>)edificioService.institutoDeEsteEdificio(edificioA)).size()==1);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}