package com.dh.farmacia.service;

import com.dh.farmacia.dao.IDao;
import com.dh.farmacia.dao.impl.MedicamentosDaoH2;
import com.dh.farmacia.model.Medicamento;

import java.sql.SQLException;

public class MedicamentoService {
    //para salvar o medicamento chamando o service, dessa forma um trata os dados e o outro os armazena
    public Medicamento salvar (Medicamento medicamento) throws SQLException {
        IDao<Medicamento> medicamentoIDao = new MedicamentosDaoH2();
        return medicamentoIDao.salvar(medicamento);
    }
//    public Medicamento deletar (Medicamento medicamento) throws SQLException{
//        IDao<Medicamento> medicamentoIDao = new MedicamentosDaoH2();
//        return medicamentoIDao.salvar(medicamento);
//    }
}
