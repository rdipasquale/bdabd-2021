package ar.edu.uca.bases2.mongodomain.services;

import org.springframework.stereotype.Service;

import ar.edu.uca.bases2.mongodomain.entities.Materia;
import ar.edu.uca.bases2.mongodomain.entities.Plan;

@Service
public class PlanService {
	
	public PlanService (){
		
	}
	
	public void agregarMateriaAPlan(Plan plan, Materia materia) {
		plan.agregarMateria(materia);
	}
}
