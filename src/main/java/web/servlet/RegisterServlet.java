package web.servlet;

import entity.User;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import service.IUserService;
import service.impl.UserServiceImpl;
import util.MD5Utils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * 注册
 *
 * @author ericheel
 */
public class RegisterServlet extends HttpServlet {

    private static IUserService userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");

        try {
            User user = userService.findUserByUsername(username);
            if (null == user) {
                String password = request.getParameter("password");
                userService.createUser(new User(null, username, MD5Utils.generate(password)));
                request.getRequestDispatcher(request.getContextPath() + "index").forward(request, response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
