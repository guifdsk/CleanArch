package com.spring.io.project.application.usecases.impl;

import com.spring.io.project.application.mappers.BuscarLeitorUseCaseMapper;
import com.spring.io.project.application.models.response.BuscarLeitorResponse;
import com.spring.io.project.application.usecases.BuscarLeitorUseCase;
import com.spring.io.project.domain.gateways.BuscarLeitorGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BuscarLeitorUseCaseImpl implements BuscarLeitorUseCase {

    private final BuscarLeitorGateway gateway;
    private final BuscarLeitorUseCaseMapper mapper;

    @Override
    public List<BuscarLeitorResponse> buscarLeitorUseCase() {
        return mapper.mapearBuscarLeitorEntityParaResponseUseCase(gateway.buscarLeitorGateway());
    }
}
