package br.com.seasidevolley.servlet;

import br.com.seasidevolley.dao.UserDAO;
import br.com.seasidevolley.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-user")
public class CreateUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String cpf = req.getParameter("cpf");
        String name = req.getParameter("name");
        String email = req.getParameter("email");

        User user = new User();
        user.setId(id);
        user.setCpf(cpf);
        user.setName(name);
        user.setEmail(email);

        UserDAO userDAO = new UserDAO();
        userDAO.createUser(user);

        resp.sendRedirect("login");
    }
}
