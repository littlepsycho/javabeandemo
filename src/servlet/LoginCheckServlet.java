package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

import service.UserCheck;
import dto.User;

@WebServlet("/LoginCheckServlet")

public class LoginCheckServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("GBK");
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        User user = new User();
        user.setName(name);
        user.setPwd(pwd);
        UserCheck uc = new UserCheck();
        if (uc.validate(user)) {
            request.setAttribute("user", user);
            RequestDispatcher dis = request
                    .getRequestDispatcher("LoginSuccess.jsp");
            dis.forward(request, response);
        } else {
            response.sendRedirect("LoginCheck.jsp");
        }
    }

}

