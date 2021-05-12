package ar.edu.uca.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

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
import ar.edu.uca.oltp.entities.Alumno;
import ar.edu.uca.oltp.entities.Biblioteca;
import ar.edu.uca.oltp.entities.PrestamoBiblioteca;
import ar.edu.uca.oltp.entities.RecursoDeBiblioteca;
import ar.edu.uca.oltp.entities.StockRecursoDeBiblioteca;
import ar.edu.uca.oltp.repositories.AlumnoRepository;
import ar.edu.uca.oltp.repositories.BibliotecaRepository;
import ar.edu.uca.oltp.repositories.RecursoDeBibliotecaRepository;
import ar.edu.uca.oltp.repositories.StockRecursoDeBibliotecaRepository;
import ar.edu.uca.oltp.services.BibliotecaService;
import ar.edu.uca.oltp.valueObjects.EstadoTramite;

@SpringBootTest(classes = Application.class)
@TestPropertySource(locations="classpath:test.properties")
@RunWith(SpringRunner.class)
@Transactional
public class TestBibliotecaService {
	
	@Autowired
	private BibliotecaService bibliotecaService;
	@Autowired
	private AlumnoRepository alumnoRepository;
	@Autowired
	private RecursoDeBibliotecaRepository recursoRepository;
	@Autowired
	private StockRecursoDeBibliotecaRepository stockRepository;
	@Autowired
	private BibliotecaRepository bibliotecaRepository;
	private Alumno alumno = new Alumno();
	private Alumno alumnoFallido = new Alumno();
	private RecursoDeBiblioteca recurso1 = new RecursoDeBiblioteca();
	private RecursoDeBiblioteca recurso2 = new RecursoDeBiblioteca();
	private StockRecursoDeBiblioteca stockRecurso1;
	private StockRecursoDeBiblioteca stockRecurso2;
	private List<RecursoDeBiblioteca> recursos= new ArrayList<RecursoDeBiblioteca>();
	private Biblioteca biblioteca = new Biblioteca();
	
	@Before
	public void setUp() throws Exception {
		recurso1.setNombre("Kubernetes in Action");
		recurso2.setNombre("Graph powered Machine Learning");
		bibliotecaRepository.save(biblioteca);
		recurso1.setBiblioteca(biblioteca);
		recurso2.setBiblioteca(biblioteca);
		stockRecurso1 = new StockRecursoDeBiblioteca(recurso1, 5);
		stockRecurso2 = new StockRecursoDeBiblioteca(recurso2, 5);
		recursoRepository.save(recurso1);
		recursoRepository.save(recurso2);
		stockRepository.save(stockRecurso1);
		stockRepository.save(stockRecurso2);
		alumno.setNombre("Pepe");
		alumnoRepository.save(alumno);
		recursos.add(recurso1);
		recursos.add(recurso2);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testFindRecursoByNombre() {
		RecursoDeBiblioteca recurso= new RecursoDeBiblioteca();
		recurso.setNombre("a");
		for (RecursoDeBiblioteca r: bibliotecaService.findRecursoByNombre("a")) {
			assertEquals(r.getNombre(),"a");
		}
	}
	@Test
	public void testRegisterPrestamoConAlumnoFallido() {
		try {
		PrestamoBiblioteca prestamo= 
				bibliotecaService.registerPrestamo("Pablo", recursos);
		}
		catch(Exception e) {
			assertEquals(e.getMessage(),"Alumno not found");
		}
		
	}
	@Test
	public void testRegisterPrestamo() {
		try {
			PrestamoBiblioteca prestamo= 
					bibliotecaService.registerPrestamo("Pablo", recursos);
			assertEquals(prestamo.getEstado(),EstadoTramite.EN_CURSO);
			}
			catch(Exception e) {
				assertEquals(e.getMessage(),"Alumno not found");
			}
		
	}
	@Test
	public void testEndPrestamo() {
		try {
			PrestamoBiblioteca prestamo= 
					bibliotecaService.registerPrestamo("Pepe", recursos);
			prestamo= bibliotecaService.endPrestamo(alumno);
			assertEquals(prestamo.getEstado(),EstadoTramite.FINALIZADO);
			}
			catch(Exception e) {
				assertEquals(e.getMessage(),"Alumno not found");
			}
		
	}
}
