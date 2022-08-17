package com.spring.io.project.infrastructure.dataproviders;

import com.spring.io.project.domain.gateways.DeletarLeitorGateway;
import com.spring.io.project.infrastructure.repositories.DeletarLeitorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DeletarLeitorDataProvider implements DeletarLeitorGateway {

    private final DeletarLeitorRepository repository;

    @Override
    public void deletarLeitor(UUID codigoLeitor) {
        repository.deleteById(codigoLeitor);
    }
}
