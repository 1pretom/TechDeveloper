package com.dh.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

    private String jdbcDriver;
    private String databaseUrl;
    private String usuario;
    private String senha;

    public ConnectionJDBC(String jdbcDriver, String databaseUrl, String usuario, String senha) {
        this.jdbcDriver = jdbcDriver;
        this.databaseUrl = databaseUrl;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(jdbcDriver);
        return DriverManager.getConnection(databaseUrl, usuario, senha);
    };


}
