package com.spring.io.project.infrastructure.mappers;

import com.spring.io.project.application.models.request.SalvarLeitorRequest;
import com.spring.io.project.domain.entities.LeitorEntity;
import com.spring.io.project.infrastructure.models.Leitor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SalvarLeitorDataProviderMapper {

    @Mapping(target="situacao.codigoSituacao", source="situacao")
    @Mapping(target="tipo.codigoTipo", source="tipo")
    Leitor mapearSalvarLeitorRequestParaModel(SalvarLeitorRequest leitorRequest);

    LeitorEntity mapearSalvarLeitorModelParaEntity(Leitor leitor);
}
