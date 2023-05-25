package com.gogo.swp_gogo.models;

import jakarta.servlet.http.HttpServletRequest;

public class KhachHangSignup {
    private String email;
    private String password;
    private HttpServletRequest req;
    private String khachHangId;

    public KhachHangSignup(HttpServletRequest req) {
        this.req = req;
        setEmail();
        setPassword();
    }

    public void setKhachHangId() {
        khachHangId = MyRandom.generateRandomId(8,"KH");
    }

    private void setEmail() {
        email = req.getParameter("email");
    }

    private void setPassword() {
        password = req.getParameter("password");
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
