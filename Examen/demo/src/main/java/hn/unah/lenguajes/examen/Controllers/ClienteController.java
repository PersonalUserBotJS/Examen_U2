package hn.unah.lenguajes.examen.Controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examen.Entities.Cliente;
import hn.unah.lenguajes.examen.Services.Impl.ClienteServicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api")

public class ClienteController {
    @Autowired
    private ClienteServicesImpl clienteServicesImpl;

    @PostMapping("/cliente/crear")
    public Cliente addCliente(@RequestBody Cliente cliente) {
        return this.clienteServicesImpl.addCliente(cliente);

    }

    @GetMapping("/cliente/listar")
    public List<Cliente> getClientes() {
        return this.clienteServicesImpl.getClientes();
    }

    @GetMapping("/cliente/getByDni")
    public Optional<Cliente> getClienteDni (@RequestParam String dni){
        return this.clienteServicesImpl.getClienteDni(dni);
    }

}
