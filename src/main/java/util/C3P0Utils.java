package util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * C3P0连接池工具类
 *
 * @author ericheel
 */
public class C3P0Utils {
    private C3P0Utils() {
    }

    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();

    /**
     * 获取连接池
     *
     * @return
     */
    public static DataSource getDataSource() {
        return dataSource;
    }

    /**
     * 获取连接对象
     *
     * @return
     */
    public static Connection getConnection() {
        Connection connection;

        try {
            connection = dataSource.getConnection();
            return connection;
        } catch (Exception e) {
            throw new RuntimeException("server busy...");
        }
    }

    /**
     * 释放连接
     *
     * @param connection
     */
    public static void releaseAll(Connection connection) {
        if (null != connection) {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            connection = null;
        }
    }
}
