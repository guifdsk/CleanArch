package com.spring.io.project.infrastructure.mappers;

import com.spring.io.project.domain.entities.LeitorEntity;
import com.spring.io.project.infrastructure.models.Leitor;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BuscarLeitorDataProviderMapper {
    List<LeitorEntity> mapearBuscarLeitorModelParaEntityDataproviderMapper(List<Leitor> leitor);
}
