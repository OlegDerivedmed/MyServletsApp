package com.derivedmed.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Servlet for handling 2nd  page.
 */
@WebServlet(name = "ReqController2")
public class ReqController2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Runtime runtime = Runtime.getRuntime();
        Process proc = runtime.exec("shutdown -a");
        Integer volume = Integer.parseInt(request.getParameter("range"));
        volume=volume*655;
        runtime.exec("C:\\nircmd\\nircmd.exe setsysvolume "+volume);
        request.getSession().setAttribute("range",request.getParameter("range"));
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
