package dao.impl;

import dao.IUserDao;
import entity.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import util.C3P0Utils;

import java.sql.SQLException;

/**
 * 用户数据接口实现类
 *
 * @author ericheel
 */
public class UserDaoImpl implements IUserDao {
    private QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());

    @Override
    public User findUserByUsername(String username) throws SQLException {
        final String sql = "SELECT id,username,password FROM user WHERE username = ?";
        return queryRunner.query(sql, new BeanHandler<>(User.class), username);
    }

    @Override
    public void createUser(User user) throws SQLException {
        final String sql = "INSERT INTO user VALUES(null,?,?)";
        queryRunner.execute(sql, user.getUsername(), user.getPassword());
    }
}
