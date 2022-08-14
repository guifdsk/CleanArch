package com.spring.io.project.infrastructure.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "tb01_leitor")
public class Leitor {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
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

//    @OneToOne(mappedBy="leitor", cascade = CascadeType.ALL)
//    private Contato contato;
//
//    @OneToMany(mappedBy="leitor", cascade = CascadeType.ALL)
//    private List<Advertencia> advertencia;
}
