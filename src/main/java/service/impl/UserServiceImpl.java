package service.impl;

import dao.IUserDao;
import dao.impl.UserDaoImpl;
import entity.User;
import lombok.RequiredArgsConstructor;
import service.IUserService;

import java.sql.SQLException;

/**
 * 用户业务接口实现类
 * @author ericheel
 */
public class UserServiceImpl implements IUserService {

    private static IUserDao userDao = new UserDaoImpl();

    @Override
    public User findUserByUsername(String username) throws SQLException {
        return userDao.findUserByUsername(username);
    }

    @Override
    public void createUser(User user) throws SQLException {
        userDao.createUser(user);
    }
}
