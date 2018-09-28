package web.servlet;

import entity.Accounting;
import entity.User;
import service.IAccService;
import service.impl.AccServiceImpl;
import util.DateUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class TodayServlet extends HttpServlet {

    private IAccService accService = new AccServiceImpl();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String today = DateUtils.getToday();
        User loginUser = (User) request.getSession().getAttribute("loginUser");

        try {
            List<Accounting> accList = accService.findAccByUidAndDate(loginUser.getId(), today);
            response.getWriter().print(accList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
