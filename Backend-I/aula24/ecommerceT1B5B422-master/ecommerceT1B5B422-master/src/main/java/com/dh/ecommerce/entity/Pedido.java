package com.dh.ecommerce.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Getter@Setter@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valor;
    private Timestamp dataEntrega;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @ManyToMany
    @JoinTable(name = "pedido-produto",
            joinColumns = @JoinColumn(name = "pedido"),
            inverseJoinColumns = @JoinColumn(name = "produto"))
    private List<Produto> produto;
}
