package com.spring.io.project.application.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalvarLeitorRequest {
    @JsonProperty("nome_leitor")
    private String nomeLeitor;

    @JsonProperty("matricula_leitor")
    private String matriculaLeitor;

    @JsonProperty("situacao_leitor")
    private Integer situacao;

    @JsonProperty("tipo_leitor")
    private Integer tipo;

    @JsonProperty("data_cadastro")
    private LocalDate dataCadastro;
}
