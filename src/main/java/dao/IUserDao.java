package dao;

import entity.User;

import java.sql.SQLException;

/**
 *用户数据接口
 * @author ericheel
 */
public interface IUserDao {
    User findUserByUsername(String username) throws SQLException;

    void createUser(User user) throws SQLException;
}
