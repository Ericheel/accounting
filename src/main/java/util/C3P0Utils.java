package util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * C3P0连接池工具类
 *
 * @author ericheel
 */
public class C3P0Utils {
    private C3P0Utils() {
    }

    private ComboPooledDataSource dataSource = new ComboPooledDataSource();
}
