package com.spring.io.project.domain.entities;

public class TipoLeitorEntity {
    private Integer codigoTipo;
    private String tipoLeitor;
    private String tipoDescricao;
    private String prazoMaximoDias;
    private String quantidadeLivros;

    public Integer getCodigoTipo() {
        return codigoTipo;
    }

    public String getTipoLeitor() {
        return tipoLeitor;
    }

    public String getTipoDescricao() {
        return tipoDescricao;
    }

    public String getPrazoMaximoDias() {
        return prazoMaximoDias;
    }

    public String getQuantidadeLivros() {
        return quantidadeLivros;
    }

    public TipoLeitorEntity(Integer codigoTipo, String tipoLeitor, String tipoDescricao, String prazoMaximoDias, String quantidadeLivros) {
        this.codigoTipo = codigoTipo;
        this.tipoLeitor = tipoLeitor;
        this.tipoDescricao = tipoDescricao;
        this.prazoMaximoDias = prazoMaximoDias;
        this.quantidadeLivros = quantidadeLivros;
    }
}
