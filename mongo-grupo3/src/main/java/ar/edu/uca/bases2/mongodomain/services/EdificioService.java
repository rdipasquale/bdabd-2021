package ar.edu.uca.bases2.mongodomain.services;

import ar.edu.uca.bases2.mongodomain.repositories.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ar.edu.uca.bases2.mongodomain.entities.Edificio;
import ar.edu.uca.bases2.mongodomain.entities.Instituto;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class EdificioService{
	
	@Autowired
	private EdificioRepository edificioRepo;
	
	public EdificioService() {
		
	}
	
	public void addInstituto(Edificio edificio, Instituto institutoNuevo) {
		edificio.addInstituto(institutoNuevo);
	}
	
	public Set<Instituto> institutoDeEsteEdificio(Edificio edificioA){
		
		Optional<Edificio> edificioo = edificioRepo.findById(edificioA.getId());
		Set<Instituto> institutoA = new HashSet<Instituto>();
		
		edificioo.ifPresent(edificioX -> {institutoA.addAll(edificioX.getInstituto());});
		
		return institutoA;
	}
	
	public void findInstitutoDeEdificio(Edificio edificioA, Instituto institutoAux) {
		
		Optional<Edificio> edificioo =edificioRepo.findById(edificioA.getId());
		
		Set<Instituto> institutoA = new HashSet<Instituto>();
		
		edificioo.ifPresent(edificioX -> {institutoA.addAll(edificioX.getInstituto());});
		
		for(Instituto inst: institutoA) {
			if( institutoAux.equals(inst)) {
				System.out.print("El instituto pertenece al edificio"+institutoAux.getNombre());
			}
		}
//		Instituto institutoSalida = new Instituto();
		System.out.print("El instituto NO pertenece al edificio"+institutoAux.getNombre());
	}
	
	public void deleteEdificio(Edificio edificio) {
		edificioRepo.delete(edificio);
	}
	
	public Edificio EdificiosPorUbicacion(String ubicacion){
		return edificioRepo.findByDireccion(ubicacion);
	} 
	
	
	
	
}