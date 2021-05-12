package ar.edu.uca.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import ar.edu.uca.oltp.Application;
import ar.edu.uca.oltp.entities.Alumno;
import ar.edu.uca.oltp.entities.Comision;
import ar.edu.uca.oltp.entities.InscripcionMateria;
import ar.edu.uca.oltp.entities.MateriaComun;
import ar.edu.uca.oltp.repositories.AlumnoRepository;
import ar.edu.uca.oltp.repositories.ComisionRepository;
import ar.edu.uca.oltp.repositories.MateriaRepository;
import ar.edu.uca.oltp.services.InscripcionMateriaService;

@SpringBootTest(classes = Application.class)
@TestPropertySource(locations="classpath:test.properties")
@RunWith(SpringRunner.class)
public class TestInscripcionMateriaService {
	
	@Autowired 
	private InscripcionMateriaService ims;
	@Autowired
	private AlumnoRepository ar;
	@Autowired
	private MateriaRepository mp;
	@Autowired
	private ComisionRepository cr;
	
	private Alumno alex = new Alumno("Alex");
	private MateriaComun algebra = new MateriaComun(1,20,5,"Algebra");
	private Comision am = new Comision();
	
	@Before
	public void setUp() throws Exception {
		ar.save(alex);
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
}