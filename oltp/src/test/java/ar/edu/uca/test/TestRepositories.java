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
import ar.edu.uca.oltp.entities.Alumno;
import ar.edu.uca.oltp.repositories.AlumnoRepository;


@SpringBootTest(classes = Application.class)
@TestPropertySource(locations="classpath:test.properties")
@RunWith(SpringRunner.class)
//@DataJpaTest
public class TestRepositories {

	@Autowired 
	private AlumnoRepository alumnoRepository;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAlumnoRepository() {
		
		for (Alumno a : alumnoRepository.findAll()) 
			System.out.println(a);			
		
	}	
	
}
