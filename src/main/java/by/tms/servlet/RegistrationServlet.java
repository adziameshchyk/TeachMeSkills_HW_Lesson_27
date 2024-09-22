package by.tms.servlet;

import by.tms.entity.User;
import by.tms.service.UserService;
import by.tms.service.UserStorageService;
import by.tms.storage.UserStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {

    UserService userService = new UserService(new UserStorageService(UserStorage.getInstance()));

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/reg.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        User user = new User(name, login, password);
        boolean userIsAdded = userService.addUser(user);
        req.setAttribute("userIsAdded", userIsAdded);
        getServletContext().getRequestDispatcher("/reg.jsp").forward(req, resp);
    }
}
