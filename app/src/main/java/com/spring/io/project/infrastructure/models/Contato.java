package com.spring.io.project.infrastructure.models;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "tb02_contato")
public class Contato {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "codigo_contato")
    private UUID codigoContato;

    @Column(name = "lougradouro")
    private String lougradoro;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "codigo_postal")
    private String codigoPostal;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "sigla_uf")
    private String siglaEstado;

    @Column(name = "numero_celular")
    private String numeroCelular;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_leitor")
    private Leitor leitor;
}
