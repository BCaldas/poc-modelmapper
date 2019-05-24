package com.example.modelmapper.service;

import com.example.modelmapper.model.Apolice;
import com.example.modelmapper.repository.ApoliceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApoliceService {

    @Autowired
    private ApoliceRepository repository;

    public List<Apolice> obterTodos() {
        return repository.findAll();
    }
}
