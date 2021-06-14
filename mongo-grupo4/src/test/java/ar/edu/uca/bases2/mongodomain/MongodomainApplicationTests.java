package ar.edu.uca.bases2.mongodomain;

import static org.junit.Assert.assertTrue;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import ar.edu.uca.bases2.mongodomain.entities.Alumno;
import ar.edu.uca.bases2.mongodomain.entities.AlumnoV2;
import ar.edu.uca.bases2.mongodomain.entities.Comision;
import ar.edu.uca.bases2.mongodomain.entities.InscripcionMateria;
import ar.edu.uca.bases2.mongodomain.entities.MateriaComun;
import ar.edu.uca.bases2.mongodomain.exceptions.YaEstaInscriptoException;
import ar.edu.uca.bases2.mongodomain.repositories.AlumnoRepository;
import ar.edu.uca.bases2.mongodomain.repositories.ComisionRepository;
import ar.edu.uca.bases2.mongodomain.repositories.MateriaRepository;
import ar.edu.uca.bases2.mongodomain.services.InscripcionMateriaService;


@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations="classpath:test.properties")
public class MongodomainApplicationTests {
	@Autowired 
	private InscripcionMateriaService ims;
	@Autowired
	private AlumnoRepository ar;
	@Autowired
	private MateriaRepository mp;
	@Autowired
	private ComisionRepository cr;
	
	private Alumno alex = new Alumno("Alex");
	private AlumnoV2 betty = new AlumnoV2("Betty","betty@uca.edu.ar");
	private MateriaComun algebra = new MateriaComun("1",20,5,"Algebra");
	private Comision am = new Comision();
	
	
	@Before
	public void setUp() throws Exception {
		ar.save(alex);
		ar.save(betty);
		mp.save(algebra);
		am.setMateria(algebra);
		cr.save(am);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAlumnoSeInscribeEnMateria() {
		InscripcionMateria imCreated = ims.crearInscripcion(alex, algebra, am);
		List<InscripcionMateria> im = ims.buscarTodasLasInscripcionesPorAlumno(alex);
		assertTrue(im.contains(imCreated));
	}
	@Test
	public void testAlumnoV2SeInscribeEnMateria() {
		InscripcionMateria imCreated = ims.crearInscripcion(betty, algebra, am);
		List<InscripcionMateria> im = ims.buscarTodasLasInscripcionesPorAlumno(betty);
		assertTrue(im.contains(imCreated));
	}
	@Test
	public void testHay2InscriptosEnAlgebra() {
		List<InscripcionMateria> ima = ims.buscarTodosLosInscriptosPorMateria(algebra);
		assertTrue(ima.size()==2);
	}
}
