package com.spring.io.project.api.controllers;

import com.spring.io.project.application.models.request.SalvarLeitorRequest;
import com.spring.io.project.application.models.response.BuscarLeitorResponse;
import com.spring.io.project.application.models.response.SalvarLeitorResponse;
import com.spring.io.project.application.usecases.BuscarLeitorUseCase;
import com.spring.io.project.application.usecases.SalvarLeitorUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/leitores")
public class LeitorController {
    private final BuscarLeitorUseCase useCase;
    private final SalvarLeitorUseCase salvarLeitorUseCase;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> salvarLeitor(@RequestBody SalvarLeitorRequest request){
        SalvarLeitorResponse response = salvarLeitorUseCase.salvarLeitorUseCase(request);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> buscarLeitor(){
        List<BuscarLeitorResponse> leitores = useCase.buscarLeitorUseCase();
        return new ResponseEntity(leitores, HttpStatus.OK);
    }
}
