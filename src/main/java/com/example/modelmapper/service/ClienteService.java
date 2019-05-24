package com.example.modelmapper.service;

import com.example.modelmapper.model.Cliente;
import com.example.modelmapper.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<Cliente> obterClientes() {
        return repository.findAll();
    }

    public Cliente obterApolices(Integer clienteId) {
       return repository.findById(clienteId).get();
    }
}
