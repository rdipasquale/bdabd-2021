package ar.edu.uca.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import ar.edu.uca.oltp.Application;
import ar.edu.uca.oltp.entities.Biblioteca;
import ar.edu.uca.oltp.entities.Edificio;
import ar.edu.uca.oltp.services.NomencladorService;

@SpringBootTest(classes = Application.class)
@TestPropertySource(locations="classpath:test.properties")
@RunWith(SpringRunner.class)
public class TestNomencladorService {
	
	@Autowired 
	private NomencladorService nomencladorService;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEdificiosConBiblioteca() {
		Edificio edificio1 = new Edificio();
		Edificio edificio2 = new Edificio();
		Edificio edificio3 = new Edificio();
		edificio1.setNombre("Moro");
		edificio2.setNombre("Magno");
		edificio3.setNombre("Santo Tomas");

		Biblioteca biblioteca1 = new Biblioteca();
		Biblioteca biblioteca2 = new Biblioteca();
		biblioteca1.setEdificio(edificio1);
		biblioteca2.setEdificio(edificio3);
		
		for (Edificio e : nomencladorService.edificiosConBiblioteca()) 
			System.out.println(e);	
	}	

}
