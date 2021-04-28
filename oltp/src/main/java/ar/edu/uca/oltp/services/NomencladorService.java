package ar.edu.uca.oltp.services;


import ar.edu.uca.oltp.entities.Carrera;
import ar.edu.uca.oltp.entities.Edificio;

import ar.edu.uca.oltp.repositories.CarreraRepository;
import ar.edu.uca.oltp.repositories.EdificioRepository;
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





}
