package service;

import entity.User;

import java.sql.SQLException;

/**
 * 用户业务接口
 * @author ericheel
 */
public interface IUserService {

    User findUserByUsername(String username) throws SQLException;

    void createUser(User user) throws SQLException;
}
