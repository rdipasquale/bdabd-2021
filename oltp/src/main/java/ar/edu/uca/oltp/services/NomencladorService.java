package ar.edu.uca.oltp.services;

import ar.edu.uca.oltp.entities.Biblioteca;
import ar.edu.uca.oltp.entities.Carrera;
import ar.edu.uca.oltp.entities.Edificio;
import ar.edu.uca.oltp.repositories.BibliotecaRepository;
import ar.edu.uca.oltp.repositories.CarreraRepository;
import ar.edu.uca.oltp.repositories.EdificioRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class NomencladorService {
    @Autowired
    private CarreraRepository carreraRepository;
    @Autowired
    private EdificioRepository edificioRepository;
    @Autowired
    private BibliotecaRepository bibliotecaRepository;


    public NomencladorService() {
    }
    public void agregarCarrera(Carrera carrera)
    {
        carreraRepository.save(carrera);
    }
    public void agregarEdificio(Edificio edificio)
    {
        edificioRepository.save(edificio);
    }
    public void agregarBiblioteca(Biblioteca biblioteca)
    {
        bibliotecaRepository.save(biblioteca);
    }
    
    public Set<Edificio> edificiosConBiblioteca() {
    	List<Biblioteca> bibliotecas = (List<Biblioteca>) bibliotecaRepository.findAll();
    	Set<Edificio> edificiosConBiblioteca = new HashSet<Edificio>();
    	for (Biblioteca b: bibliotecas) {
    		edificiosConBiblioteca.add(b.getEdificio());
    	}
    	return edificiosConBiblioteca;
    }

}
