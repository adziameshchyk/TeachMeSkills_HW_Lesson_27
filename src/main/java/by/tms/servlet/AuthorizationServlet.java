package by.tms.servlet;

import by.tms.service.UserService;
import by.tms.service.UserStorageService;
import by.tms.storage.UserStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/auth")
public class AuthorizationServlet extends HttpServlet {

    UserService userService = new UserService(new UserStorageService(UserStorage.getInstance()));

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/auth.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if (userService.authorization(login, password)) {
            getServletContext().getRequestDispatcher("/calc.jsp").forward(req, resp);
        } else {
            req.setAttribute("authIsFailed", true);
            getServletContext().getRequestDispatcher("/auth.jsp").forward(req, resp);
        }
    }
}
