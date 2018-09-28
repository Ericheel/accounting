package service;

import entity.Accounting;

import java.sql.SQLException;
import java.util.List;

/**
 * 记录 接口
 * @author  ericheel
 */
public interface IAccService {
    List<Accounting> findAccByUidAndDate(Integer id, String today) throws SQLException;
}
