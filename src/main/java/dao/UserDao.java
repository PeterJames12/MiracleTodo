package dao;

import model.User;

public interface UserDao extends CrudDao<User> {

    User getByEmail(String email);

}
