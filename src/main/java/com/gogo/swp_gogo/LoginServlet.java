package com.gogo.swp_gogo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="loginServlet", value = "/GoGoLogin")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("hello World");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {

    }
}
