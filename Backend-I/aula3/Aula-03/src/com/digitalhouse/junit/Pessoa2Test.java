package com.digitalhouse.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pessoa2Test {
    //Instanciando classe
    Pessoa2 pessoa = new Pessoa2();
    //Testando se é maior
    @Test
    void isMaiorIdade(){
        Assertions.assertTrue(pessoa.verificaMaioridade(18));
    }
    //Testando se não é maior
    @Test
    void notMaiorIdade(){
        Assertions.assertTrue(pessoa.verificaMaioridade(17));
    }
    //Testando se os números são iguais
    @Test
    void isIguais(){
        Assertions.assertTrue(pessoa.validaIgualdadeNumeros(1,1));
    }
    //Testando se não são iguais
    @Test
    void notIguais(){
        Assertions.assertTrue(pessoa.validaIgualdadeNumeros(1,2));
    }
    //Testando se retorna 20
    @Test
    void return20Test(){
        Assertions.assertEquals(20,pessoa.retorna20());
    }




}