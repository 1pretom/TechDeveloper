package com.dh.dao.impl;

import com.dh.Paciente;
import com.dh.dao.IDao;
import com.dh.dao.configuracao.ConfiguracaoJDBC;
import org.apache.log4j.Logger;

public class PacienteDaoH2 implements IDao<Paciente> {
    private ConfiguracaoJDBC configuracaoJDBC;
    private EnderecoDaoh2 enderecoDaoh2;
    final static Logger log = Logger.getLogger(PacienteDaoH2.class);

    public PacienteDaoH2(ConfiguracaoJDBC configuracaoJDBC, EnderecoDaoh2 enderecoDaoh2) {
        this.configuracaoJDBC = new ConfiguracaoJDBC();
        this.enderecoDaoh2 = enderecoDaoh2;
    }

    @Override
    public Paciente salvar(Paciente paciente) {
        log.
        return null;
    }
}
