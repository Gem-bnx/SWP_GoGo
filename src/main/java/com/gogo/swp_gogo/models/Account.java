package com.gogo.swp_gogo.models;

import jakarta.servlet.http.HttpServletRequest;

public interface Account {

    void login();
    default void signup(HttpServletRequest request) {
        KhachHangSignup khachHangSignup = new KhachHangSignup(request);
    };
}
