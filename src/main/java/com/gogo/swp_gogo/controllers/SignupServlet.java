package com.gogo.swp_gogo.controllers;

import com.gogo.swp_gogo.models.KhachHang;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name="signupServlet", value = "/GoGoSignup")
public class SignupServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello World");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        KhachHang khachHang = new KhachHang();
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("");
        if (!khachHang.signup(req)) {
            req.setAttribute("status","fail");
        }
        req.setAttribute("status","succeed");
        requestDispatcher.forward(req,resp);
    }
}
