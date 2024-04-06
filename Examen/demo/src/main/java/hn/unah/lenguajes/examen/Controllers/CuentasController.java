package hn.unah.lenguajes.examen.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examen.Entities.Cuentas;
import hn.unah.lenguajes.examen.Services.Impl.CuentasServicesImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class CuentasController {

    @Autowired
    private CuentasServicesImpl cuentasServicesImpl;

    @PostMapping("/cuentas/crear")
    public Cuentas addCuentas(@RequestBody Cuentas cuentas) {
       return this.cuentasServicesImpl.addCuenta(cuentas);
    }

    

}
