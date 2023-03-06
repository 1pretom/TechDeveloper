package com.dh.conta;

import com.dh.conta.jdbc.ConnectionJDBC;
import com.dh.conta.model.Conta;
import org.apache.log4j.Logger;

import java.sql.*;

//para criar a conexão e inserir
public class Main {
    //a execução vai partir daqui

    final static Logger log = Logger.getLogger("Main.class"); //para chamar o log
    private static final String SQLCREATE = "DROP TABLE IF EXISTS Conta; "+
            "CREATE TABLE Conta "+
            "( id INT PRIMARY KEY, "+
            "nome VARCHAR (100) NOT NULL,"+
            "numConta VARCHAR (20) NOT NULL,"+
            "saldo numeric(15,2) );"; //no h2 double coloca numeric em que (total antes da virgula, dps da virgula)

    private static final String SQLINSERT = "INSERT INTO Conta (id,nome,numConta,saldo)"+ //inserindo nova conta
            "VALUES (?,?,?,?);"; //para inserir de forma dinâmica

    private static final String SQLUPDATE = "UPDATE Conta SET saldo = ? WHERE id = ?;"; //update na conta para alteração



    public static void main(String[] args) throws SQLException {
        Conta conta = new Conta(1,"Daniel","4565-23",10); //criando conta
        Connection connection = null; //setando como null


        try{
            log.info("Abrindo conexão com o banco de dados");
            connection = ConnectionJDBC.getConnection(); //setando conexão e pegando o método
            Statement statement = connection.createStatement(); //apenas executa o statement
            log.info("Criando a tabela conta");
            statement.execute(SQLCREATE);

            log.info("Criando Prepared Statement para o insert");
            PreparedStatement prStatementInsert = connection.prepareStatement(SQLINSERT);//executa e insere os dados lá do SQLINSERT
            prStatementInsert.setInt(1,conta.getId());
            prStatementInsert.setString(2,conta.getNome());
            prStatementInsert.setString(3, conta.getNumConta());
            prStatementInsert.setDouble(4,conta.getSaldo());

            log.info("Inserindo conta do(a) "+conta.getNome());
            prStatementInsert.execute();

            log.info("Fazendo o autocommit ser false");
            connection.setAutoCommit(false);

            log.info("Fazendo update de 10.0 na conta");
            PreparedStatement prStatementUpdate1 = connection.prepareStatement(SQLUPDATE);
            prStatementUpdate1.setDouble(1,conta.aumentarSaldo(10.0));
            prStatementUpdate1.setInt(2,conta.getId());
            log.warn("Alterando saldo da conta" +conta.getNumConta());
            prStatementUpdate1.execute();
            connection.commit();

            log.info("Não fazendo update de 15.0 na conta para dar erro em seguida");
            PreparedStatement prStatementUpdate2 = connection.prepareStatement(SQLUPDATE);
            prStatementUpdate1.setDouble(1,conta.aumentarSaldo(15.0));
            prStatementUpdate1.setInt(2,conta.getId());
            log.warn("Alterando saldo da conta" +conta.getNumConta());
            prStatementUpdate1.execute();

            log.info("Não fazendo update de 15.0 na conta para dar erro em seguida");
            PreparedStatement prStatementUpdate3 = connection.prepareStatement(SQLUPDATE);
            prStatementUpdate1.setDouble(1,conta.aumentarSaldo(15.0));
            prStatementUpdate1.setInt(2,conta.getId());
            log.warn("Alterando saldo da conta" +conta.getNumConta());
            prStatementUpdate1.execute();

            log.info("Não fazendo update de 15.0 na conta para dar erro em seguida");
            PreparedStatement prStatementUpdate4= connection.prepareStatement(SQLUPDATE);
            prStatementUpdate1.setDouble(1,conta.aumentarSaldo(15.0));
            prStatementUpdate1.setInt(2,conta.getId());
            log.warn("Alterando saldo da conta" +conta.getNumConta());
            prStatementUpdate1.execute();

            log.error("criando erro para ir pro rollback");
            int erro = 20/0;//assim vai dar ctrl+z em tudo que foi feito antes do ultimo commit
            connection.commit();


        }catch(Exception e){
            log.error("Erro ao executar transação");
            e.printStackTrace(); //lançando uma exceção
            log.warn("Foi executado um roolback das transações");
            connection.rollback();
        }finally{
            log.info("Fechando a conexão com o banco de dados");
            log.warn("O autocommit voltou a ser true");
            connection.setAutoCommit(true);
            connection.close();
        }

    }
}
