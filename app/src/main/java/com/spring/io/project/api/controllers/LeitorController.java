package com.spring.io.project.api.controllers;

import com.spring.io.project.application.models.request.SalvarLeitorRequest;
import com.spring.io.project.application.models.response.BuscarLeitorResponse;
import com.spring.io.project.application.models.response.SalvarLeitorResponse;
import com.spring.io.project.application.usecases.BuscarLeitorUseCase;
import com.spring.io.project.application.usecases.DeletarLeitorUseCase;
import com.spring.io.project.application.usecases.SalvarLeitorUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/leitores")
public class LeitorController {
    private final BuscarLeitorUseCase buscarLeitorUseCase;
    private final DeletarLeitorUseCase deletarLeitorUseCase;
    private final SalvarLeitorUseCase salvarLeitorUseCase;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> salvarLeitor(@RequestBody SalvarLeitorRequest request){
        SalvarLeitorResponse response = salvarLeitorUseCase.salvarLeitorUseCase(request);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> buscarLeitor(){
        List<BuscarLeitorResponse> leitores = buscarLeitorUseCase.buscarLeitorUseCase();
        return new ResponseEntity(leitores, HttpStatus.OK);
    }

    @DeleteMapping("/{cod_leitor}")
    public ResponseEntity<Object> deletarLeitor(
            @PathVariable("cod_leitor") UUID codigoLeitor) throws Exception {
        try{
            deletarLeitorUseCase.deletarLeitorUseCase(codigoLeitor);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
