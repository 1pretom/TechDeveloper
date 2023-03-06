package com.dh.ecommerce.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity //entidade da base, isso informa que todos os atributos vão virar coluna
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //assim a tabela será autorizada a ser criada
    private Long id;
    @Column(nullable = false,length = 100)
    private String nome;
    private Timestamp dataHoraCadastro;
    private Double valor;
    private String lote;
    private String categoria;
    private String fornecedor;

}
