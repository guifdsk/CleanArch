package com.spring.io.project.domain.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;


public class LeitorEntity {
    private UUID codigoLeitor;
    private String nomeLeitor;
    private String matriculaLeitor;
    private SituacaoEntity situacao;
    private TipoLeitorEntity tipo;
    private LocalDate dataCadastro;
    private LocalDate dataExclusao;
    private LocalDateTime dataAtualizacao;

    public UUID getCodigoLeitor() {
        return codigoLeitor;
    }

    public String getNomeLeitor() {
        return nomeLeitor;
    }

    public String getMatriculaLeitor() {
        return matriculaLeitor;
    }

    public SituacaoEntity getSituacao() {
        return situacao;
    }

    public TipoLeitorEntity getTipo() {
        return tipo;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public LocalDate getDataExclusao() {
        return dataExclusao;
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public LeitorEntity(UUID codigoLeitor, String nomeLeitor, String matriculaLeitor, SituacaoEntity situacao, TipoLeitorEntity tipo, LocalDate dataCadastro, LocalDate dataExclusao, LocalDateTime dataAtualizacao) {
        this.codigoLeitor = codigoLeitor;
        this.nomeLeitor = nomeLeitor;
        this.matriculaLeitor = matriculaLeitor;
        this.situacao = situacao;
        this.tipo = tipo;
        this.dataCadastro = dataCadastro;
        this.dataExclusao = dataExclusao;
        this.dataAtualizacao = dataAtualizacao;
    }
}
