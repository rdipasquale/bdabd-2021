package ar.edu.uca.bases2.mongodomain.services;

import ar.edu.uca.bases2.mongodomain.repositories.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.uca.bases2.mongodomain.entities.Materia;
import ar.edu.uca.bases2.mongodomain.entities.Plan;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PlanService {

	@Autowired
	private PlanRepository planRepository;

	public PlanService() {

	}

	public void agregarMateriaAPlan(Plan plan, Materia materia) {
		plan.agregarMateria(materia);
	}

	public Set<Materia> materiasDelPlan(Plan plan) {
		String idPlan = plan.getIdPlan();
		Optional<Plan> plan_bd =  planRepository.findById(idPlan);
		Set<Materia> materias  = new HashSet<Materia>();
		plan_bd.ifPresent( planAux-> {

			 materias.addAll(planAux.getMaterias());



		});

		return materias;
	}

}
