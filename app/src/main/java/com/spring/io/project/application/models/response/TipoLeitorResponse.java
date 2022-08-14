package com.spring.io.project.application.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoLeitorResponse {
    @JsonProperty("codigo_tipo_leitor")
    private String codigoTipo;

    @JsonProperty("tipo_leitor")
    private String tipoLeitor;

    @JsonProperty("tipo_descricao")
    private String tipoDescricao;

    @JsonProperty("prazo_maximo_dias")
    private String prazoMaximoDias;

    @JsonProperty("quantidade_liros")
    private String quantidadeLivros;
}
