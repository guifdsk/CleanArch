package com.spring.io.project.infrastructure.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "tb04_tipo_leitor")
public class TipoLeitor {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_tipo")
    private String codigoTipo;

    @Column(name = "tipo_leitor")
    private String tipoLeitor;

    @Column(name = "tipo_descricao")
    private String tipoDescricao;

    @Column(name = "prazo_max_dias")
    private String prazoMaximoDias;

    @Column(name = "quantidade_livros")
    private String quantidadeLivros;
}
