package com.spring.io.project.application.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalvarLeitorResponse {
    @JsonProperty("codigo_leitor")
    private UUID codigoLeitor;

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
