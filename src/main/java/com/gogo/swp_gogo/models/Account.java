package com.gogo.swp_gogo.models;

import jakarta.servlet.http.HttpServletRequest;

public interface Account {

    void login();
    default boolean signup(HttpServletRequest request) {
        KhachHangSignup khachHangSignup = new KhachHangSignup(request);
        if (khachHangSignup.run()) {
            MyQueries.addKhachHang(khachHangSignup);
            return true;
        } else return false;
    };
}
