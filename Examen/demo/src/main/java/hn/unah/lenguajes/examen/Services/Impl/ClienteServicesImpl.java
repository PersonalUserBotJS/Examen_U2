package hn.unah.lenguajes.examen.Services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examen.Entities.Cliente;
import hn.unah.lenguajes.examen.Repositories.ClienteRepository;
import hn.unah.lenguajes.examen.Services.ClienteServices;

@Service
public class ClienteServicesImpl implements ClienteServices{
    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public Cliente addCliente(Cliente cliente) {
       return this.clienteRepository.save(cliente);
    }
    @Override
    public List<Cliente> getClientes() {
        return (List<Cliente>) this.clienteRepository.findAll();
    }
    @Override
    public Optional<Cliente> getClienteDni(String dni) {
        return this.clienteRepository.findById(dni);
    }


}
