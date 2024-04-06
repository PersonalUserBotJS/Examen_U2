package hn.unah.lenguajes.examen.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.examen.Entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, String> {
    
    public List<Cliente> getByDni (String dni);
}
