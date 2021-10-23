package com.miumg.project.controller;

import com.miumg.project.manager.BancoExecutionManager;
import com.miumg.project.model.LoginEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "loginController", value = "/login-Controller")
public class loginController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String auth = request.getParameter("auth");

        if ("login".equals(auth)) {
            login(request, response);
        } else if ("logout".equals(auth)) {
            logout(request, response);
        }
    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String passAsig = request.getParameter("passAsign");

        BancoExecutionManager bancoExecutionManager = new BancoExecutionManager();
        LoginEntity loginEntity = bancoExecutionManager.startSession(userName, passAsig);

        if (loginEntity == null) {
            request.setAttribute("message", "Usuario y/o Contraseña no válida");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("loginEntity", loginEntity);
            response.sendRedirect("show.jsp");
        }
    }

    private void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        request.setAttribute("message", "Sesión finalizada.");
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
