package dao;

import model.Todo;
import model.User;

public interface TodoDao extends CrudDao<Todo> {

    User getByEmail(String email);
}
