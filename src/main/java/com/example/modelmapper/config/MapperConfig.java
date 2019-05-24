package com.example.modelmapper.config;

import com.example.modelmapper.model.Apolice;
import com.example.modelmapper.resource.dto.ApoliceDTO;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    //Criamos um bean para poder injeta-lo via @Autowired
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper mapper = new ModelMapper();

        //O Model mapper consegue mapear as propriedades da entidade/dto automaticamente
        //através dos nomes dos get/set. Quando o nome das propriedades q estão sendo mapeada é diferentes
        //podemos utilizar um PropertyMap para dizer ao ModelMapper como mapear as propriedades.
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
