package com.derivedmed.servlets;

import javax.jms.Session;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Servlet for handling 1st page.
 */
@WebServlet(name = "ReqController1")
public class ReqController1 extends HttpServlet {
    private int hours;
    private int minutes;
    private int time;
    private double volume;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        setSDTime(request, response);
        setSystemVolume(request,response);
        HttpSession session = request.getSession();
        session.setAttribute("range",request.getParameter("range"));
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/page2.jsp");
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("index.jsp");
    }

    private void setSDTime(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        hours = Integer.parseInt(request.getParameter("hours")) * 1000;
        minutes = Integer.parseInt(request.getParameter("minutes")) * 1000;
        time = hours + minutes;
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("shutdown -s -t " + time);
    }

    private void setSystemVolume(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        volume = Integer.parseInt(request.getParameter("range"));
        volume=volume*655;
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("C:\\nircmd\\nircmd.exe setsysvolume "+volume);
    }


}
