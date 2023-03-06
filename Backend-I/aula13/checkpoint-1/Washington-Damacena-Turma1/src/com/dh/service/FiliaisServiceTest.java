package com.dh.service;

import com.dh.model.Filiais;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class FiliaisServiceTest {

    FiliaisService filiaisService;

    @BeforeEach
    void doBefore() {
        filiaisService = new FiliaisService();
    }

    @Test
    public void criarFilial() throws SQLException {
        Filiais filial = new Filiais();
        filial.setNome_filial("Salvador");
        filial.setRua("Centro");
        filial.setNumero("01");
        filial.setCidade("Salvador");
        filial.setEstado("BA");
        filial.setCinco_estrelas("S");

        System.out.println(filial);

    }
    @Test
    public void criarFilial2() throws SQLException {
        Filiais filial = new Filiais();
        filial.setNome_filial("Jaboatão");
        filial.setRua("Das neves");
        filial.setNumero("350");
        filial.setCidade("Jaboatão dos Guararapes");
        filial.setEstado("PE");
        filial.setCinco_estrelas("S");

        System.out.println(filial);

    }
    @Test
    public void criarFilial3() throws SQLException {
        Filiais filial = new Filiais();
        filial.setNome_filial("Santa Catarina");
        filial.setRua("dos Santos");
        filial.setNumero("20");
        filial.setCidade("Florianopolis");
        filial.setEstado("SC");
        filial.setCinco_estrelas("S");

        System.out.println(filial);

    }
    @Test
    public void criarFilial4() throws SQLException {
        Filiais filial = new Filiais();
        filial.setNome_filial("Rio de Janeiro");
        filial.setRua("Ramos");
        filial.setNumero("99");
        filial.setCidade("Rio de Janeiro");
        filial.setEstado("RJ");
        filial.setCinco_estrelas("S");

        System.out.println(filial);

    }
    @Test
    public void criarFilial5() throws SQLException {
        Filiais filial = new Filiais();
        filial.setNome_filial("Salvador 2");
        filial.setRua("Nelson");
        filial.setNumero("2");
        filial.setCidade("Salvador");
        filial.setEstado("BA");
        filial.setCinco_estrelas("S");


        System.out.println(filial);

    }

}
