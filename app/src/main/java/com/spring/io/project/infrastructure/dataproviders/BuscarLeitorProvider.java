package com.spring.io.project.infrastructure.dataproviders;

import com.spring.io.project.domain.entities.LeitorEntity;
import com.spring.io.project.domain.gateways.BuscarLeitorGateway;
import com.spring.io.project.infrastructure.mappers.BuscarLeitorDataProviderMapper;
import com.spring.io.project.infrastructure.models.Leitor;
import com.spring.io.project.infrastructure.repositories.BuscarLeitorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BuscarLeitorProvider implements BuscarLeitorGateway {

    private final BuscarLeitorRepository repository;
    private final BuscarLeitorDataProviderMapper mapper;

    @Override
    public List<LeitorEntity> buscarLeitorGateway() {
        List<Leitor> response = repository.findAll();
        return mapper.mapearBuscarLeitorModelParaEntityDataproviderMapper(response);
    }
}
