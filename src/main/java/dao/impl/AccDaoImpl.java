package dao.impl;

import dao.IAccDao;
import entity.Accounting;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import util.C3P0Utils;

import java.sql.SQLException;
import java.util.List;

/**
 * 记录 数据层 实现类
 *
 * @author ericheel
 */
public class AccDaoImpl implements IAccDao {

    private QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());

    @Override
    public List<Accounting> findAccByUidAndDate(Integer id, String today) throws SQLException {
        final String sql = "SELECT aid,uid,budgetType,bigType,bigDetail,money,remark,aTime FROM accounting WHERE uid = ? AND aTime = ?";
        return queryRunner.query(sql, new BeanListHandler<>(Accounting.class), id, today);
    }
}
