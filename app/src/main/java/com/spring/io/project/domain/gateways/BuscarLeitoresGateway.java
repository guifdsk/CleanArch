package com.spring.io.project.domain.gateways;

import com.spring.io.project.domain.entities.LeitorEntity;

import java.util.List;

public interface BuscarLeitoresGateway {
    List<LeitorEntity> buscarLeitoresGateway();
}
