/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.xeploai;
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
public class XepLoaiController {
    public static List<xeploai> all() {
        List<xeploai> xeploaiList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;//lấy dữ liệu từ database

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "select * from xeploai";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                xeploai std = new xeploai(
                        resultSet.getString("MaXepLoai"),
                        resultSet.getString("MaSinhVien"),
                        resultSet.getString("HocKy"),
                        resultSet.getString("NamHoc"),
                        resultSet.getString("XepLoai"));
                xeploaiList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocphiController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HocphiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HocphiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return xeploaiList;
    }

    public static void insert(xeploai std) {
        Connection connection = null;
        PreparedStatement statement = null;
        int check = 0;
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "insert into xeploai(MaXepLoai,MaSinhVien, HocKy, NamHoc, XepLoai) values(?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            statement.setString(1, std.getMaXepLoai());
            statement.setString(2, std.getMaSinhVien());
            statement.setString(3, std.getHocKy());
            statement.setString(4, std.getNamHoc());
            statement.setString(5, std.getXepLoai());
            statement.execute();
            check = 1;
        } catch (SQLException ex) {
            Logger.getLogger(HocphiController.class.getName()).log(Level.SEVERE, null, ex);
            check = 2;
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HocphiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HocphiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static void update(xeploai std) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "update xeploai set MaXepLoai=?,MaSinhVien=?,HocKy=?,NamHoc=?,XepLoai=? where MaXepLoai=?";
            statement = connection.prepareCall(sql);

            statement.setString(1, std.getMaXepLoai());
            statement.setString(2, std.getMaSinhVien());
            statement.setString(3, std.getHocKy());
            statement.setString(4, std.getNamHoc());
            statement.setString(5, std.getXepLoai());
            statement.setString(6, std.getMaXepLoai());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HocphiController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HocphiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HocphiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static void delete(String MaXepLoai) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "delete from xeploai where MaXepLoai = ?";
            statement = connection.prepareCall(sql);

            statement.setString(1, MaXepLoai);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HocphiController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HocphiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HocphiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static List<xeploai> findByFullname(String MaSinhVien) {
        List<xeploai> xeploaiList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "select * from xeploai where MaSinhVien like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + MaSinhVien + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                xeploai std = new xeploai(
                        resultSet.getString("MaXepLoai"),
                        resultSet.getString("MaSinhVien"),
                        resultSet.getString("HocKy"),
                        resultSet.getString("NamHoc"),
                        resultSet.getString("XepLoai"));
                xeploaiList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocphiController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HocphiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HocphiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return xeploaiList;
    }

    public static List<xeploai> inFo(String NamHoc) {
        List<xeploai> xeploaiList = new ArrayList<>();

        Connection connection = null;
        java.sql.PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "select * from xeploai where NamHoc like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + NamHoc + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                xeploai std = new xeploai(
                        resultSet.getString("MaXepLoai"),
                        resultSet.getString("MaSinhVien"),
                        resultSet.getString("HocKy"),
                        resultSet.getString("NamHoc"),
                        resultSet.getString("XepLoai"));
                xeploaiList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HocphiController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HocphiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(HocphiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return xeploaiList;
    }
}
