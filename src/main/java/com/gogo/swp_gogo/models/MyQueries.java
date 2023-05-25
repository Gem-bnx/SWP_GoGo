package com.gogo.swp_gogo.models;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MyQueries {

    private static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:1433;database=GoGo;encrypt=false;trustServerCertificate=true";
            Connection connection = DriverManager.getConnection(connectionUrl,"sa","140801");
            return connection;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Cannot connect to the database");
            ex.printStackTrace();
        }
        return null;
    }

    public static ArrayList<KhachHang> getAllKhachHang() {
        Connection connection = getConnection();
        ArrayList<KhachHang> list = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("Select * from GoGo.dbo.KhachHang");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                KhachHang khachHang = new KhachHang();
                list.add(khachHang);
            }
            connection.close();
        } catch (SQLException | ParseException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
