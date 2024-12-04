/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.diem;
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
public class DiemControler {

    public static List<diem> all() {
        List<diem> diemList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;//lấy dữ liệu từ database

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "select * from diem";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                diem std = new diem(
                        resultSet.getString("MaMonHoc"),
                        resultSet.getString("TenMon"),
                        resultSet.getInt("DiemCC"),
                        resultSet.getInt("DiemGK"),
                        resultSet.getInt("DiemCK"),
                        resultSet.getString("MaSinhVien"));
                diemList.add(std);
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

        return diemList;
    }

    public static void insert(diem std) {
        Connection connection = null;
        PreparedStatement statement = null;
        int check = 0;
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "insert into diem(MaMonHoc, TenMon, DiemCC, DiemGK, DiemCK, MaSinhVien) values(?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            statement.setString(1, std.getMaMonHoc());
            statement.setString(2, std.getTenMon());
            statement.setInt(3, std.getDiemCC());
            statement.setInt(4, std.getDiemGK());
            statement.setInt(5, std.getDiemCK());
            statement.setString(6, std.getMaSinhVien());
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

    public static void update(diem std) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "update diem set MaMonHoc=?,TenMon=?,DiemCC=?,DiemGK=?,DiemCK=?,MaSinhVien=? where MaMonHoc=?";
            statement = connection.prepareCall(sql);

            statement.setString(1, std.getMaMonHoc());
            statement.setString(2, std.getTenMon());
            statement.setInt(3, std.getDiemCC());
            statement.setInt(4, std.getDiemGK());
            statement.setInt(5, std.getDiemCK());
            statement.setString(6, std.getMaSinhVien());
            statement.setString(7, std.getMaMonHoc());

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

    public static void delete(String MaMonHoc) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "delete from diem where MaMonHoc = ?";
            statement = connection.prepareCall(sql);

            statement.setString(1, MaMonHoc);

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

    public static List<diem> findByFullname(String MaSinhVien) {
        List<diem> diemList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "select * from diem where MaSinhVien like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + MaSinhVien + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                diem std = new diem(
                        resultSet.getString("MaMonHoc"),
                        resultSet.getString("TenMon"),
                        resultSet.getInt("DiemCC"),
                        resultSet.getInt("DiemGK"),
                        resultSet.getInt("DiemCK"),
                        resultSet.getString("MaSinhVien"));
                diemList.add(std);
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

        return diemList;
    }

    public static List<diem> inFo(String MaSinhVien) {
        List<diem> diemList = new ArrayList<>();

        Connection connection = null;
        java.sql.PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "select * from diem where MaSinhVien like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + MaSinhVien + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                diem std = new diem(
                        resultSet.getString("MaMonHoc"),
                        resultSet.getString("TenMon"),
                        resultSet.getInt("DiemCC"),
                        resultSet.getInt("DiemGK"),
                        resultSet.getInt("DiemCK"));
                diemList.add(std);
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

        return diemList;
    }
}
