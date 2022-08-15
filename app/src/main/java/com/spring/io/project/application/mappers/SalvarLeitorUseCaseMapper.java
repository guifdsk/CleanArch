package com.spring.io.project.application.mappers;

import com.spring.io.project.application.models.response.SalvarLeitorResponse;
import com.spring.io.project.domain.entities.LeitorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SalvarLeitorUseCaseMapper {
    @Mapping(target="situacao", source="situacao.codigoSituacao")
    @Mapping(target="tipo", source="tipo.codigoTipo")
    SalvarLeitorResponse mapearSalvarLeitorEntityParaResponseUseCase(LeitorEntity leitorEntity);
}
