import ar.edu.uca.bases2.mongodomain.entities.Materia;
import ar.edu.uca.bases2.mongodomain.entities.Plan;
import ar.edu.uca.bases2.mongodomain.repositories.MateriaRepository;
import ar.edu.uca.bases2.mongodomain.repositories.PlanRepository;
import ar.edu.uca.bases2.mongodomain.services.PlanService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations="classpath:test.properties")

@Transactional
public class TestPlanService {

    @Autowired
    private PlanService planService;
    @Autowired
    private MateriaRepository materiaRepository;
    @Autowired
    private PlanRepository planRepository;
    private Materia matematica = new Materia();
    private Materia infoGeneral = new Materia();
    private Plan ing_info_2021= new Plan();


    @Before
    public void setUp() throws Exception {

        matematica.setNombre("Matematica");
        matematica.setIdMateria("1");
        matematica.setCantHoras(4);
        infoGeneral.setNombre("InfoGeneral");
        infoGeneral.setIdMateria("2");
        infoGeneral.setCantHoras(6);
        ing_info_2021.setIdPlan("1");
        ing_info_2021.setFechaDeCreacion(Date.from(Instant.now()));


    }

    @After
    public void tearDown() throws Exception {
        planRepository.deleteById(ing_info_2021.getIdPlan());
        materiaRepository.deleteById(matematica.getIdMateria());
        materiaRepository.deleteById(infoGeneral.getIdMateria());

    }

    @Test
    public void testEdificioFindByNombre() {
        planService.agregarMateriaAPlan(ing_info_2021, matematica);
        planService.agregarMateriaAPlan(ing_info_2021, infoGeneral);
        Set<Materia> resultadoEsperado = new HashSet<Materia>();
        resultadoEsperado.add(matematica);
        resultadoEsperado.add(infoGeneral);
        Set<Materia> resultado = (Set<Materia>) planService.materiasDelPlan(ing_info_2021);

        assertThat(resultado).isEqualTo(resultadoEsperado);
    }



}