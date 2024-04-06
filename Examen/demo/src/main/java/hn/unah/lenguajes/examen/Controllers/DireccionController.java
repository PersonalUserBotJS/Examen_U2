package hn.unah.lenguajes.examen.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examen.Entities.Direccion;
import hn.unah.lenguajes.examen.Services.Impl.DireccionServicesImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class DireccionController {
    @Autowired 
    private DireccionServicesImpl direccionServicesImpl;

    @PostMapping("/direccion/crear")
    public Direccion addDireccion(@RequestBody Direccion direccion){
        return this.direccionServicesImpl.addDireccion(direccion);
    }

}
