package hn.unah.lenguajes.examen.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.examen.Entities.Cuentas;

@Repository
public interface CuentasRepository extends CrudRepository <Cuentas, String> {

}
