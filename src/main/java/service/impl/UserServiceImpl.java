package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import model.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import service.UserService;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public List<User> findAll() throws SQLException {
        return null;
    }

    @Override
    public User save(User user) throws SQLException {
        return null;
    }

    @Override
    public User update(User user) throws SQLException {
        return null;
    }

    @Override
    public void delete(int usrId) throws SQLException {

    }

    @Override
    public boolean checkPass(String email, String password) {
        final User user = new User(); // todo get from db
        final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.matches(password, user.getPassword());
    }
}
