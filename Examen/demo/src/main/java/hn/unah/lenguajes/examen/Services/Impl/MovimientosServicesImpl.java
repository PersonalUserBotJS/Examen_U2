package hn.unah.lenguajes.examen.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examen.Entities.Movimientos;
import hn.unah.lenguajes.examen.Repositories.MovimientosRepository;
import hn.unah.lenguajes.examen.Services.MovimientosServices;

@Service
public class MovimientosServicesImpl implements MovimientosServices{
    @Autowired
    private MovimientosRepository movimientosRepository;

    @Override
    public Movimientos addMovimiento(Movimientos movimientos) {
       return this.movimientosRepository.save(movimientos);
    }

}
