package com.spring.io.project.api.controllers;

import com.spring.io.project.application.models.response.BuscarLeitoresResponse;
import com.spring.io.project.application.usecases.BuscarLeitoresUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/leitores")
public class LeitorController {
    private final BuscarLeitoresUseCase useCase;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> buscarLeitores(){
        List<BuscarLeitoresResponse> leitores = useCase.buscarLeitoresUseCase();

        return ResponseEntity.ok(leitores);
    }
}
