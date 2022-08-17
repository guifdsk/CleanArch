package com.spring.io.project.domain.gateways;

import java.util.UUID;

public interface BuscarLeitorPorCodGateway {
    boolean buscarLeitorPorCod(UUID codLeitor);
}
