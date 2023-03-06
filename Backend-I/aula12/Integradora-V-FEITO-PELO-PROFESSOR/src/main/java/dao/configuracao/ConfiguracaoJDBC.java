package dao.configuracao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracaoJDBC {
    private String jdbcDriver;
    private String dbUrl;
    private String usuario;
    private String senha;

    public ConfiguracaoJDBC(String jdbcDriver, String dbUrl, String usuario, String senha) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(jdbcDriver);
        return DriverManager.getConnection(dbUrl,usuario,senha);
    }
}
