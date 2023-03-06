package com.dh.dao.configuracao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracaoJDBC {
    private String jdbcDriver, dbUrl, nomeUsuario, senhaUsuario;

    //construtor que pode ser usado para conectar com outra configuração

    public ConfiguracaoJDBC(String jdbcDriver, String dbUrl, String nomeUsuario, String senhaUsuario) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.nomeUsuario = nomeUsuario;
        this.senhaUsuario = senhaUsuario;
    }
    public ConfiguracaoJDBC(){
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.nomeUsuario = nomeUsuario;
        this.senhaUsuario = senhaUsuario;
    }

//    public ConfiguracaoJDBC() {
//        this.jdbcDriver = "org.h2.Driver";
//        this.dbUrl = "jdbc:h2:mem:test;" +
//                "DB_CLOSE_DELAY=-1;" +
//                "INIT=RUNSCRIPT FROM 'create.sql'";
//        this.nomeUsuario = "sa";
//        this.senhaUsuario = "";
//    }

    public Connection conectarComBancoDeDados(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    dbUrl, nomeUsuario, senhaUsuario
            );
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return connection;
    }

}
