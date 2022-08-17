package com.spring.io.project.application.usecases.impl;

import com.spring.io.project.application.usecases.DeletarLeitorUseCase;
import com.spring.io.project.domain.gateways.BuscarLeitorPorCodGateway;
import com.spring.io.project.domain.gateways.DeletarLeitorGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DeletarLeitorUseCaseImpl implements DeletarLeitorUseCase {

    private final DeletarLeitorGateway deletarLeitorGateway;
    private final BuscarLeitorPorCodGateway buscarLeitorPorCodGateway;

    @Override
    public void deletarLeitorUseCase(UUID codigoLeitor) throws ClassNotFoundException {
        if(buscarLeitorPorCodGateway.buscarLeitorPorCod(codigoLeitor)){
            deletarLeitorGateway.deletarLeitor(codigoLeitor);
        }
        else{
            throw new ClassNotFoundException("Leitor não encontrado");
        }
        
    }
}
