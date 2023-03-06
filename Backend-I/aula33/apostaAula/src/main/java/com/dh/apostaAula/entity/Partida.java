package com.dh.apostaAula.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "partida")
public class Partida {
    @Id
    private  Integer id;
    private String resultado;
    private Estado estado;
    @Field(name = "equipe_visitante")
    private Equipe equipeVisitante;
    @Field(name = "equipe_local")
    private Equipe equipeLocal;
    private double valor;

}
