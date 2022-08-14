package com.spring.io.project.application.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SituacaoResponse {
    @JsonProperty("codigo_situacao")
    private Integer codigoSituacao;

    @JsonProperty("descricao_situacao")
    private String descricaoSitucao;
}
