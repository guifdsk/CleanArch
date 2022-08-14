package com.spring.io.project.domain.entities;

public class SituacaoEntity {
    private Integer codigoSituacao;
    private String descricaoSitucao;

    public Integer getCodigoSituacao() {
        return codigoSituacao;
    }

    public String getDescricaoSitucao() {
        return descricaoSitucao;
    }

    public SituacaoEntity(Integer codigoSituacao, String descricaoSitucao) {
        this.codigoSituacao = codigoSituacao;
        this.descricaoSitucao = descricaoSitucao;
    }
}
