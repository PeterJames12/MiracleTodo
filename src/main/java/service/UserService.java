package service;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {

    List<User> findAll() throws SQLException;

    User save(User user) throws SQLException;

    User update(User user) throws SQLException;

    void delete(User user) throws SQLException;

    boolean checkPass(String email, String password);

}
