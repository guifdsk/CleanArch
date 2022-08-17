package com.spring.io.project.infrastructure.dataproviders;

import com.spring.io.project.domain.gateways.BuscarLeitorPorCodGateway;
import com.spring.io.project.infrastructure.repositories.BuscarLeitorPorCodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BuscarLeitorPorCodDataProvider implements BuscarLeitorPorCodGateway {

    private final BuscarLeitorPorCodRepository buscarLeitorPorCodRepository;

    @Override
    public boolean buscarLeitorPorCod(UUID codLeitor) {
       return ((buscarLeitorPorCodRepository.findById(codLeitor)).isEmpty()) ? false : true;
    }
}
