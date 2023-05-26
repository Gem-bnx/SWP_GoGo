package com.gogo.swp_gogo.models;

import java.util.ArrayList;
import java.util.List;

public class DataValidator {
    public static boolean isKhachHangValid(String col, String data) {
        List<String> list = MyQueries.getAllKhachHangInfo(col);
        for (String sample:list) {
            if (sample.equals(data)) return true;
        }
        return false;
    }
}
