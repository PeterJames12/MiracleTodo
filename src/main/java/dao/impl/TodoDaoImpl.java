package dao.impl;

import dao.TodoDao;
import model.Todo;
import model.User;

public class TodoDaoImpl extends CrudDaoImpl<Todo> implements TodoDao {

    @Override
    public User getByEmail(String email) {
        return null;
    }
}
