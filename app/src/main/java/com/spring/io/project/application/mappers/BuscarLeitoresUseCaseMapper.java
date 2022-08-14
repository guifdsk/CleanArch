package com.spring.io.project.application.mappers;

import com.spring.io.project.application.models.response.BuscarLeitoresResponse;
import com.spring.io.project.domain.entities.LeitorEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BuscarLeitoresUseCaseMapper {
    List<BuscarLeitoresResponse> mapearBuscarLeitoresResponse(List<LeitorEntity> leitorEntities);
}
