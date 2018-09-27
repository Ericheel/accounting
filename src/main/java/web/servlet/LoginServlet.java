package web.servlet;

import entity.User;
import service.IUserService;
import service.impl.UserServiceImpl;
import util.MD5Utils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class LoginServlet extends HttpServlet {

    private static IUserService userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        try {
            User user = userService.findUserByUsername(username);
            if (null == user) {
                request.getSession().setAttribute("loginError", "账号错误");
                request.getRequestDispatcher(request.getContextPath() + "index.jsp").forward(request, response);
            } else {
                String password = request.getParameter("password");
                if (MD5Utils.verify(password, user.getPassword())) {
                    request.getSession().setAttribute("loginUser", user);
                    request.getRequestDispatcher(request.getContextPath() + "/main/home.jsp").forward(request, response);
                } else {
                    request.getSession().setAttribute("loginError", "密码错误");
                    request.getRequestDispatcher(request.getContextPath() + "index.jsp").forward(request, response);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
