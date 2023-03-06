package com.dh.service;

import com.dh.model.Filiais;
import com.dh.jdbc.dao.IDao;
import com.dh.jdbc.dao.impl.FiliaisDao;

import java.sql.SQLException;

public class FiliaisService {

    public Filiais salvar(Filiais filiais) throws SQLException {
        IDao<Filiais> filiaisIDao = new FiliaisDao();
        return filiaisIDao.salvar(filiais);
    }
}

