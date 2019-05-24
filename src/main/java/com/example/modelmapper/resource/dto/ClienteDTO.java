package com.example.modelmapper.resource.dto;

import java.util.List;

public class ClienteDTO {

    private String nome;
    private List<ApoliceDTO> apolices;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ApoliceDTO> getApolices() {
        return apolices;
    }

    public void setApolices(List<ApoliceDTO> apolices) {
        this.apolices = apolices;
    }
}
