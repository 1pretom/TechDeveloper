package dao.impl;

import dao.IDao;
import dao.configuracao.ConfiguracaoJDBC;

import model.Endereco;
import model.Paciente;
import org.apache.log4j.Logger;
import util.Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class PacienteDaoH2 implements IDao<Paciente> {


    final  static Logger log = Logger.getLogger(Paciente.class);
    private ConfiguracaoJDBC configuracaoJDBC;

    private Connection getConnection() throws SQLException, ClassNotFoundException {
        configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver","jdbc:h2:~/odonto;AUTO_SERVER=TRUE;INIT=RUNSCRIPT FROM 'create.sql'","sa","");
        return configuracaoJDBC.getConnection();
    }

    @Override
    public Paciente salvar(Paciente paciente) throws SQLException, ClassNotFoundException {
        log.debug("Registrando paciente : " + paciente.toString());

        String query = String.format("INSERT INTO PACIENTE " +
                        "(NOME, SOBRENOME, RG, DATA_CADASTRO, endereco) " +
                        "VALUES ('%s','%s','%s','%s','%s')",
                paciente.getNome(),
                paciente.getSobrenome(),
                paciente.getRg(),
                paciente.getDataCadastro(),
                paciente.getEndereco());
        try {
            Connection conexao = getConnection();
            Statement stmt = conexao.createStatement();
            stmt.execute(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = stmt.getGeneratedKeys();
            if (keys.next())
                paciente.setId(keys.getInt(1));
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return paciente;
    }

    @Override
    public Optional<Paciente> buscar(Integer id) throws ClassNotFoundException {
        log.debug("Buscando paciente com id  : " + id);

        String query = String.format("SELECT ID, NOME, SOBRENOME, RG, DATA_CADASTRO, endereco FROM PACIENTE WHERE ID = '%s'", id);
        Paciente paciente = null;
        try {
            Connection conexao = getConnection();
            Statement stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(query);
            while (resultado.next()) {
                paciente = criarObjetoPaciente(resultado);
            }

            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return paciente != null ? Optional.of(paciente) : Optional.empty();
    }

    @Override
    public void excluir(Integer id) {
        log.debug("Excluindo paciente com id: " + id);
        String query = String.format("DELETE FROM PACIENTE WHERE ID = %s", id);
        try {
            Connection conexao = getConnection();
            Statement stmt = conexao.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Paciente> buscarTodos() throws ClassNotFoundException {
        log.debug("Buscando todos os pacientes");
        String query = "SELECT * FROM PACIENTE";
        List<Paciente> pacientes = new ArrayList<>();
        try {

            Connection conexao = getConnection();
            Statement stmt = conexao.createStatement();
            ResultSet resultado = stmt.executeQuery(query);
            while (resultado.next()) {
                pacientes.add(criarObjetoPaciente(resultado));
            }

            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return pacientes;
    }

    private Paciente criarObjetoPaciente(ResultSet result) throws SQLException {

        Integer idPaciente = result.getInt("ID");
        String nome = result.getString("NOME");
        String sobrenome = result.getString("SOBRENOME");
        String rg = result.getString("RG");
        LocalDate dataCadastro = result.getDate("DATA_CADASTRO").toLocalDate();
        String endereco = result.getString("endereco");
        return new Paciente(idPaciente, nome, sobrenome, rg, dataCadastro, endereco);

    }
}
