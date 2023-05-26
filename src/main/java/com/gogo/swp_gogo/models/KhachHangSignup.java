package com.gogo.swp_gogo.models;

import jakarta.servlet.http.HttpServletRequest;

public class KhachHangSignup {
    private String email;
    private String password;
    private HttpServletRequest req;
    private String khachHangId;

    public KhachHangSignup(HttpServletRequest req) {
        this.req = req;
    }

    public void setKhachHangId() {
        do {
            khachHangId = MyRandom.generateRandomId(8,"KH");
        } while (DataValidator.isKhachHangValid("idKhachHang",khachHangId));
    }

    private void setEmail() {
        email = req.getParameter("email");
        if (DataValidator.isKhachHangValid("email",email)) {
            email = null;
        }
    }

    public boolean run() {
        setEmail();
        if (email!=null) {
            setKhachHangId();
            setPassword();
            return true;
        }
        return false;
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

    public String getKhachHangId() {
        return khachHangId;
    }
}
