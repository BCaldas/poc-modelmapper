package com.example.modelmapper.config;

import com.example.modelmapper.model.Apolice;
import com.example.modelmapper.resource.dto.ApoliceDTO;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper mapper = new ModelMapper();

        PropertyMap<Apolice, ApoliceDTO> apoliceToPoliceDtoMap;
        apoliceToPoliceDtoMap = new PropertyMap<Apolice, ApoliceDTO>() {
            protected void configure() {
                map().setValor(source.getPremio());
            }
        };

        mapper.addMappings(apoliceToPoliceDtoMap);

        return mapper;
    }
}
