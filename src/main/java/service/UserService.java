package service;

import java.sql.SQLException;

public interface UserService {

    List<User> findAll() throws SQLException;

    User save(User user) throws SQLException;

    User update(User user) throws SQLException;

    void delete(int usrId) throws SQLException;

}
