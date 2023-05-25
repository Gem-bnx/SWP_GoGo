package com.gogo.swp_gogo.models;

import java.util.ArrayList;

public class DataValidator {
    public static boolean isKhachHangIdExist(String userId) {
        ArrayList<User> userList = MyQueries.getAllUsers();
        for (User u:userList) {
            if (u.getUserId().equals(userId)) return true;
        }
        return false;
    }
}
