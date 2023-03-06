package com.dh.farmacia.dao;

import java.sql.SQLException;

//esse T serve para criar interface generica
public interface IDao <T>{
    public T salvar (T t) throws SQLException;
//    public T deletar(T t) throws SQLException;
}

