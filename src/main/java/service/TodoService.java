package service;

import java.sql.SQLException;

public interface TodoService {
    List<Todo> findAll() throws SQLException;

    Todo save(Todo user) throws SQLException;

    Todo update(Todo user) throws SQLException;

    void delete(int usrId) throws SQLException;
}
