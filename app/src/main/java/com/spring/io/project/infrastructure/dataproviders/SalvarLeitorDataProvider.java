package com.spring.io.project.infrastructure.dataproviders;

import com.spring.io.project.application.models.request.SalvarLeitorRequest;
import com.spring.io.project.domain.entities.LeitorEntity;
import com.spring.io.project.domain.gateways.SalvarLeitorGateway;
import com.spring.io.project.infrastructure.mappers.SalvarLeitorDataProviderMapper;
import com.spring.io.project.infrastructure.repositories.SalvarLeitorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SalvarLeitorDataProvider implements SalvarLeitorGateway {

    final SalvarLeitorRepository repository;
    final SalvarLeitorDataProviderMapper mapper;

    @Override
    public LeitorEntity salvarLeitorGateway(SalvarLeitorRequest request) {
        return  mapper.mapearSalvarLeitorModelParaEntity(
                repository.save(
                        mapper.mapearSalvarLeitorRequestParaModel(request)
                ));
    }
}
