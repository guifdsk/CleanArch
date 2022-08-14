package com.spring.io.project.application.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spring.io.project.domain.entities.SituacaoEntity;
import com.spring.io.project.domain.entities.TipoLeitorEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BuscarLeitoresResponse {
    @JsonProperty("codigo_leitor")
    private UUID codigoLeitor;

    @JsonProperty("nome_leitor")
    private String nomeLeitor;

    @JsonProperty("matricula_leitor")
    private String matriculaLeitor;

    @JsonProperty("situacao_leitor")
    private SituacaoResponse situacao;

    @JsonProperty("tipo_leitor")
    private TipoLeitorResponse tipo;

    @JsonProperty("data_cadastro")
    private LocalDate dataCadastro;

    @JsonProperty("data_exclusao")
    private LocalDate dataExclusao;

    @JsonProperty("data_atualizacao")
    private LocalDateTime dataAtualizacao;
}
