package service.impl;

import dao.IAccDao;
import dao.impl.AccDaoImpl;
import entity.Accounting;
import service.IAccService;

import java.sql.SQLException;
import java.util.List;

/**
 * 记录 接口实现
 *
 * @author ericheel
 */
public class AccServiceImpl implements IAccService {

    private IAccDao accDao = new AccDaoImpl();

    @Override
    public List<Accounting> findAccByUidAndDate(Integer id, String today) throws SQLException {
        return accDao.findAccByUidAndDate(id,today);
    }
}
