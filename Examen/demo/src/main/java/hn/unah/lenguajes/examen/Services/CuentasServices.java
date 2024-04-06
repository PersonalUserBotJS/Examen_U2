package hn.unah.lenguajes.examen.Services;

import hn.unah.lenguajes.examen.Entities.Cuentas;

public interface CuentasServices {
    // Crear Cuenta
    public Cuentas addCuenta(Cuentas cuentas);
    // Asocia Cuenta
    public Cuentas AsociarCuenta(String numeroCuenta, String dni);
    

}
