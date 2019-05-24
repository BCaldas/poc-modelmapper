package com.example.modelmapper.resource;

import com.example.modelmapper.model.Apolice;
import com.example.modelmapper.service.ApoliceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("apolices")
public class ApoliceResource {

    @Autowired
    private ApoliceService service;

    @GetMapping
    public List<Apolice> obterTodosClientes() {
        return service.obterTodos();
    }
}
