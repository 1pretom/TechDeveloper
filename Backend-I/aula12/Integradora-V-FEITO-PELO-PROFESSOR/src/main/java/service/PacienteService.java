package service;

import dao.IDao;
import model.Paciente;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class PacienteService {

    private IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente salvar(Paciente paciente){
        try {
            pacienteIDao.salvar(paciente);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return paciente;
    }

    public Optional<Paciente> buscar(Integer id){
        try {
            return pacienteIDao.buscar(id);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Paciente> buscarTodos(){
        try {
            return pacienteIDao.buscarTodos();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void excluir(Integer id){
        pacienteIDao.excluir(id);
    }
}
