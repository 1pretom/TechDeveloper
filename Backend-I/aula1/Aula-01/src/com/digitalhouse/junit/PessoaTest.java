package com.digitalhouse.junit;

import org.junit.jupiter.api.*;

public class PessoaTest {

    @BeforeAll
    static void doBeforeAll(){
        System.out.println("Está dentro do Before All");
    }

    @BeforeEach
    void doBefore(){
        System.out.println("Está dentro do before each");
    }

    @Test
    void adicionarColecao1(){
        System.out.println("teste 1");
    }
    @Test
    void adicionarColecao2(){
        System.out.println("teste 2");
    }
    @Test
    @Disabled("Teste 3 não foi executado")
    void adicionarColecao3(){
        System.out.println("teste 3");
    }
    @Test
    void adicionarColecao4(){
        System.out.println("teste 4");
    }
    @AfterEach
    void doAfter(){
        System.out.println("Está dentro do after each");
    }
    @AfterAll
    static void doAfterAll(){
        System.out.println("Está dentro do after All");
    }

}