/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Model.hocphi;
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
public class HocphiController {

    public static List<hocphi> all() {
        List<hocphi> hocphiList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;//lấy dữ liệu từ database

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "select * from hocphi";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                hocphi std = new hocphi(
                        resultSet.getString("MaHocPhi"),
                        resultSet.getString("HocKi"),
                        resultSet.getString("NamHoc"),
                        resultSet.getInt("TongTien"),
                        resultSet.getString("TrangThai"),
                        resultSet.getString("MaSinhVien"));
                hocphiList.add(std);
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

        return hocphiList;
    }

    public static void insert(hocphi std) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "insert into hocphi(MaHocPhi, HocKi, NamHoc, TongTien, TrangThai, MaSinhVien) values(?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            statement.setString(1, std.getMaHocPhi());
            statement.setString(2, std.getHocKi());
            statement.setString(3, std.getNamHoc());
            statement.setInt(4, std.getTongTien());
            statement.setString(5, std.getTrangThai());
            statement.setString(6, std.getMaSinhVien());
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

    public static void update(hocphi std) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "update hocphi set MaHocPhi=?,HocKi=?,NamHoc=?,TongTien=?,TrangThai=?,MaSinhVien=? where MaHocPhi=?";
            statement = connection.prepareCall(sql);

            statement.setString(1, std.getMaHocPhi());
            statement.setString(2, std.getHocKi());
            statement.setString(3, std.getNamHoc());
            statement.setInt(4, std.getTongTien());
            statement.setString(5, std.getTrangThai());
            statement.setString(6, std.getMaSinhVien());
            statement.setString(7, std.getMaHocPhi());

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

    public static void delete(String MaHocPhi) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "delete from hocphi where MaHocPhi = ?";
            statement = connection.prepareCall(sql);

            statement.setString(1, MaHocPhi);

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

    public static List<hocphi> findByFullname(String MaSinhVien) {
        List<hocphi> hocphiList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "select * from hocphi where MaSinhVien like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + MaSinhVien + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                hocphi std = new hocphi(
                        resultSet.getString("MaHocPhi"),
                        resultSet.getString("HocKi"),
                        resultSet.getString("NamHoc"),
                        resultSet.getInt("TongTien"),
                        resultSet.getString("TrangThai"),
                        resultSet.getString("MaSinhVien"));
                hocphiList.add(std);
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

        return hocphiList;
    }
    public static List<hocphi> inFo(String MaSinhVien) {
        List<hocphi> hocphiList = new ArrayList<>();

        Connection connection = null;
        java.sql.PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "");

            //query
            String sql = "select * from hocphi where MaSinhVien like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + MaSinhVien + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                hocphi std = new hocphi(resultSet.getString("MaHocPhi"),
                        resultSet.getString("HocKi"),
                        resultSet.getString("NamHoc"),
                        resultSet.getInt("TongTien"),
                        resultSet.getString("TrangThai"));
                hocphiList.add(std);
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

        return hocphiList;
    }
}
