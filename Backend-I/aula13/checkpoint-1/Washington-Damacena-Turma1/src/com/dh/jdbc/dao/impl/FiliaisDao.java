package com.dh.jdbc.dao.impl;

import com.dh.model.Filiais;
import com.dh.jdbc.dao.ConnectionJDBC;
import com.dh.jdbc.dao.IDao;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FiliaisDao  implements IDao<Filiais> {

    final static Logger logger = Logger.getLogger(FiliaisDao.class);

    private ConnectionJDBC connectionJDBC;

    private Connection getConnection() throws SQLException, ClassNotFoundException {
        connectionJDBC = new ConnectionJDBC("org.h2.Driver", "jdbc:h2:~/filiais;AUTO_SERVER=TRUE;INIT=RUNSCRIPT FROM 'create.sql'", "sa", "");
        return connectionJDBC.getConnection();
    }

    public FiliaisDao() {
        this.connectionJDBC = connectionJDBC;
    }



    @Override
    public Filiais salvar(Filiais filiais) throws SQLException {
        String SQLINSERT = String.format("INSERT INTO filiais ( nome, rua, numero, cidade, estado, cinco_estrelas ) VALUES ('%s', '%s', '%s', '%s', '%s' , '%s', '%s')))",
                filiais.getNome_filial(), filiais.getRua(), filiais.getNumero(), filiais.getCidade(), filiais.getEstado(), filiais.getCinco_estrelas());
        Connection connection = null;
        try{
            logger.info("Abrindo conexao");
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQLINSERT, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();

            if(resultSet.next()) {
                filiais.setId(resultSet.getInt("id"));
            }

        }catch (Exception e) {
            logger.error("Erro no banco de dados");
            e.printStackTrace();
        } finally {
            logger.info( "Fechando conexao ");
            connection.close();
        }

        return filiais;
    }
}
