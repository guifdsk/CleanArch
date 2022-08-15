package com.spring.io.project.infrastructure.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "tb01_leitor")
@NoArgsConstructor
@AllArgsConstructor
public class Leitor {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Type(type = "uuid-char")
    @Column(name = "codigo_leitor")
    private UUID codigoLeitor;

    @Column(name = "nome_leitor")
    private String nomeLeitor;

    @Column(name = "matricula_leitor")
    private String matriculaLeitor;

    @ManyToOne
    @JoinColumn(name = "codigo_situacao")
    private Situacao situacao;

    @ManyToOne
    @JoinColumn(name = "codigo_tipo")
    private TipoLeitor tipo;

    @Column(name = "data_cadastro")
    private LocalDate dataCadastro;

    @Column(name = "data_exclusao")
    private LocalDate dataExclusao;

    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao;
}
