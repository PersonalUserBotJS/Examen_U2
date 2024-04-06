package hn.unah.lenguajes.examen.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.examen.Entities.Direccion;

@Repository
public interface DireccionRepository extends CrudRepository<Direccion, Integer>{

}
