package com.dh.conta.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//classe responsável por realizar a conexão invés de instanciar toda hora
public class ConnectionJDBC {
    //static para não precisar instanciar sempre
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/conta;AUTO_SERVER=TRUE","sa","");
    }

}

