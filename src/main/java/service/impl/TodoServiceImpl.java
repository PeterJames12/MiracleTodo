package service.impl;

import dao.TodoDao;
import dao.impl.TodoDaoImpl;
import model.Todo;
import service.TodoService;

import java.sql.SQLException;
import java.util.List;

public class TodoServiceImpl implements TodoService {

    @Override
    public List<Todo> findAll() throws SQLException {
        return null;
    }

    @Override
    public Todo save(Todo todo) throws SQLException {
        TodoDao todoDao = new TodoDaoImpl();
        return todoDao.save(todo);
    }

    @Override
    public Todo update(Todo todo) throws SQLException {
        TodoDao todoDao = new TodoDaoImpl();
        return todoDao.update(todo);
    }

    @Override
    public void delete(Todo todo) throws SQLException {
        TodoDao todoDao = new TodoDaoImpl();
        todoDao.update(todo);

    }
}
