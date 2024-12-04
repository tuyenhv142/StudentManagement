/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.admin;
import Model.hocphi;
import Model.sinhvien;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class LoginAdminController {
    public static List<admin> findAll() {
        List<admin> adminList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;//lấy dữ liệu từ database

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "select * from dangnhap";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                admin std = new admin(
                        resultSet.getString("Username"),
                        resultSet.getString("Password"),
                        resultSet.getString("Quyen"),
                        resultSet.getString("HoTen"),
                        resultSet.getString("Email"),
                        resultSet.getInt("Id"));
                adminList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginAdminController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LoginAdminController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LoginAdminController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return adminList;
    }
    public static admin login(String Username, String Password) {
        admin admin = null;
        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            String sql = "select * from dangnhap where Username = ? and Password = ?";
            statement = (PreparedStatement) conn.prepareStatement(sql);
            statement.setString(1, Username);
            statement.setString(2, Password);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                admin = new admin(
                        resultSet.getString("Username"),
                        resultSet.getString("Password"),
                        resultSet.getString("Quyen"),
                        resultSet.getString("HoTen"),
                        resultSet.getString("Email"),
                        resultSet.getInt("Id")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginAdminController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LoginAdminController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LoginAdminController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return admin;
    }
    public static void update(admin std) {
        Connection connection = null;
        java.sql.PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "update dangnhap set Username=?,Password=?,Quyen=?,HoTen=?,Email=?,ID=? where ID=?";
            statement = connection.prepareCall(sql);

            statement.setString(1, std.getUsername());
            statement.setString(2, std.getPassword());
            statement.setString(3, std.getQuyen());
            statement.setString(4, std.getHoTen());
            statement.setString(5, std.getEmail());
            statement.setInt(6, std.getId());
            statement.setInt(7, std.getId());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(LoginAdminController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LoginAdminController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LoginAdminController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    public static void insert(admin std) {
        Connection connection = null;
        java.sql.PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "insert into dangnhap(Username, Password, Quyen, HoTen, Email) values(?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            statement.setString(1, std.getUsername());
            statement.setString(2, std.getPassword());
            statement.setString(3, std.getQuyen());
            statement.setString(4, std.getHoTen());
            statement.setString(5, std.getEmail());
            //statement.setInt(6, std.getId());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(LoginAdminController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LoginAdminController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LoginAdminController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    public static void delete(int id) {
        Connection connection = null;
        java.sql.PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "delete from dangnhap where Id = ?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, id);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(LoginAdminController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LoginAdminController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LoginAdminController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
    public static List<admin> findByFullname(String TaiKhoan) {
        List<admin> adminList = new ArrayList<>();

        Connection connection = null;
        java.sql.PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "select * from dangnhap where Username like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + TaiKhoan + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                admin std = new admin(
                        resultSet.getString("Username"),
                        resultSet.getString("Password"),
                        resultSet.getString("Quyen"),
                        resultSet.getString("HoTen"),
                        resultSet.getString("Email"),
                        resultSet.getInt("Id"));
                adminList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginAdminController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LoginAdminController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LoginAdminController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return adminList;
    }
}
