package service;

import model.Todo;

import java.sql.SQLException;
import java.util.List;

public interface TodoService {

    List<Todo> findAll() throws SQLException;

    Todo save(Todo user) throws SQLException;

    Todo update(Todo user) throws SQLException;

    void delete(int usrId) throws SQLException;

    List<Todo> getTodoByUserId() throws SQLException;
}
