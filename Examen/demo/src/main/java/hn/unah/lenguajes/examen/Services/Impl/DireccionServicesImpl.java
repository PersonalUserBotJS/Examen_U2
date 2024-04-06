package hn.unah.lenguajes.examen.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examen.Entities.Direccion;
import hn.unah.lenguajes.examen.Repositories.DireccionRepository;
import hn.unah.lenguajes.examen.Services.DireccionServices;

@Service
public class DireccionServicesImpl implements DireccionServices {

    @Autowired
    private DireccionRepository direccionRepository;
    @Override
    public Direccion addDireccion(Direccion direccion) {
       return this.direccionRepository.save(direccion);
    }

}
