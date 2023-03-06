package com.dh.farmacia.dao.impl;

import com.dh.farmacia.dao.ConfiguracaoJDBC;
import com.dh.farmacia.dao.IDao;
import com.dh.farmacia.model.Medicamento;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//aqui que implementa a interface genérica
public class MedicamentosDaoH2 implements IDao<Medicamento> {

    final static Logger logger = Logger.getLogger(MedicamentosDaoH2.class); //criando o logger
    private ConfiguracaoJDBC configuracaoJDBC; //criando conexão para salvar o medicamento no banco de dados

    private Connection getConnection() throws SQLException, ClassNotFoundException { //chamando a conexão do "drive"
        //aqui agora ganha a função de chamar o create.sql pra jogada
        configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver","jdbc:h2:~/farmacia;AUTO_SERVER=TRUE;INIT=RUNSCRIPT FROM 'create.sql'","sa","");
        return configuracaoJDBC.getConnection();
    }

    @Override
    public Medicamento salvar(Medicamento medicamento) throws SQLException {
        //a tabela é criada fora do arquivo, num arquivo ".sql" que contém as instruções
        String SQLInsert = String.format("INSERT INTO medicamento(nome, laboratorio, quantidade, preco) VALUES ('%s','%s','%s','%s')",
                medicamento.getNome(),medicamento.getLaboratorio(),medicamento.getQuantidade(),medicamento.getPreco()); //Criando insert de outra maneira melhor
        Connection connection = null;

        try{
            logger.info("Abrindo conexão");
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQLInsert, Statement.RETURN_GENERATED_KEYS);//executa e manda gerar em algum lugar uma chave
            ResultSet resultSet = statement.getGeneratedKeys();//pede pra pegar a chave que foi gerada
            //tudo que o statement traz ele traz como ResultSet
            if (resultSet.next()) {//se o resultSet for diferente de nulo ele segue
                medicamento.setId(resultSet.getInt(1));//se existe um próximo, então ele salvou e aí vamos setar o id passando a posição
            }

        }catch( Exception e){
            logger.error("Erro no banco de dados");
            e.printStackTrace();
        }finally {
            logger.info("Fechando conexão");
            connection.close();
        }
        return medicamento;
    }

//    @Override
//    public Medicamento deletar(Medicamento medicamento) throws SQLException {
//        String SQLDelete = String.format("DELETE")
//        return medicamento;
//    }


}
