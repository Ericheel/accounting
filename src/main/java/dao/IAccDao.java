package dao;

import entity.Accounting;

import java.sql.SQLException;
import java.util.List;

/**
 * 记录 数据层 接口
 * @author ericheel
 */
public interface IAccDao {
    List<Accounting> findAccByUidAndDate(Integer id, String today) throws SQLException;
}
