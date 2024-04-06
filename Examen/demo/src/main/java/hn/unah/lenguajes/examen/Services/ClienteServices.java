package hn.unah.lenguajes.examen.Services;

import java.util.List;
import java.util.Optional;

import hn.unah.lenguajes.examen.Entities.Cliente;

public interface ClienteServices {
    // Agregar CLiente
    public Cliente addCliente(Cliente cliente);
    // Obtener todos los clientes
    public List<Cliente> getClientes();
    // Obtener Cliente por DNI
    public Optional<Cliente> getClienteDni(String dni);
}
