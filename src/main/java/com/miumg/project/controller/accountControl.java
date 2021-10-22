package com.miumg.project.controller;

import com.miumg.project.manager.BancoExecutionManager;
import com.miumg.project.model.PersonalDocumentEntity;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "accountControl", value = "/account-control")
public class accountControl extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BancoExecutionManager bancoExecutionManager = new BancoExecutionManager();
        RequestDispatcher requestDispatcher = null;
        String action;

        action = request.getParameter("action");

        if(action == null || action.isEmpty() || "back".equals(action)){
            requestDispatcher = request.getRequestDispatcher("show.jsp");
            List<PersonalDocumentEntity> clientList = bancoExecutionManager.clientList();
            request.setAttribute("lista", clientList);

        }else if("new".equals(action)){
            requestDispatcher = request.getRequestDispatcher("view/insert.jsp");

        }else if("insert".equals(action)){
            String nombre = request.getParameter("firstName");
            String apellido = request.getParameter("secondName");
            String dpi = request.getParameter("firstLastName");
            String direccion = request.getParameter("secondLastName");
            String noCuenta = request.getParameter("dpi");

            PersonalDocumentEntity cliente = new PersonalDocumentEntity(0, nombre, apellido, dpi, direccion, noCuenta);
            bancoExecutionManager.insertClient(cliente);

            requestDispatcher = request.getRequestDispatcher("show.jsp");
            List<PersonalDocumentEntity> clientList = bancoExecutionManager.clientList();
            request.setAttribute("lista", clientList);

        }else if("update".equals(action)){
            requestDispatcher = request.getRequestDispatcher("view/modify.jsp");
            Integer idCliente = Integer.parseInt(request.getParameter("profileId"));
            PersonalDocumentEntity cliente = bancoExecutionManager.showClient(idCliente);
            request.setAttribute("cliente", cliente);
        }

        else if("modify".equals(action)){
            Integer idCliente = Integer.parseInt(request.getParameter("profileId"));
            String nombre = request.getParameter("firstName");
            String apellido = request.getParameter("secondName");
            String dpi = request.getParameter("firstLastName");
            String direccion = request.getParameter("secondLastName");
            String noCuenta = request.getParameter("dpi");

            PersonalDocumentEntity cliente = new PersonalDocumentEntity(idCliente, nombre, apellido, dpi, direccion, noCuenta);
            bancoExecutionManager.modifyClient(cliente);

            requestDispatcher = request.getRequestDispatcher("show.jsp");
            List<PersonalDocumentEntity> clientList = bancoExecutionManager.clientList();
            request.setAttribute("lista", clientList);

        }else if("delete".equals(action)){
            Integer idCliente = Integer.parseInt(request.getParameter("profileId"));
            bancoExecutionManager.deleteClient(idCliente);

            requestDispatcher = request.getRequestDispatcher("show.jsp");
            List<PersonalDocumentEntity> clientList = bancoExecutionManager.clientList();
            request.setAttribute("lista", clientList);
        }else {
            requestDispatcher = request.getRequestDispatcher("show.jsp");
            List<PersonalDocumentEntity> clientList = bancoExecutionManager.clientList();
            request.setAttribute("lista", clientList);
        }

        requestDispatcher.forward(request, response);

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        doGet(request, response);
    }

    public void destroy() {
    }
}