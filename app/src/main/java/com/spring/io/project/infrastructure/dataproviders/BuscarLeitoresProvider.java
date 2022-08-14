package com.spring.io.project.infrastructure.dataproviders;

import com.spring.io.project.domain.entities.LeitorEntity;
import com.spring.io.project.domain.gateways.BuscarLeitoresGateway;
import com.spring.io.project.infrastructure.mappers.BuscarLeitoresDataProviderMapper;
import com.spring.io.project.infrastructure.models.Leitor;
import com.spring.io.project.infrastructure.repositories.BuscarLeitoresRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BuscarLeitoresProvider implements BuscarLeitoresGateway {

    final BuscarLeitoresRepository repository;
    final BuscarLeitoresDataProviderMapper mapper;

    @Override
    public List<LeitorEntity> buscarLeitoresGateway() {
        List<Leitor> response = repository.findAll();
        return mapper.mapearBuscarLeitoresDataproviderMapper(response);
    }
}
