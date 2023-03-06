package dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface IDao<T> {

    public T salvar(T t) throws SQLException, ClassNotFoundException;
    public Optional<T> buscar(Integer id) throws ClassNotFoundException;
    public void excluir(Integer id);
    public List<T> buscarTodos() throws ClassNotFoundException;

}
