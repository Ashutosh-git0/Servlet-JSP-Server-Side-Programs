/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.pack1.authentication;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author anonymous
 */
public class Login extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param req
     * @param res
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        
        String userName = req.getParameter("userName");
        String userPass = req.getParameter("userPass");
        
        if(userPass.equals("admin")){
            RequestDispatcher rd = req.getRequestDispatcher("welcome-servlet");
            rd.forward(req, res);
        } else {
            pw.println("Sorry UserName or Password is Error");
            RequestDispatcher rd = req.getRequestDispatcher("/index.html");
            rd.include(req, res);
        }
    }


}
