package com.dh.clinica.service;

import dao.impl.PacienteDaoH2;
import model.Endereco;
import model.Paciente;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import service.PacienteService;

import java.time.LocalDate;
import java.util.List;

public class PacienteServiceTest {
    private static PacienteService pacienteService = new PacienteService(new PacienteDaoH2());

    @Test
    public void excluirPacienteTest() {
        pacienteService.excluir(3);
        Assert.assertTrue(pacienteService.buscar(3).isEmpty());

    }

    @Test
    public void trazerTodos() {
        pacienteService.salvar(new Paciente("Marcio", "Oliveira", "12345678", LocalDate.now(), "Av. São João - 123"));
        List<Paciente> pacientes = pacienteService.buscarTodos();
        Assert.assertTrue(!pacientes.isEmpty());
    }


    @Test
    public void salvarPaciente(){
        Endereco endereco = new Endereco("Av. São João", "123", "Rio de Janeiro", "Copacabana");
        Paciente p = pacienteService.salvar(new Paciente("Marcio", "Oliveira", "12345678", LocalDate.now(), "Av. São João - 123"));
        Assert.assertTrue(p.getId() > 0);
    }

}
