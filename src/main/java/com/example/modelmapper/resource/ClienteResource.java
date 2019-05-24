package com.example.modelmapper.resource;

import com.example.modelmapper.model.Cliente;
import com.example.modelmapper.resource.dto.ClienteDTO;
import com.example.modelmapper.service.ClienteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteResource {

    @Autowired
    private ClienteService service;

    @Autowired
    private ModelMapper mapper;

    @GetMapping
    public List<Cliente> obterTodosClientes() {
        return service.obterClientes();
    }

    @GetMapping("/{id}/apolices")
    public ClienteDTO obterApolices(@PathVariable Integer id) {
        return mapper.map(service.obterApolices(id), ClienteDTO.class);
    }
}
