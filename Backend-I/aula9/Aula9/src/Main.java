import org.apache.log4j.Logger;

import java.sql.*;

public class Main {
    //método logger com static final para indicar que não vai mudar
    private static final Logger logger = Logger.getLogger(Main.class);

    //método static final para o banco de dados, variáveis constantes usamos em maiúsculo
    //criando o banco de dados como no MYSQL
    private static final String SQLCREATETABLE = "DROP TABLE IF EXISTS Animal;" +
            " CREATE TABLE Animal " +
            "(id INT PRIMARY KEY, " +
            " nome VARCHAR(100) NOT NULL," +
            " tipo VARCHAR(50) NOT NULL);";

    //criando animais para colocar no banco de dados
    private static final String SQLINSERT1 = "INSERT INTO Animal (id,nome,tipo) VALUES" +
            " (1,'Meg','Cachorro');";

    private static final String SQLINSERT2 = "INSERT INTO Animal (id,nome,tipo) VALUES" +
            " (2,'Mingau','Gato');";

    private static final String SQLINSERT3 = "INSERT INTO Animal (id,nome,tipo) VALUES" +
            " (3,'Dumbo','Elefante');";

    private static final String SQLINSERT4 = "INSERT INTO Animal (id,nome,tipo) VALUES" +
            " (4,'Pup','Cachorro');";

    private static final String SQLINSERT5 = "INSERT INTO Animal (id,nome,tipo) VALUES" +
            " (5,'Pé de pano','Cavalo');";

    //criando comando para deletar algo da tabela
    private static final String SQLDELETE = "DELETE FROM Animal WHERE id = 1;";

    //criando comando para selecionar os animais
    private static final String SQLSELECT = "SELECT * FROM Animal;";

    //método para imprimir os animais
    private static void imprimirAnimal(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQLSELECT);
        logger.info("Imprimindo animais");
        while (resultSet.next()){
            System.out.println(resultSet.getInt("id")+ " - "+
                    resultSet.getString("nome")+ " - "+
                    resultSet.getString("tipo"));
        }
    }

    //criando uma conexão com o banco de dados h2
    public static void main(String[] args) throws SQLException {
        Connection connection = null;

        try{
            logger.info("Abrindo conexão com o banco de dados");
            connection = getConnection();
            Statement statement = connection.createStatement(); //criando statement para fazer criações e inserções no Banco de Dados
            logger.info("Criando tabela no banco de dados");
            statement.execute(SQLCREATETABLE);//para executar a base de dados criada

            logger.info("Inserindo animal 1");
            statement.execute(SQLINSERT1);
            logger.info("Inserindo animal 2");
            statement.execute(SQLINSERT2);
            logger.info("Inserindo animal 3");
            statement.execute(SQLINSERT3);
            logger.info("Inserindo animal 4");
            statement.execute(SQLINSERT4);
            logger.info("Inserindo animal 5");
            statement.execute(SQLINSERT5);


            imprimirAnimal(connection);//consultando animal antes de deletar

            logger.warn("Deletando um animal"); //apagando animal
            statement.execute(SQLDELETE);

            imprimirAnimal(connection);//consultando animal depois de deletar



        }catch (Exception e){
            e.printStackTrace();
            //System.out.println(e.getMessage()); outro jeito de receber a mensagem desse erro
            logger.error("Erro ao executar SQL");
        }finally {
//            if(connection == null)
//                return;
            if (connection == null){
                return;
            }
            logger.info("Fechando conexão com o banco de dados");
            connection.close();
        }
    }



    //abrindo a conexão
    public static Connection getConnection() throws ClassNotFoundException, SQLException {//exceções que utiliza
        Class.forName("org.h2.Driver");//passando o "driver" traduz para o banco de dados
        return DriverManager.getConnection("jdbc:h2:~/animal;AUTO_SERVER=TRUE","sa","");//passando os parametros de como ele vai conectar
    }
}
