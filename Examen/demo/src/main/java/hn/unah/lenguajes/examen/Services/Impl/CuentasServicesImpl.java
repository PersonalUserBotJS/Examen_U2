package hn.unah.lenguajes.examen.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examen.Entities.Cuentas;
import hn.unah.lenguajes.examen.Repositories.ClienteRepository;
import hn.unah.lenguajes.examen.Repositories.CuentasRepository;
import hn.unah.lenguajes.examen.Services.CuentasServices;

@Service
public class CuentasServicesImpl implements CuentasServices {

    @Autowired

    private CuentasRepository cuentasRepository;

    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public Cuentas addCuenta(Cuentas cuentas) {
       return this.cuentasRepository.save(cuentas);
    }
    @Override
    public Cuentas AsociarCuenta(String numeroCuenta, String dni) {
        if(this.cuentasRepository.existsById(numeroCuenta)) { 
            if(this.clienteRepository.existsById(dni)){
                Cuentas cuentas = this.cuentasRepository.findById(numeroCuenta).get();
                cuentas.setCliente(this.clienteRepository.findById(dni).get());
                this.cuentasRepository.save(cuentas);
                return cuentas;
            }
        }
        return null;
    }


}
