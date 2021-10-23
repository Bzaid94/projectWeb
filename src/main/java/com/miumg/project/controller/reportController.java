package com.miumg.project.controller;

import com.miumg.project.manager.ReportExecutionManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "reportController", value = "/report-Controller")
public class reportController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; filename=\"Reporte.csv\"");

        response.setContentType("text/csv");
        String create = request.getParameter("create");

        if("generate".equals(create)){
            ReportExecutionManager reportExecutionManager = new ReportExecutionManager();
            reportExecutionManager.createdReport(response);

            response.sendRedirect("show.jsp");
            System.out.println("Ok");
        }else{
            System.out.println("Fuck");
        }
    }
}