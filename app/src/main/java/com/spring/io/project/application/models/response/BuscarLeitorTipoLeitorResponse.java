package com.spring.io.project.application.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BuscarLeitorTipoLeitorResponse {
    @JsonProperty("codigo_tipo")
    private String codigoTipo;

    @JsonProperty("tipo_leitor")
    private String tipoLeitor;

    @JsonProperty("tipo_descricao")
    private String tipoDescricao;

    @JsonProperty("prazo_maximo_dias")
    private String prazoMaximoDias;

    @JsonProperty("quantidade_livros")
    private String quantidadeLivros;
}
