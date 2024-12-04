/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.sinhvien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MIT
 */
public class StudentController {

    public static List<sinhvien> findAll() {
        List<sinhvien> sinhvienList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;//lấy dữ liệu từ database

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "select * from sinhvien";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                sinhvien std = new sinhvien(
                        resultSet.getString("MaSinhVien"),
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

    public static void insert(sinhvien std) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "insert into sinhvien(MaSinhVien, HoTen, NamSinh, QueQuan, GioiTinh, Email, SDT) values(?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            statement.setString(1, std.getMaSinhVien());
            statement.setString(2, std.getHoTen());
            statement.setString(3, std.getNamSinh());
            statement.setString(4, std.getQueQuan());
            statement.setString(5, std.getGioiTinh());
            statement.setString(6, std.getEmail());
            statement.setInt(7, std.getSDT());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, "Lỗi thêm sinh viên", ex);
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
    }

    public static void update(sinhvien std) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "update sinhvien set MaSinhVien=?,HoTen=?,NamSinh=?,QueQuan=?,GioiTinh=?,Email=?,SDT=? where MaSinhVien=?";
            statement = connection.prepareCall(sql);

            statement.setString(1, std.getMaSinhVien());
            statement.setString(2, std.getHoTen());
            statement.setString(3, std.getNamSinh());
            statement.setString(4, std.getQueQuan());
            statement.setString(5, std.getGioiTinh());
            statement.setString(6, std.getEmail());
            statement.setInt(7, std.getSDT());
            statement.setString(8, std.getMaSinhVien());

            statement.execute();
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
    }

    public static void delete(String MaSinhVien) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "delete from sinhvien where MaSinhVien = ?";
            statement = connection.prepareCall(sql);

            statement.setString(1, MaSinhVien);

            statement.execute();
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
    }

    public static List<sinhvien> findByFullname(String HoTen) {
        List<sinhvien> sinhvienList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "select * from sinhvien where HoTen like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + HoTen + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                sinhvien std = new sinhvien(
                        resultSet.getString("MaSinhVien"),
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
    public static void DoiMatKhau(sinhvien std) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "update sinhvien set MaSinhVien=?,HoTen=?,NamSinh=?,QueQuan=?,GioiTinh=?,Email=?,SDT=?,Password=? where MaSinhVien=?";
            statement = connection.prepareCall(sql);

            statement.setString(1, std.getMaSinhVien());
            statement.setString(2, std.getHoTen());
            statement.setString(3, std.getNamSinh());
            statement.setString(4, std.getQueQuan());
            statement.setString(5, std.getGioiTinh());
            statement.setString(6, std.getEmail());
            statement.setInt(7, std.getSDT());
            statement.setString(8, std.getPassword());
            statement.setString(9, std.getMaSinhVien());

            statement.execute();
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
    }

}
