package service;

import model.Todo;
import model.User;

import java.sql.SQLException;
import java.util.List;

public interface TodoService {

    List<Todo> findAll() throws SQLException;

    Todo save(Todo user) throws SQLException;

    Todo update(Todo user) throws SQLException;

    void delete(Todo user) throws SQLException;
}
