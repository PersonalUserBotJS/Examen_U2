package hn.unah.lenguajes.examen.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examen.Entities.Movimientos;
import hn.unah.lenguajes.examen.Services.Impl.MovimientosServicesImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class MovimientosController {
    @Autowired
    private MovimientosServicesImpl movimientosServicesImpl;

    @PostMapping("movimiento/crear")
    public Movimientos addMovimiento(@RequestBody Movimientos movimiento) {
        return this.movimientosServicesImpl.addMovimiento(movimiento);
    }
    
    
}
