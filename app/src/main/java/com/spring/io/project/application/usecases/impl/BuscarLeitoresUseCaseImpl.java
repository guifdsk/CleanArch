package com.spring.io.project.application.usecases.impl;

import com.spring.io.project.application.mappers.BuscarLeitoresUseCaseMapper;
import com.spring.io.project.application.models.response.BuscarLeitoresResponse;
import com.spring.io.project.application.usecases.BuscarLeitoresUseCase;
import com.spring.io.project.domain.gateways.BuscarLeitoresGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BuscarLeitoresUseCaseImpl implements BuscarLeitoresUseCase {

    private final BuscarLeitoresGateway gateway;
    private final BuscarLeitoresUseCaseMapper mapper;

    @Override
    public List<BuscarLeitoresResponse> buscarLeitoresUseCase() {
        return mapper.mapearBuscarLeitoresResponse(gateway.buscarLeitoresGateway());
    }
}
