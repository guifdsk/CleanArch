package com.spring.io.project.infrastructure.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "tb02_contato")
@NoArgsConstructor
@AllArgsConstructor
public class Contato {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Type(type = "uuid-char")
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
