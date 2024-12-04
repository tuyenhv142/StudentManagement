/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.sinhvien;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MIT
 */
public class LoginUserController {
    public static sinhvien login(String MaSinhVien, String Password) {
        sinhvien sinhvien = null;
        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            String sql = "select * from sinhvien where MaSinhVien = ? and Password = ?";
            statement = (PreparedStatement) conn.prepareStatement(sql);
            statement.setString(1, MaSinhVien);
            statement.setString(2, Password);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                sinhvien = new sinhvien(
                        resultSet.getString("MaSinhVien"),
                        resultSet.getString("HoTen"),
                        resultSet.getString("NamSinh"),
                        resultSet.getString("QueQuan"),
                        resultSet.getString("GioiTinh"),
                        resultSet.getString("Email"),
                        resultSet.getInt("SDT"),
                        resultSet.getString("Password"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginUserController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LoginUserController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LoginUserController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return sinhvien;
    }
    public static List<sinhvien> inFo(String MaSinhVien) {
        List<sinhvien> sinhvienList = new ArrayList<>();

        Connection connection = null;
        java.sql.PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "select * from sinhvien where MaSinhVien like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + MaSinhVien + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                sinhvien std = new sinhvien(resultSet.getString("MaSinhVien"),
                        resultSet.getString("HoTen"),
                        resultSet.getString("NamSinh"),
                        resultSet.getString("QueQuan"),
                        resultSet.getString("GioiTinh"),
                        resultSet.getString("Email"),
                        resultSet.getInt("SDT"));
                sinhvienList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return sinhvienList;
    }
}
