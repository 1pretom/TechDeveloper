package com.dh.farmacia.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracaoJDBC {
    //Toda vez que criar configuration jdbc tem que criar esses atributos
    private String jdbcDriver, dbUrl, usuario, senha;

    //construtor

    public ConfiguracaoJDBC(String jdbcDriver, String dbUrl, String usuario, String senha) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.usuario = usuario;
        this.senha = senha;
    }

    //método
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(jdbcDriver);
        return DriverManager.getConnection(dbUrl,usuario,senha);
    }
}