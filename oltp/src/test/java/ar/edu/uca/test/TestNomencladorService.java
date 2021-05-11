package ar.edu.uca.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.uca.oltp.Application;
import ar.edu.uca.oltp.entities.Biblioteca;
import ar.edu.uca.oltp.entities.Edificio;
import ar.edu.uca.oltp.repositories.BibliotecaRepository;
import ar.edu.uca.oltp.repositories.EdificioRepository;
import ar.edu.uca.oltp.services.NomencladorService;

@SpringBootTest(classes = Application.class)
@TestPropertySource(locations="classpath:test.properties")
@RunWith(SpringRunner.class)
@Transactional
public class TestNomencladorService {
	
	@Autowired 
	private NomencladorService nomencladorService;
	@Autowired 
	private EdificioRepository edificioRepository;
	@Autowired 
	private BibliotecaRepository bibliotecaRepository;
	private Edificio moro = new Edificio();
	private Edificio magno = new Edificio();
	private Edificio santoTomas = new Edificio();
	private Biblioteca biblioteca1 = new Biblioteca();
	private Biblioteca biblioteca2 = new Biblioteca();
	
	@Before
	public void setUp() throws Exception {

		moro.setNombre("Moro");
		magno.setNombre("Magno");
		santoTomas.setNombre("Santo Tomas");
		nomencladorService.agregarEdificio(moro);
		nomencladorService.agregarEdificio(magno);
		nomencladorService.agregarEdificio(santoTomas);

		biblioteca1.setEdificio(moro);
		biblioteca2.setEdificio(santoTomas);
		nomencladorService.agregarBiblioteca(biblioteca1);
		nomencladorService.agregarBiblioteca(biblioteca2);

	}

	@After
	public void tearDown() throws Exception {
		edificioRepository.deleteById(moro.getId());
		edificioRepository.deleteById(magno.getId());
		edificioRepository.deleteById(santoTomas.getId());
		
		bibliotecaRepository.deleteById(biblioteca1.getId());
		bibliotecaRepository.deleteById(biblioteca2.getId());

	}

	@Test
	public void testEdificioFindByNombre() {
		assertThat(edificioRepository.findByNombre(moro.getNombre())).isEqualTo(moro);
		assertThat(edificioRepository.findByNombre(magno.getNombre())).isEqualTo(magno);
		assertThat(edificioRepository.findByNombre(santoTomas.getNombre())).isEqualTo(santoTomas);
	}
	
	@Test
	public void testEdificiosConBiblioteca() {	
		Set<Edificio> resultadoEsperado = new HashSet<Edificio>();
		resultadoEsperado.add(moro);
		resultadoEsperado.add(santoTomas);
		Set<Edificio> resultado = (Set<Edificio>) nomencladorService.edificiosConBiblioteca();
		assertThat(resultado).isEqualTo(resultadoEsperado);
	}	

}
