package com.spring.io.project.application.usecases.impl;

import com.spring.io.project.application.mappers.SalvarLeitorUseCaseMapper;
import com.spring.io.project.application.models.request.SalvarLeitorRequest;
import com.spring.io.project.application.models.response.SalvarLeitorResponse;
import com.spring.io.project.application.usecases.SalvarLeitorUseCase;
import com.spring.io.project.domain.gateways.SalvarLeitorGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class SalvarLeitorUseCaseImpl implements SalvarLeitorUseCase {

    private final SalvarLeitorGateway gateway;
    private final SalvarLeitorUseCaseMapper mapper;

    @Override
    public SalvarLeitorResponse salvarLeitorUseCase(SalvarLeitorRequest request) {
        request.setDataCadastro(LocalDate.now());
        return mapper.mapearSalvarLeitorEntityParaResponseUseCase(gateway.salvarLeitorGateway(request));
    }
}
