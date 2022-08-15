package com.spring.io.project.infrastructure.models;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
@Table(name = "tb05_advertencia")
public class Advertencia {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Type(type = "uuid-char")
    @Column(name = "codigo_advertencia")
    private UUID codigoAdvertencia;

    @Column(name = "data_advertencia")
    private LocalDate dataAdvcertencia;

    @Column(name = "descricao_advertencia")
    private String descricaoAdvertencia;

    @ManyToOne
    @JoinColumn(name = "codigo_leitor")
    private Leitor leitor;

}
