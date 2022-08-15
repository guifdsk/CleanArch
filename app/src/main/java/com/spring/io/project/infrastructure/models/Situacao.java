package com.spring.io.project.infrastructure.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "tb03_situacao_leitor")
public class Situacao {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_situacao")
    private Integer codigoSituacao;

    @Column(name = "descricao_situacao")
    private String descricaoSitucao;
}
