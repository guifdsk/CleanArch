package com.spring.io.project.application.usecases;

import com.spring.io.project.application.models.response.BuscarLeitoresResponse;

import java.util.List;

public interface BuscarLeitoresUseCase {
    List<BuscarLeitoresResponse> buscarLeitoresUseCase();
}
